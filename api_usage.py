from prompts import simple_prompt, instruct_prompt
from gpt_api import gpt
from tqdm import tqdm


for i in tqdm(range(0, 164)):
    # 读取文件
    with open(f'dataset/source_code_{i}.py', 'r', encoding='utf-8') as f:
        content = f.read()
    # print(content)

    # 生成prompt
    prompt = instruct_prompt(content)
    # print(prompt)

    # 调用gpt
    result = gpt(prompt)

    # 写入文件
    with open(f'generate_data/gtest_code_{i}.py', 'w', encoding='utf-8') as f:
        f.write(result)

    # 输出结果
    # print(result)
