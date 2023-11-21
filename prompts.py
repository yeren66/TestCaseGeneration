def simple_prompt(prompt: str) -> str:
    return f"""Below is a Python code snippet with comments. Please write a test case for it. The test case is a function with a confirmed signature: "def check(candidate):" and please start with it.\n\nCode:\n{prompt}\n\nTest case:"""

def instruct_prompt(source_code: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite some test cases for the following java code snippet with junit.
    \n{source_code}
    \n\n### Response:"""