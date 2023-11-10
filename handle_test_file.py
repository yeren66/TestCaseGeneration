import os
from tqdm import tqdm
from json_reader import json_data

# 指定 benchmark_test_code 文件夹的路径
folder_path = 'data/benchmark_test_code'  # 这里假设 data 文件夹与你的脚本文件在同一目录下，如果不是，需要调整路径

# 获取文件夹中的所有文件名
file_names = [f for f in os.listdir(folder_path) if os.path.isfile(os.path.join(folder_path, f)) and f.endswith('.py')]


# 处理每份文件，加入 import 语句使测试文件能够正确访问并运行被测代码
for file_name in tqdm(file_names):
    if file_name == 'coverage_calculate.py' or file_name == 'handle_test_file.py':
        continue
    # print(file_name)
    modified_content = ''
    file_path = os.path.join(folder_path, file_name)
    with open(file_path, 'r') as file:
        content = file.read()
        class_name = file_name.split('.')[0]
        modified_content = "import sys\nsys.path.append('/home/yeren/TestCaseEvaluate/data/')\n"
        modified_content += "from benchmark_solution_code." + class_name + " import " + class_name + "\n"
        modified_content += "from " + class_name + " import " + class_name + "\n"
        for data in json_data:
            if data['class_name'] == class_name:
                for statement in data['import_statement']:
                    modified_content += statement + '\n'
                break
        modified_content += content
    with open(file_path, 'w') as file:
        file.write(modified_content)