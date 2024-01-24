import re
import json
from prompts import instruct_prompt_large_2, instruct_prompt_large_1
from tqdm import tqdm
import time
import logging
import signal
import os
from openai import OpenAI

# 设置 API key 和 API base URL
# api_key = "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"
api_key = "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"
# base_url = "https://api.132999.xyz/v1"

client = OpenAI(
    api_key=api_key
)

logging.basicConfig(filename='log/log_file_generate_gpt4.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')

def gpt_interface(content, model='gpt-4-1106-preview', flag=0) -> str:
    """
    Call the chatgpt-3.5 interface to generate test cases with data.
    """
    try:
        chat_completion = client.chat.completions.create(
            messages=[
                {
                    "role": "user",
                    "content": content,
                }
            ],
            model=model,
        )
    except Exception as e:
        logging.error("Error: " + str(e))
        time.sleep(60)
        if flag < 3:
            logging.info("retry after 60s: " + str(flag + 1))
            return gpt_interface(content, model, flag + 1)
        else:
            logging.info("max retry times reached, return timeout")
            output = "timeout"
    if flag < 3:
        # output = process_json_stream(response.text)
        output = chat_completion.choices[0].message.content
        logging.info("\n-------------generate result-------------\n " + output + "----------------------------------\n")
        output = parse_ret(output)
    return output

def parse_ret(ret: str):
    """
    Parse the response content and extract the code.
    """
    output = ""
    if "```" in ret:
        pattern = r"```java\n([\s\S]*?)\n```"
        matches = re.findall(pattern, ret)
        if matches:
            output = matches[0]
        else:
            output = ret.split("```")[1]
    elif "[JAVA]" in ret:
        pattern = r"\[JAVA\]([\s\S]*?)\[/JAVA\]"
        matches = re.findall(pattern, ret)
        if matches:
            output = matches[0]
    else:
        output = ret
    return output

def test_case_info(package_name, class_name, method_name):
    """
    Generate test case information(for prompt).
    """
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

# signal handler
class TimeoutException(Exception):
    """ Simple Exception to be called on timeouts. """
    pass
def _timeout(signum, frame):
    """ Raise an TimeoutException.
    This is intended for use as a signal handler.
    The signum and frame arguments passed to this are ignored.
    """
    raise TimeoutException()

# Call the codellama interface to generate test cases
def generate_test(json_data, path, number=10):
    """
    Generate test cases based on the given JSON data.

    Args:
        json_data (list): A list of dictionaries containing the JSON data.
        path (str): The path where the generated test cases will be saved.
        number (int, optional): The number of test cases to generate. Defaults to 10.
    """
    for i in tqdm(range(0, len(json_data))):
        source_code = json_data[i]['source_code']
        full_context = json_data[i]['full_context']
        simple_context = json_data[i]['simple_context']
        test_info = test_case_info(json_data[i]['package'], json_data[i]['class_name'], json_data[i]['method_name'])

        file_path = ['SourceCodeOnly/', 'SourceCode&Full/', 'SourceCode&Simple/']
        prompts = [instruct_prompt_large_1(source_code, test_info), instruct_prompt_large_2(source_code, full_context, test_info), instruct_prompt_large_2(source_code, simple_context, test_info)]
        second_path = path + json_data[i]['class_name'] + '_' + json_data[i]['method_name'] + '_' + str(i) + '/'
        if not os.path.exists(second_path):
            os.makedirs(second_path)
        for j in range(3):
            if j == 1:
                third_path = second_path + file_path[j]
                if not os.path.exists(third_path):
                    os.makedirs(third_path)
                record = []
                data = prompts[j]
                with open(third_path + "result.txt", 'w') as file:
                    file.write("Source code: \n\n")
                    file.write(source_code + "\n\n\n")
                    logging.info("\n-------------source code-------------\n " + source_code + "----------------------------------\n")
                    for k in range(number): 
                        logging.info("No." + str(k + 1) + " generated result for " + third_path + " -- " + "\n")
                        # if j == 1: # 由于gpt4接口昂贵，先跳过full context的生成
                        #     output = "null"
                        # else:
                        output = gpt_interface(data)
                        file.write("No." + str(k + 1) + " generated result --------------------------\n\n")
                        file.write(output + "\n\n\n")
                        file.flush()
                        record.append(output)
                with open(third_path + "result.json", 'w') as file:
                    record_data = {
                        "project_name": json_data[i]['project_name'],
                        "file_name": json_data[i]['file_name'],
                        "relative_path": json_data[i]['relative_path'],
                        "execute_path": json_data[i]['execute_path'],
                        "package": json_data[i]['package'],
                        "docstring": json_data[i]['docstring'],
                        "source_code": json_data[i]['source_code'],
                        "class_name": json_data[i]['class_name'],
                        "method_name": json_data[i]['method_name'],
                        "arguments": json_data[i]['argument_name'],
                        "generate_test": record
                    }
                    json.dump(record_data, file, indent=4)


if __name__ == "__main__":
    file_list = []
    source_file_path = "source_file_parser_for_4/"

    for file_name in os.listdir(source_file_path):
        if file_name.endswith(".json"):
            file_list.append(os.path.join(source_file_path, file_name))

    for file_name in file_list:
        project_name = file_name.split('/')[-1].split('.')[0]
        with open(file_name, 'r') as file:
            json_data = json.load(file)
        generate_test(json_data, 'gpt4_generate_result/' + project_name + '/', 10)

    # print(gpt_interface("hello world"))

# 这部分是跑code only和simple context部分
# 这儿记录一下，现在跑的是jfreechart，一共6个method，顺利
# 待会跑Java，里面有35个method，跑完之后再跑其他的
# Java跑的达到接口限制，有的method没有得出结果，根据log观察是31，33，34这三个method存在部分的timeout
# 之后跑的是Jeecg Boot项目，基本顺利（存在一个timeout，不影响整体内容）（token花费较大，可能是项目差异）
# 之后跑了lang 和jctools，一切顺利
# 跑zxing，一切顺利
# 跑apollo，一切顺利
# 跑javacv，一切顺利
# 跑math，一切顺利
        
# 这部分是跑full context部分
# 先跑lang，一切顺利，就是有点费token，一次生成花费大约9k token，折合过来生成一个method的10个full context内容大约需要$1，而有108个method
# 之后跑java，生产了20个，等token后再生成剩余15个
