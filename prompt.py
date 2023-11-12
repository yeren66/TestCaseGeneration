from json_reader import json_data

source_code = json_data[0]['solution_code']
test_case = json_data[0]['test']

method_code = json_data[0]['methods_info'][0]['solution_code']
class_name = json_data[0]['class_name']

def instruct_prompt_old(prompt: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n## Instruction:\nWrite a test case for the following python code snippet.
    \n{prompt}\n 
    The test case should use unittest frame and cover as much of source code as possible. 
    Here is an example:\n ### source code:\n{source_code}\n ### test case:\n{test_case}. 
    \n\n## Response:"""

def instruct_prompt_oold(prompt: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite a test case for the following python code snippet.
    \n{prompt}\n 
    The test case should use unittest frame and cover as much of source code as possible. 
    Here is an example:\n {test_case}. 
    \n\n### Response:"""

def instruct_prompt_ooold(prompt: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite test cases for the following 'Source code' without any explanation.
    The test case should use unittest frame and cover as much of source code as possible. 
    You should import unittest first and then write the test case.
    The test case should write as python code and be able to run.
    You need to write multiple classes, each of which corresponds to a method in the source code.
    \n\n### Source code:\n{prompt}\n
    \n\n### Response:"""

def instruct_prompt(prompt: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite a test case without any explanation for the following 'Source code' in {class_name} class.
    The test case should use unittest frame and cover as much of source code as possible. 
    The test case should write as python code and be able to run.
    You should write a class with multiple test methods to test the methods in the source code.
    For example, if code has a method called 'add', you should write a class named 'TestAdd' and write multiple test methods named 'test_add_1', 'test_add_2' in it.
    You should import unittest first and then write the test case.
    \n\n### Source code:\n{method_code}\n
    \n\n### Response:"""