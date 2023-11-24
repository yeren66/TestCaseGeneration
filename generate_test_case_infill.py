import re
import requests
import json
from prompts import infill_prompt
from source_code_extract import java_files_content
import javalang
from tqdm import tqdm
import logging

url = 'http://localhost:11434/api/generate'


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

def source_code_info(source_code: str):
    source_tree = javalang.parse.parse(source_code)
    source_package_name = source_tree.package.name
    source_class_name = source_tree.types[0].name 
    source_method_name = source_tree.types[0].body[0].name 
    return source_package_name, source_class_name, source_method_name


prefix = "import org.junit.Test;\nimport static org.junit.Assert.*;\n\npublic class Test {\n    @Test\n    public void test() {\n        "

suffix = "\n    }\n}"

source_code = java_files_content[0]
source_code = '//' + source_code.replace('\n', '\n// ')

print(source_code)
print('--------------source_code--------------')

data = {
    "model": "codellama:13b-instruct",
    "prompt": infill_prompt(source_code, prefix, suffix)
}

response = requests.post(url, data=json.dumps(data))

output = process_json_stream(response.text)

print(prefix)
print('--------------output--------------')
print(output)
print('--------------output--------------')
print(suffix)



















