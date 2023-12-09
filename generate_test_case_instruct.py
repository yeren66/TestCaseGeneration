import re
import requests
import json
from prompts import instruct_prompt, instruct_prompt_2, instruct_prompt_3, instruct_prompt_4
# from source_code_extract import java_files_content
import javalang
from tqdm import tqdm
import logging

url = 'http://localhost:11434/api/generate'
logging.basicConfig(filename='log/log_file_11_26_2.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')


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
    elif "[JAVA]" in ret:
        # 如果返回内容中包括[JAVA]，则进行提取
        pattern = r"\[JAVA\]([\s\S]*?)\[/JAVA\]"
        matches = re.findall(pattern, ret)
        if matches:
            output = matches[0]
    else:
        # 否则对可能存在的Note增加注释
        pattern = r"Note:"
        replacement = "//\\g<0>"
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

    # # 修改test case的package name
    # if generate_package_name != "humaneval":
    #     generate_code = re.sub(generate_package_name, "humaneval", generate_code)
    
    # 修改test case调用的方法名，使之可用
    # generate_code = re.sub(source_method_name + "\(", source_package_name + "." + source_class_name + "." + source_method_name  + "(", generate_code)
    # generate_code = re.sub(source_class_name + "." + source_method_name + "\(", source_package_name + "." + source_class_name + "." + source_method_name + "(", generate_code)

    # 修改test case的类名
    # generate_code = re.sub("public class " + generate_class_name, "public class " + source_class_name + "Test", generate_code)

    return generate_code, source_class_name + "Test"

def source_code_info(source_code: str):
    source_tree = javalang.parse.parse(source_code)
    source_imports = source_tree.imports
    source_package_name = source_tree.package.name
    source_class_name = source_tree.types[0].name 
    source_method_name = source_tree.types[0].body[0].name 
    return source_imports, source_package_name, source_class_name, source_method_name

def test_case_info(source_code: str):
    try:
        source_imports, source_package_name, source_class_name, source_method_name = source_code_info(source_code)
    except:
        return "Syntax Error in source code"
    test_info = "package humaneval;\n\nimport org.junit.Test;\nimport static org.junit.Assert.*;\
\nimport " + source_package_name + "." +source_class_name + ";\n"
    for import_info in source_imports:
        test_info += "import " + import_info.path + ";\n"
    test_info += "\n\npublic class " + source_class_name + "Test {\n\
    @Test\n    public void " + source_method_name + "TEST() {\n        <FILL>\n    }\n}"
    return test_info

def project_directory_info():
    info = f"""
    .
    ├── lib
    ├── src
    │   ├── main/java/humaneval
    │   │   ├── <source code here>
    │   └── test/java/humaneval
    │       └── <junit test here>
    ├── target
    └── pom.xml"""
    return info

a_36 = """
package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import org.junit.Test;
import static org.junit.Assert.*;

public class FIND_MAXTest {
    @Test
    public void find_maxTEST() {
        <FILL>
    }
}
"""


if __name__ == "__main__":
    for i in tqdm(range(0, len(java_files_content))):
        logging.info('\n--------------- source code ---------------\n')
        logging.info('\n' + java_files_content[i])
        index = 0
        error_index = 0
        source_class_name = "test_" + str(i + 1)
        try:
            # source_imports, source_package_name, source_class_name, source_method_name = source_code_info(java_files_content[i])
            test_info = test_case_info(java_files_content[i])
            logging.info('\n--------------- test info ---------------\n')
            logging.info('\n' + test_info)

        except:
            test_info = test_case_info()
            continue
        while 1:
            if index == 1:
                break
            if test_info == "Syntax Error in source code":
                test_info = a_36
            data = {
                "model": "codellama:13b-instruct",
                "prompt": instruct_prompt_3(java_files_content[i], test_info),
            }
            headers = {'Content-Type': 'application/json'}
            response = requests.post(url, data=json.dumps(data), headers=headers)
            output = process_json_stream(response.text)
            logging.info('\n--------------- generate content ---------------\n')
            logging.info('\n' + output)
            output = parse_ret(output)
            # ret = handle_ret(output, java_files_content[i])
            # if ret == "Syntax Error" and error_index < 3:
            #     error_index += 1
            #     logging.error("Syntax Error")
            #     continue
            # if error_index == 1:
            #     break
            index += 1
            # with open("test/" + ret[1] + "_" + str(index) + ".java", 'w') as f:
            #     f.write(ret[0])
            with open("test/" + source_class_name + "Test.java", 'w') as f:
                f.write(output)
