import os

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

path = f"human/src/main/java/humaneval/correct"
java_files_content = read_java_files(path)
# for java_code in java_files_content:
#     print(java_code)

java_code = java_files_content[0]
