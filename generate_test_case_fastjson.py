import re
import requests
import json
from prompts import instruct_prompt_large_2, instruct_prompt_large_1
from tqdm import tqdm
import logging
import time
import signal

url = 'http://localhost:11434/api/generate'
logging.basicConfig(filename='log/log_file_fastjson.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')


with open('out.json', 'r') as file:
    json_data = json.load(file)

# 处理JSON流
def process_json_stream(json_stream):
    concatenated_responses = ""
    for line in json_stream.split('\n'):
        if line.strip():  # 确保行不为空
            try:
                data = json.loads(line)
                if 'response' in data:
                    concatenated_responses += data['response']
            except json.JSONDecodeError as e:
                print(f"Ignoring invalid JSON: {e}")

    # result = {"concatenated_responses": concatenated_responses}
    # return json.dumps(result, ensure_ascii=False)
    return concatenated_responses

# 处理返回内容
def parse_ret(ret: str):
    output = ""
    if "```" in ret:
        # 如果返回内容中包括```，则进行提取
        pattern = r"```java\n([\s\S]*?)\n```"
        matches = re.findall(pattern, ret)
        if matches:
            output = matches[0]
        else:
            output = ret.split("```")[1]
    elif "[JAVA]" in ret:
        # 如果返回内容中包括[JAVA]，则进行提取
        pattern = r"\[JAVA\]([\s\S]*?)\[/JAVA\]"
        matches = re.findall(pattern, ret)
        if matches:
            output = matches[0]
    else:
        output = ret
    return output

# 生成测试用例框架
def test_case_info(package_name, class_name, method_name):
    test_info = "package " + package_name + ";\n\n"
    test_info += "import org.junit.jupiter.api.*;\n"
    test_info += "import static org.junit.jupiter.api.Assertions.*;\n\n"

    test_info += "public class " + class_name + "Test {\n"
    test_info += "    @Test\n"
    test_info += "    public void " + method_name + "Test() {\n"
    test_info += "        <FILL>\n"
    test_info += "    }\n"
    test_info += "}"
    return test_info

# 使用signal模块设置超时时间，防止程序长时间运行
class TimeoutException(Exception):
    """ Simple Exception to be called on timeouts. """
    pass
def _timeout(signum, frame):
    """ Raise an TimeoutException.

    This is intended for use as a signal handler.
    The signum and frame arguments passed to this are ignored.

    """
    raise TimeoutException()

# 调用codellama接口生成测试用例
def codallama_interface(json_data, i, mode):
    if mode == 0:
        file_path = 'SourceCodeOnly/'
        data = {
            "model": "codellama:13b-instruct",
            "prompt": instruct_prompt_large_1(source_code, test_info)
        }
    elif mode == 1:
        file_path = 'SourceCode&Full/'
        data = {
            "model": "codellama:13b-instruct",
            "prompt": instruct_prompt_large_2(source_code, full_context, test_info)
        }
    elif mode == 2:
        file_path = 'SourceCode&Simple/'
        data = {
            "model": "codellama:13b-instruct",
            "prompt": instruct_prompt_large_2(source_code, simple_context, test_info)
        }
    else:
        return
    
    source_code = json_data[i]['code']
    full_context = json_data[i]['file_content']
    simple_context = json_data[i]['all_context']
    test_info = test_case_info(json_data[i]['package'], json_data[i]['class_name'], json_data[i]['method_name'])
    record = []
    with open(file_path + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.txt', 'w') as file:
        file.write("Source code: \n\n")
        file.write(source_code + "\n\n\n")
        for j in tqdm(range(10)):
            headers = {'Content-Type': 'application/json'}
            flag = 0
            signal.signal(signal.SIGALRM, _timeout)
            signal.alarm(180) 
            try:
                response = requests.post(url, data=json.dumps(data), headers=headers, timeout=180)
            except Exception as e:
                output = "Timeout"
                logging.error(e)
                flag = 1
            finally:
                signal.alarm(0)
            if flag == 0:
                output = process_json_stream(response.text)
                logging.info("-------------generate result:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
                output = parse_ret(output)
            file.write("No." + str(j + 1) + " generated result --------------------------\n\n")
            file.write(output + "\n\n\n")
            file.flush()
            record.append(output)
    with open(file_path + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.json', 'w') as file:
        json.dump(record, file)



for i in range(0, len(json_data)):

    # TODO
    # 这儿需要注意的是，有些函数是名字相同，形参不同，而生成结果的保存文件是class_name + method_name，所以会出现覆盖的情况，需要修改一下。

    codallama_interface(json_data, i, 0)
    codallama_interface(json_data, i, 1)
    codallama_interface(json_data, i, 2)

    # source_code = json_data[i]['code']
    # logging.info("-------------source code-------------\n " + source_code + "----------------------------------\n")
    # full_context = json_data[i]['file_content']
    # simple_context = json_data[i]['all_context']
    # test_info = test_case_info(json_data[i]['package'], json_data[i]['class_name'], json_data[i]['method_name'])
    # logging.info("-------------test info-------------\n " + test_info + "----------------------------------\n")
    
    # # source code only
    # source_code_only = []
    # with open('SourceCodeOnly/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.txt', 'w') as file:
    #     file.write("Source code: \n\n")
    #     file.write(source_code + "\n\n\n")
    #     for j in tqdm(range(10)):
    #         data = {
    #             "model": "codellama:13b-instruct",
    #             "prompt": instruct_prompt_large_1(source_code, test_info)
    #         }
    #         headers = {'Content-Type': 'application/json'}
    #         flag = 0
    #         signal.signal(signal.SIGALRM, _timeout)
    #         signal.alarm(180) 
    #         try:
    #             response = requests.post(url, data=json.dumps(data), headers=headers, timeout=180)
    #         except Exception as e:
    #             output = "Timeout"
    #             logging.error(e)
    #             flag = 1
    #         finally:
    #             signal.alarm(0)
    #         if flag == 0:
    #             output = process_json_stream(response.text)
    #             logging.info("-------------source code only:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
    #             output = parse_ret(output)
    #         file.write("No." + str(j + 1) + " generated result --------------------------\n\n")
    #         file.write(output + "\n\n\n")
    #         file.flush()
    #         source_code_only.append(output)
    # with open('SourceCodeOnly/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.json', 'w') as file:
    #     json.dump(source_code_only, file)

    # # source code + full context
    # source_code_full = []
    # with open('SourceCode&Full/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.txt', 'w') as file:
    #     file.write("Source code: \n\n")
    #     file.write(source_code + "\n\n\n")
    #     for j in tqdm(range(10)):
    #         data = {
    #             "model": "codellama:13b-instruct",
    #             "prompt": instruct_prompt_large_2(source_code, full_context, test_info)
    #         }
    #         headers = {'Content-Type': 'application/json'}
    #         flag = 0
    #         signal.signal(signal.SIGALRM, _timeout)
    #         signal.alarm(180) 
    #         try:
    #             response = requests.post(url, data=json.dumps(data), headers=headers, timeout=180)
    #         except Exception as e:
    #             output = "Timeout"
    #             logging.info("-------------source code + full context:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
    #             flag = 1
    #         finally:
    #             signal.alarm(0)
    #         if flag == 0:
    #             output = process_json_stream(response.text)
    #             logging.info("-------------source code + full context:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
    #             output = parse_ret(output)
    #         file.write("No." + str(j + 1) + " generated result --------------------------\n\n")
    #         file.write(output + "\n\n\n")
    #         file.flush()
    #         source_code_full.append(output)
    # with open('SourceCode&Full/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.json', 'w') as file:
    #     json.dump(source_code_full, file)

    # # source code + simple context
    # source_code_simple = []
    # with open('SourceCode&Simple/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.txt', 'w') as file:
    #     file.write("Source code: \n\n")
    #     file.write(source_code + "\n\n\n")
    #     for j in tqdm(range(10)):
    #         data = {
    #             "model": "codellama:13b-instruct",
    #             "prompt": instruct_prompt_large_2(source_code, simple_context, test_info)
    #         }
    #         headers = {'Content-Type': 'application/json'}
    #         flag = 0
    #         signal.signal(signal.SIGALRM, _timeout)
    #         signal.alarm(180) 
    #         try:
    #             response = requests.post(url, data=json.dumps(data), headers=headers, timeout=180)
    #         except Exception as e:
    #             output = "Timeout"
    #             logging.info("-------------source code + simple context:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
    #             flag = 1
    #         finally:
    #             signal.alarm(0)
    #         if flag == 0:
    #             output = process_json_stream(response.text)
    #             logging.info("-------------source code + simple context:" + str(j + 1) + "-------------\n " + output + "----------------------------------\n")
    #             output = parse_ret(output)
    #         file.write("No." + str(j + 1) + " generated result --------------------------\n\n")
    #         file.write(output + "\n\n\n")
    #         file.flush()
    #         source_code_simple.append(output)
    # with open('SourceCode&Simple/' + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '.json', 'w') as file:
    #     json.dump(source_code_simple, file)

