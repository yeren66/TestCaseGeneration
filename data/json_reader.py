import json

# 读取 JSON 文件
def read_json_file(file_path):
    with open(file_path, 'r') as file:
        data = json.load(file)
        return data

# JSON 文件路径
json_file_path = 'ClassEval_data.json'

# 调用函数读取 JSON 文件
json_data = read_json_file(json_file_path)

# 打印 JSON 数据
# print(json_data)
