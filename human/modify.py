import os
import re

# 定义文件夹路径
folder_path = 'C:\\Users\\yeren\\Desktop\\human\\src\\test\\java\\humaneval'

print(folder_path)

# 遍历文件夹中的所有文件
for root, dirs, files in os.walk(folder_path):
    print(len(files))
    for file in files:
        if file.endswith('.java'):
            file_path = os.path.join(root, file)
            # 读取文件内容
            with open(file_path, 'r', encoding='utf-8') as f:
                file_content = f.read()

            # 使用正则表达式替换文本
            modified_content = re.sub(r'humaneval.buggy', 'humaneval.correct', file_content) # 替换为correct

            # modified_content = re.sub(r'humaneval.correct', 'humaneval.buggy', file_content) # 替换为buggy

            # 将修改后的内容写入文件
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(modified_content)

print("替换完成！")


