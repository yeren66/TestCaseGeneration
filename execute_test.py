import json
import javalang
import os
import subprocess
import re
import logging
from tqdm import tqdm
from extract_raw_file import update_json_file

basic_path = "./generate_result/"
append_path = "./test_result/"
relative_project_path = "/home/joseph/java_project/"
# --------------------------------------------------------------
current_path = os.getcwd()
logging.basicConfig(filename='log/java_project_execute.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')

def path_handle(path):
    project_list = []
    for item in os.listdir(path):
        if os.path.isdir(os.path.join(path, item)):
            for sub_item in os.listdir(os.path.join(path, item)):
                if os.path.isdir(os.path.join(path, item, sub_item)):
                    project_list.append(os.path.join(path, item, sub_item))
    return project_list

def json_reader(path): 
    with open(path, 'r') as f:
        data = json.load(f)
    return data

def syntax_judge(code):
    try:
        tree = javalang.parse.parse(code)
        return tree.types[0].name
    except Exception as e:
        logging.error("Syntax Error")
        logging.error(e)
        return None
    
def write_file(path, class_name, code):
    delete_file(path, class_name)
    # print(path + "/" + class_name + ".java")
    with open(os.path.join(path, class_name + ".java"), 'w') as f:
        f.write(code)

def delete_file(path, class_name):  
    if os.path.exists(os.path.join(path, class_name + ".java")):
        os.remove(os.path.join(path, class_name + ".java"))

def clean_path(path):
    for root, dirs, files in os.walk(path):
        for file in files:
            os.remove(os.path.join(root, file))

def result_evaluate(data, file_path, class_name, method_name):
    result_list = []
    for j in range(len(data)):
        logging.info("\nclass_name: " + class_name + " method_name: " + method_name + " index: " + str(j + 1))
        logging.info("\npath: " + file_path)
        logging.info("\ncode: " + data[j])

        # 清空文件夹
        # clean_path(java_file_path)

        # 进行语法检查
        syntax_ret = syntax_judge(data[j])
        if not syntax_ret:
            result_list.append('Syntax Error')
            continue
        
        # 将代码写入文件，进行编译检查
        # -Drat.skip=true 是遇到License检查才添加的参数
        # 对于新项目，所需要的参数可能不尽相同，为此可能需要频繁修改此内容。
        write_file(file_path, syntax_ret, data[j])
        logging.info("####################  mvn clean test-compile  ####################")
        sp = subprocess.Popen(
            "mvn clean test-compile -Drat.skip=true -Dsurefire.failIfNoSpecifiedTests=false",
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE, shell=True)
        stdout, stderr = sp.communicate(timeout=60)
        output_str = stdout.decode('utf-8')
        logging.info(output_str)
        pattern = r'BUILD (SUCCESS|FAILURE)'  # 定义正则表达式模式
        match = re.search(pattern, output_str)  # 在输出中搜索模式
        if match:
            build_status = match.group(1)  # 获取匹配的内容（SUCCESS 或 FAILURE）
            if build_status != "SUCCESS":
                result_list.append('Compile Error')
                delete_file(file_path, syntax_ret)
                continue

        # 进行测试检查
        # -Drat.skip=true 是遇到License检查才添加的参数
        # 对于新项目，所需要的参数可能不尽相同，为此可能需要频繁修改此内容。
        logging.info("####################  mvn test -Dtest=" + syntax_ret + "####################")
        sp = subprocess.Popen(
            "mvn test -Drat.skip=true -Dsurefire.failIfNoSpecifiedTests=false -Dtest=" + syntax_ret,
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE, shell=True)
        stdout, stderr = sp.communicate(timeout=60)
        output_str = stdout.decode('utf-8')
        logging.info(output_str)
        pattern = r'Tests run: (\d+), Failures: (\d+), Errors: (\d+), Skipped: (\d+)'
        match = re.search(pattern, output_str)
        if match:
            test_status = match.group(2)
            if test_status != "0":
                result_list.append('Test Error')
                delete_file(file_path, syntax_ret)
                continue
        result_list.append('Accept')

        # 删除文件
        delete_file(file_path, syntax_ret)

    return result_list

if __name__ == "__main__":

    path_list = path_handle(basic_path)

    for second_path in tqdm(path_list):
        # os.chdir(current_path)
        each_result = {}
        project_name = "unknown"
        for item in os.listdir(second_path):
            os.chdir(current_path)
            data = json_reader(os.path.join(second_path, item, "result.json"))
            project_name = data['project_name']
            class_name = data['class_name']
            method_name = data['method_name']
            relative_path = os.path.join(relative_project_path, data['relative_path'])
            each_result['project_name'] = data['project_name']
            each_result['code'] = data['source_code']
            each_result['package'] = data['package']
            each_result['class_name'] = data['class_name']
            each_result['method_name'] = data['method_name']
            os.chdir(os.path.join(relative_project_path, data['execute_path']))
            test_path = relative_path.replace("main", "test").rsplit("/", 1)[0]
            if not os.path.exists(test_path):
                os.makedirs(test_path)
            execute_result = result_evaluate(data['generate_test'], test_path, class_name, method_name)
            each_result[item] = execute_result

        os.chdir(current_path)
        update_json_file(os.path.join(append_path, project_name + '_result.json'), each_result)
        update_json_file("total_result.json", each_result)
    
    print("Finish!")

        

















