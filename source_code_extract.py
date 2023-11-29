import os
import javalang
import re

def read_java_files(folder_path):
    java_files = []
    for root, dirs, files in os.walk(folder_path):
        for file in files:
            if file.endswith(".java"):
                file_path = os.path.join(root, file)
                with open(file_path, "r") as f:
                    java_code = f.read()
                    java_files.append(java_code)
    return java_files

def file_without_comment(folder_path):
    java_files = []
    for root, dirs, files in os.walk(folder_path):
        for file in files:
            if file.endswith(".java"):
                file_path = os.path.join(root, file)
                with open(file_path, "r") as f:
                    skip = 0
                    file_content = ""
                    for line in f.readlines():
                        if skip == 1 and "*/" in line:
                            skip = 0
                            continue
                        if skip == 1:
                            continue
                        if "//" in line:
                            continue
                        if "/*" in line:
                            skip = 1
                            continue
                        file_content += line

                    # 处理多余的换行
                    pattern = r'\n{3,}'
                    replacement = '\n\n'
                    file_content = re.sub(pattern, replacement, file_content) 

                    java_files.append(file_content)
    return java_files

def read_file_comment(folder_path):
    java_files = []
    for root, dirs, files in os.walk(folder_path):
        for file in files:
            if file.endswith(".java"):
                file_path = os.path.join(root, file)
                with open(file_path, "r") as f:
                    skip = 0
                    file_content = ""
                    for line in f.readlines():
                        if "//" in line:
                            file_content += line.strip("//")
                        if skip == 1 and "*/" in line:
                            skip = 0
                            file_content += line
                            continue
                        if skip == 1:
                            file_content += line
                        if "/*" in line:
                            skip = 1
                            file_content += line
                            
                    java_files.append(file_content)
    return java_files

path = f"human/src/main/java/humaneval"
# java_files_content = read_java_files(path)
java_files_content = file_without_comment(path)
# for java_code in java_files_content:
#     print(java_code)

java_code = java_files_content[0]

a  = read_java_files(path)
t = file_without_comment(path)
m = read_file_comment(path)