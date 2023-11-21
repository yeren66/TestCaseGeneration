import re
import requests
import json
from prompts import instruct_prompt
from source_code_extract import java_files_content
import javalang
from tqdm import tqdm
import logging

url = 'http://localhost:11434/api/generate'
logging.basicConfig(filename='log_file.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')


# 用于处理JSON流的函数
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
    else:
        # 否则对可能存在的Note增加注释
        pattern = r"Note:"
        replacement = "#\\g<0>"
        output = re.sub(pattern, replacement, ret)
    return output

def handle_ret(generate_code: str, source_code: str):
    try:
        source_tree = javalang.parse.parse(source_code)
        generate_tree = javalang.parse.parse(generate_code)
    except:
        return "Syntax Error"
    
    source_package_name = source_tree.package.name
    source_class_name = source_tree.types[0].name 
    source_method_name = source_tree.types[0].body[0].name 

    try:
        generate_package_name = generate_tree.package.name
    except AttributeError:
        generate_code = "package humaneval;\n" + generate_code
        generate_package_name = "humaneval";
    generate_class_name = generate_tree.types[0].name

    # 修改test case的package name
    if generate_package_name != "humaneval":
        generate_code = re.sub(generate_package_name, "humaneval", generate_code)
    
    # 修改test case调用的方法名，使之可用
    generate_code = re.sub(" " + source_method_name, " " + source_package_name + "." + source_class_name + "." + source_method_name, generate_code)
    generate_code = re.sub(" " + source_class_name + "." + source_method_name, " " + source_package_name + "." + source_class_name + "." + source_method_name, generate_code)

    # 修改test case的类名
    generate_code = re.sub("public class " + generate_class_name, "public class " + source_class_name + "Test", generate_code)

    return generate_code, source_class_name + "Test"

if __name__ == "__main__":
    for i in tqdm(range(38, len(java_files_content))):
        logging.info('\n--------------- source code ---------------\n')
        logging.info('\n' + java_files_content[i])
        index = 0
        error_index = 0
        while 1:
            if index == 1:
                break
            data = {
                "model": "codellama:13b-instruct",
                "prompt": instruct_prompt(java_files_content[i])
            }
            headers = {'Content-Type': 'application/json'}
            response = requests.post(url, data=json.dumps(data), headers=headers)
            output = process_json_stream(response.text)
            logging.info('\n--------------- generate content ---------------\n')
            logging.info('\n' + output)
            output = parse_ret(output)
            ret = handle_ret(output, java_files_content[i])
            if ret == "Syntax Error" and error_index < 3:
                error_index += 1
                logging.error("Syntax Error")
                continue
            if error_index == 3:
                break
            index += 1
            # with open("test/" + ret[1] + "_" + str(index) + ".java", 'w') as f:
            #     f.write(ret[0])
            with open("test/" + ret[1] + ".java", 'w') as f:
                f.write(ret[0])
