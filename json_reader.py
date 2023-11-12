import json
import os

# 读取 JSON 文件
def read_json_file(file_path):
    with open(file_path, 'r') as file:
        data = json.load(file)
        return data
    
# 指定 benchmark_test_code 文件夹的路径
folder_path = 'data/benchmark_test_code'  # 这里假设 data 文件夹与你的脚本文件在同一目录下，如果不是，需要调整路径

# 获取文件夹中的所有文件名
file_names = [f for f in os.listdir(folder_path) if os.path.isfile(os.path.join(folder_path, f)) and f.endswith('.py')]
file_names = sorted(file_names, key=str.casefold)

# JSON 文件路径
json_file_path = 'data/ClassEval_data.json'

# 调用函数读取 JSON 文件
json_data = read_json_file(json_file_path)

# 打印 JSON 数据
# print(json_data)

for i in range(len(json_data)):
    print(json_data[i]['task_id'] + '\t' + json_data[i]['class_name'] + '\t' + file_names[i])
    # print(data['import_statement'])
    # print(data['test_cases'])
    # print('\n')
