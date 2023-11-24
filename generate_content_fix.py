from source_code_extract import java_files_content
import javalang
import re

def source_code_info(source_code: str):
    source_tree = javalang.parse.parse(source_code)
    source_imports = source_tree.imports
    source_package_name = source_tree.package.name
    source_class_name = source_tree.types[0].name 
    source_method_name = source_tree.types[0].body[0].name 
    return source_imports, source_package_name, source_class_name, source_method_name

for i in range(0, len(java_files_content)):
    try:
      source_imports, source_package_name, source_class_name, source_method_name = source_code_info(java_files_content[i])
    except:
      # print(java_files_content[i])
      continue

    # print(source_package_name)
    # continue
    file_name = source_class_name + "Test.java"
    path = "test/" + file_name
    updated_content = ""
    count = 0
    try:
        with open(path, "r") as f:
            # print(count)
            # 读取path中的所有内容
            content = f.read()
            # print(content)
            test_tree = javalang.parse.parse(content)

            # 问题修复：找不到符号_1(java.util -> java.util.*)
            # test_imports = test_tree.imports
            if "java.util;" in content:
                content = re.sub("java.util;", "java.util.*;", content)
                count += 1
            
            # 问题修复：找不到符号_2(no found @Test)
            test_imports = test_tree.imports
            test_exist = False
            for import_info in test_imports:
                if "Test" in import_info:
                    test_exist = True
            if not test_exist:
                content = re.sub("package humaneval;\n", "package humaneval;\nimport org.junit.Test;\n", content)
                count += 1
            
            # 问题修复：找不到符号_3(miss source file reference)
            if " " + source_method_name in content and "Test" in source_class_name:
                content = re.sub(" " + source_method_name + "\(", " " + source_class_name + "." + source_method_name + "(", content)
                count += 1

            # 问题修复：找不到符号_4(usage without reference)
              # Arrays
            if "Arrays" in content:
                flag = False
                for import_info in test_imports:
                    if "Arrays" in import_info:
                        flag = True
                if not flag:
                  content = re.sub("package humaneval;\n", "package humaneval;\nimport java.util.Arrays;\n", content)
                  count += 1
              # Arrays
            if "ArraysList" in content:
                flag = False
                for import_info in test_imports:
                    if "ArraysList" in import_info:
                        flag = True
                if not flag:
                    content = re.sub("package humaneval;\n", "package humaneval;\nimport java.util.ArraysList;\n", content)
                    count += 1
              # Tuple
            if "Tuple" in content:
                flag = False
                for import_info in test_imports:
                  if "Tuple" in import_info:
                      flag = True
                if not flag:
                    content = re.sub("package humaneval;\n", "package humaneval;\nimport java.util.Tuple;\n", content)
                    count += 1
              # List
            if "List" in content:
                flag = False
                for import_info in test_imports:
                    if "List" in import_info:
                        flag = True
                if not flag:
                    content = re.sub("package humaneval;\n", "package humaneval;\nimport java.util.List;\n", content)
                    count += 1

            updated_content = content
            print(count)
            # print(updated_content)
            # 将替换后的内容写入path
    except FileNotFoundError:
        continue
    with open(path, "w") as f:
        f.write(updated_content)
