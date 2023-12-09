import json
import javalang
import os
import subprocess
import re
import logging
from tqdm import tqdm

SCOPath = "/home/yeren/TestCaseEvaluate/SourceCodeOnly/"
SCFPath = "/home/yeren/TestCaseEvaluate/SourceCode&Full/"
SCSPath = "/home/yeren/TestCaseEvaluate/SourceCode&Simple/"
java_file_path = "/home/yeren/fastjson2/core/src/test/java/com/alibaba/fastjson2/internal/asm/"
java_execute_path = "/home/yeren/fastjson2/core/"
current_path = os.getcwd()

logging.basicConfig(filename='log/fastjson_execute2.log', level=logging.DEBUG, format='%(asctime)s - %(levelname)s - %(message)s')


def json_reader(path, class_name, method_name): 
    with open(path + class_name + "_" + method_name + ".json", 'r') as f:
        data = json.load(f)
    return data

def syntax_judge(code):
    try:
        tree = javalang.parse.parse(code)
        return tree.types[0].name
    except Exception as e:
        logging.error(e)
        return False
    
def write_file(path, class_name, code):
    with open(path + class_name + ".java", 'w') as f:
        f.write(code)

def delete_file(path, class_name):  
    os.remove(path + class_name + ".java")

def clean_path(path):
    for root, dirs, files in os.walk(path):
        for file in files:
            os.remove(os.path.join(root, file))

def result_evaluate(file_path, source_code, class_name, method_name):
    code = json_reader(file_path, class_name, method_name)
    result_list = []
    for j in range(len(code)):
        logging.info("\nclass_name: " + class_name + " method_name: " + method_name + " index: " + str(j))
        logging.info("\ncode: " + code[j])

        # 清空文件夹
        clean_path(java_file_path)

        # 进行语法检查
        syntax_ret = syntax_judge(code[j])
        if not syntax_ret:
            result_list.append('Syntax Error')
            continue
        
        # 将代码写入文件，进行编译检查
        write_file(java_file_path, syntax_ret, code[j])
        os.chdir(java_execute_path)
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
                continue

        # 进行测试检查
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
                continue
        result_list.append('Accept')

        # 删除文件
        delete_file(java_file_path, syntax_ret)

    return result_list

if __name__ == "__main__":
    with open('out.json', 'r') as file:
        json_data = json.load(file)

    result = []
    # 对于每一个代码片段
    for i in tqdm(range(0, len(json_data))):
        source_code = json_data[i]['code']
        package = json_data[i]['package']
        class_name = json_data[i]['class_name']
        method_name = json_data[i]['method_name']

        # 目前只处理com.alibaba.fastjson2.internal.asm包下的类
        if package != "com.alibaba.fastjson2.internal.asm":
            continue

        # SourceCodeOnly
        SCOResult = result_evaluate(SCOPath, source_code, class_name, method_name)

        # SourceCode&Full
        SCFResult = result_evaluate(SCFPath, source_code, class_name, method_name)

        # SourceCode&Simple
        SCSResult = result_evaluate(SCSPath, source_code, class_name, method_name)

        # 新建文件，将结果写入json文件
        ret = {}
        ret['code'] = source_code
        ret['package'] = package
        ret['class_name'] = class_name
        ret['method_name'] = method_name
        ret['SourceCodeOnly'] = SCOResult
        ret['SourceCode&Full'] = SCFResult
        ret['SourceCode&Simple'] = SCSResult
        result.append(ret)

    os.chdir(current_path)
    with open('result2.json', 'w') as file:
        json.dump(result, file, indent=4)


















