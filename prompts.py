def simple_prompt(prompt: str) -> str:
    return f"""Below is a Python code snippet with comments. Please write a test case for it. The test case is a function with a confirmed signature: "def check(candidate):" and please start with it.\n\nCode:\n{prompt}\n\nTest case:"""

test_case = "def check(candidate):\n    assert candidate([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3) == True\n    assert candidate([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05) == False"

def instruct_prompt(prompt: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite a test case for the following python code snippet.
    \n{prompt}\n 
    The test case should be a function with a confirmed signature: "def check(candidate):". 
    Here is an example:\n {test_case}. 
    \n\n### Response:"""