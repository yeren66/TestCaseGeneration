import json
import javalang
import os
import subprocess
import re
import logging
from tqdm import tqdm
from extract_raw_file import update_json_file
# from parse_clover import get_coverage
from parse_jacoco import get_coverage

basic_path = "./chatgpt_generate_result/"
append_path = "./chatgpt_test_result/"
relative_project_path = "/home/joseph/java_project/"
coverage_path = "/home/joseph/TestCaseGeneration/coverage_result/"
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
        return True
    return False

def clean_path(path_list):
    # 清除java-project中可能存在的残留Test文件，防止影响测试结果
    print("strat cleaning...")
    count = 0
    for second_path in tqdm(path_list):
        for item in os.listdir(second_path):
            data = json_reader(os.path.join(second_path, item, "result.json"))
            relative_path = os.path.join(relative_project_path, data['relative_path'])
            test_path = relative_path.replace("main", "test").rsplit("/", 1)[0]
            for each_result in data['generate_test']:
                class_name = syntax_judge(each_result)
                if class_name is not None:
                    ret = delete_file(test_path, class_name)
                    if ret:
                        count += 1
    print("Finish! clean " + str(count) + " files")


def write_coverage_result(path, data):
    if not os.path.exists(path):
        os.makedirs(path)
    file_path = os.path.join(path, "coverage.json")
    file_exists = os.path.exists(file_path)
    if file_exists:
        with open(file_path, 'r', encoding='utf-8') as file:
            existing_data = json.load(file)
    else:
        existing_data = []
    existing_data.append(data)
    with open(file_path, 'w', encoding='utf-8') as file:   
        json.dump(existing_data, file, indent=4)

def result_evaluate(generate_code, file_path, class_name, method_name, package_name, project_name):
    result_list = []
    for j in range(len(generate_code)):
        logging.info("\nclass_name: " + class_name + " method_name: " + method_name + " index: " + str(j + 1))
        logging.info("\npath: " + file_path)
        logging.info("\ncode: " + generate_code[j])

        # 进行代码修复
        # logging.info("\nUsing code repair rules...")
        # repair_code = code_repair(generate_code[j])
        repair_code = generate_code[j]

        # 进行语法检查
        syntax_ret = syntax_judge(repair_code)
        if not syntax_ret:
            result_list.append('Syntax Error')
            continue
        
        # 将代码写入文件，进行编译检查
        # -Drat.skip=true 是遇到License检查才添加的参数
        # -Dsurefire.failIfNoSpecifiedTests=false 是跳过没有测试的类
        # 对于新项目，所需要的参数可能不尽相同，为此可能需要频繁修改此内容。
        write_file(file_path, syntax_ret, repair_code)
        logging.info("####################  mvn clean test-compile  ####################")
        sp = subprocess.Popen(
            "mvn clean test-compile -Drat.skip=true -Dsurefire.failIfNoSpecifiedTests=false",
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE, 
            stderr=subprocess.PIPE,shell=True)
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
        # -DskipPitest=True 是跳过Pitest检查（本项目将pitest绑定在test阶段）
        # -Drat.skip=true 是遇到License检查才添加的参数
        # -Dsurefire.failIfNoSpecifiedTests=false 是跳过没有测试的类
        # 对于新项目，所需要的参数可能不尽相同，为此可能需要频繁修改此内容。
        logging.info("####################  mvn test -Dtest=" + syntax_ret + "####################")
        sp = subprocess.Popen(
            "mvn test -DskipPitest=True -Drat.skip=true -Dsurefire.failIfNoSpecifiedTests=false -Dtest=" + syntax_ret,
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE, 
            stderr=subprocess.PIPE, shell=True)
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
        pattern = r'BUILD (SUCCESS|FAILURE)'  # 定义正则表达式模式
        match = re.search(pattern, output_str)  # 在输出中搜索模式
        if match:
            build_status = match.group(1)  # 获取匹配的内容（SUCCESS 或 FAILURE）
            if build_status != "SUCCESS":
                result_list.append('Test Error')
                delete_file(file_path, syntax_ret)
                continue
        
        result_list.append('Accept')

        # 进行覆盖率计算
        logging.info("####################  Coverage Calculate: " + syntax_ret + " ####################")
        # 获取覆盖率
        this_path = os.getcwd()
        package_metric, class_metric, method_metric = get_coverage(this_path, package_name, syntax_ret, method_name)
        logging.info("project_name: " + project_name)
        logging.info("file_path: " + file_path)
        logging.info("package_name: " + package_name)
        logging.info("class_name: " + class_name)
        logging.info("method_name: " + method_name)
        logging.info("project_metric: " + str(package_metric))
        logging.info("package_metric: " + str(class_metric))
        logging.info("method_metric: " + str(method_metric))

        # 进行变异测试
        logging.info("####################  Mutation Test: " + syntax_ret + " ####################")
        targetClasses = package_name + "." + class_name
        targetTests = package_name + "." + syntax_ret
        logging.info("mvn command: mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -Drat.skip=true -DtargetClasses=\"" + targetClasses + "\" -DtargetTests=\"" + targetTests + "\"")
        logging.info("targetClasses: " + targetClasses)
        logging.info("targetTests: " + targetTests)
        sp = subprocess.Popen(
            'mvn clean test-compile org.pitest:pitest-maven:mutationCoverage -Drat.skip=true -DtargetClasses="' + targetClasses + '" -DtargetTests="' + targetTests + '"',
            stdin=subprocess.PIPE,
            stdout=subprocess.PIPE, 
            stderr=subprocess.PIPE, shell=True)
        stdout, stderr = sp.communicate(timeout=60)
        output_str = stdout.decode('utf-8')
        logging.info(output_str)
        pattern = r"Generated \d+ mutations Killed \d+ \((\d{1,3})%\)"
        matches = re.findall(pattern, output_str)
        if matches:
            # 对于可能的多次变异测试的结果，取平均值（理论上只会有一次）
            percentages = [int(m) for m in matches]
            average_percentage = sum(percentages) / len(percentages)
        else:
            # 表明变异测试未执行
            average_percentage = -1
            
        # 写入覆盖率结果以及变异测试结果
        coverage_data = {
            "project_name": project_name,
            "file_path": file_path,
            "package_name": package_name,
            "class_name": class_name,
            "method_name": method_name,
            "test_code": repair_code,
            "package_metric": package_metric,
            "class_metric": class_metric,
            "method_metric": method_metric,
            "pitest": average_percentage
        }
        write_coverage_result(coverage_path, coverage_data)

        # Clover插件的使用(已弃用)
        # logging.info("####################  mvn clover=setup test -Dtest=" + syntax_ret + "####################")
        # sp = subprocess.Popen(
        #     "mvn clean clover:setup test clover:aggregate clover:clover -Drat.skip=true -Dsurefire.failIfNoSpecifiedTests=false -Dtest=" + syntax_ret,
        #     stdin=subprocess.PIPE,
        #     stdout=subprocess.PIPE, shell=True)
        # stdout, stderr = sp.communicate(timeout=60)
        # output_str = stdout.decode('utf-8')
        # logging.info(output_str)
        # pattern = r'BUILD (SUCCESS|FAILURE)'  # 定义正则表达式模式
        # match = re.search(pattern, output_str)  # 在输出中搜索模式
        # if match:
        #     build_status = match.group(1)  # 获取匹配的内容（SUCCESS 或 FAILURE）
        #     if build_status != "SUCCESS":
        #         print("clover error in " + syntax_ret)
        #         delete_file(file_path, syntax_ret)
        #         continue
        # # clover.xml文件路径，此时的执行路径为项目根目录
        # clover_path = "target/site/clover/clover.xml"
        # # 获取覆盖率
        # project_metric, package_metric, file_metric, method_metric = get_coverage(clover_path, package_name, syntax_ret, method_name)
        # # 写入覆盖率结果
        # coverage_data = {
        #     "project_name": project_name,
        #     "class_name": syntax_ret,
        #     "method_name": method_name,
        #     "test_code": data[j],
        #     "project_metric": project_metric,
        #     "package_metric": package_metric,
        #     "file_metric": file_metric,
        #     "method_metric": method_metric
        # }
        # write_coverage_result(coverage_path, coverage_data)

        # 删除文件
        delete_file(file_path, syntax_ret)

    return result_list

if __name__ == "__main__":

    path_list = path_handle(basic_path)

    clean_path(path_list)

    for second_path in tqdm(path_list):
        # os.chdir(current_path)
        each_result = {}
        project_name = "unknown"
        for item in os.listdir(second_path):
            os.chdir(current_path)
            data = json_reader(os.path.join(second_path, item, "result.json"))
            package = data['package']
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
            execute_result = result_evaluate(data['generate_test'], test_path, class_name, method_name, package, project_name)
            each_result[item] = execute_result

        os.chdir(current_path)
        update_json_file(os.path.join(append_path, project_name + '_result.json'), each_result)
        # update_json_file("total_result.json", each_result)
    
    print("Finish!")

        

















