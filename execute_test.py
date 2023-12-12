import json
import javalang
import os
import subprocess
import re
import logging
from tqdm import tqdm

basic_path = "./test/"
info_path = "./output/"
relative_project_path = "/home/yeren/java-project/"
# TODO: tmp, remove later
java_execute_path = {"commons-lang": "/home/yeren/java-project/commons-lang/" ,"commons-math": "/home/yeren/java-project/commons-math/", "jfreechart": "/home/yeren/java-project/jfreechart/"}
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

def parse_project(path):
    name = path.split('/')[2]
    class_name = path.split('/')[3].split('_')[0]
    method_name = path.split('/')[3].split('_')[1]
    datas = json_reader(os.path.join(info_path, name + ".json"))
    for data in datas:
        if data['class_name'] == class_name and data['method_name'] == method_name:
            return data['project_name'], data['package'], data['relative_path'], data['file_name'], data['class_name'], data['method_name'], data['source_code']
    return None

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
        write_file(file_path, syntax_ret, data[j])
        logging.info("####################  mvn clean test-compile  ####################")
        sp = subprocess.Popen(
            "mvn clean test-compile",
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
        logging.info("####################  mvn test -Dtest=" + syntax_ret + "####################")
        sp = subprocess.Popen(
            "mvn test -Dtest=" + syntax_ret,
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

    result_list = []

    for second_path in tqdm(path_list):
        os.chdir(current_path)
        project_name, package_name, relative_path, file_name, class_name, method_name, source_code = parse_project(second_path)
        each_result = {}
        each_result['project_name'] = project_name
        each_result['code'] = source_code
        each_result['package'] = package_name
        each_result['class_name'] = class_name
        each_result['method_name'] = method_name
        for item in os.listdir(second_path):
            os.chdir(current_path)
            data = json_reader(os.path.join(second_path, item, "result.json"))
            os.chdir(java_execute_path[project_name])
            test_path = relative_path.replace("main", "test").rsplit("/", 1)[0].split("/", 1)[1]
            if not os.path.exists(test_path):
                os.makedirs(test_path)
            execute_result = result_evaluate(data, test_path, class_name, method_name)
            each_result[item] = execute_result

        result_list.append(each_result)

    os.chdir(current_path)
    with open('test_result.json', 'w') as file:
        json.dump(result_list, file, indent=4)

            


    # with open('out.json', 'r') as file:
    #     json_data = json.load(file)

    # result = []
    # # 对于每一个代码片段
    # for i in tqdm(range(0, len(json_data))):
    #     source_code = json_data[i]['code']
    #     package = json_data[i]['package']
    #     class_name = json_data[i]['class_name']
    #     method_name = json_data[i]['method_name']

    #     # 目前只处理com.alibaba.fastjson2.internal.asm包下的类
    #     if package != "com.alibaba.fastjson2.internal.asm":
    #         continue

    #     # SourceCodeOnly
    #     SCOResult = result_evaluate(SCOPath, source_code, class_name, method_name)

    #     # SourceCode&Full
    #     SCFResult = result_evaluate(SCFPath, source_code, class_name, method_name)

    #     # SourceCode&Simple
    #     SCSResult = result_evaluate(SCSPath, source_code, class_name, method_name)

    #     # 新建文件，将结果写入json文件
    #     ret = {}
    #     ret['code'] = source_code
    #     ret['package'] = package
    #     ret['class_name'] = class_name
    #     ret['method_name'] = method_name
    #     ret['SourceCodeOnly'] = SCOResult
    #     ret['SourceCode&Full'] = SCFResult
    #     ret['SourceCode&Simple'] = SCSResult
    #     result.append(ret)

    # os.chdir(current_path)
    # with open('result2.json', 'w') as file:
    #     json.dump(result, file, indent=4)


















