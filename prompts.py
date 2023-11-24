def simple_prompt(prompt: str) -> str:
    return f"""Below is a Python code snippet with comments. Please write a test case for it. The test case is a function with a confirmed signature: "def check(candidate):" and please start with it.\n\nCode:\n{prompt}\n\nTest case:"""

def instruct_prompt(source_code: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite a unit test for the following java code snippet with junit.
    \n{source_code}
    \n\n### Response:"""

def instruct_prompt_2(source_code: str, mthod_name: str) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nWrite a unit test for the following java code snippet with junit.
    \n{source_code}
    \n\n### Node: \nThe name of tested method is {mthod_name}.
    \n\n### Response:"""

def infill_prompt(source_code, prefix, suffix) -> str:
    return f"""<PRE> ### Instruction:\nWrite a unit test for the following java code snippet with junit.
    // source code is:\n{source_code}\n
    \n
    {prefix}\n        // here is a test case\n 
     <SUF> \n
    {suffix}\n
     <MID> \n
    """

def instruct_prompt_3(source_code, test_info) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
\n\n### Instruction:\nComplete the unit test for the following java source code snippet.
\nUnit test has been finished partially. Please complete the section contains <FILL> tag and output the whole test case.
\n### JAVA Source code:\n{source_code}\n
\n\n### JUNIT Test case:\n{test_info}\n
\n\n### Response:
"""

# 未得到满意效果
def instruct_prompt_4(source_code, test_info, project_info) -> str:
    return f"""Below is an instruction that describes a task. Write a response that appropriately completes the request.
    \n\n### Instruction:\nComplete the unit test for the following java mvn project.
    \nThe unit test has been finished partially. Please complete the section contains <FILL> tag and output the whole test case.
    \n### Project directory:\n```\n{project_info}\n```\n
    \n### Source code:\n```\n{source_code}\n```\n
    \n\n### Test case:\n```\n{test_info}\n```\n
    \n\n### Response:
    """