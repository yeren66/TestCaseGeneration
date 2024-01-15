import xml.etree.ElementTree as ET
import os
import random

def extract_coverage(report_path, package_name, class_name, method_name):
    # 加载JaCoCo XML报告
    tree = ET.parse(report_path)
    root = tree.getroot()

    # 初始化返回值
    package_coverage, class_coverage, method_coverage = None, None, 0.0

    # 遍历package
    for package in root.findall(".//package"):
        if package.get('name') == package_name.replace('.', '/'):
            # 获取并计算包级覆盖率
            package_counter = package.find('counter[@type="LINE"]')
            if package_counter is not None:
                package_coverage  = calculate_coverage(package_counter)

            # 遍历class
            for clazz in package.findall('class'):
                if clazz.get('name').endswith("/" + class_name):
                    # 获取并计算类级覆盖率
                    class_counter = clazz.find('counter[@type="LINE"]')
                    if class_counter is not None:
                        class_coverage  = calculate_coverage(class_counter)

                    # 遍历method
                    count = 0
                    for method in clazz.findall('method'):
                        if method.get('name') == method_name:
                            # 获取并计算方法级覆盖率
                            method_counter = method.find('counter[@type="LINE"]')
                            if method_counter is not None and method_counter.get('covered') != '0':
                                count += 1
                                method_coverage  += calculate_coverage(method_counter)
                    if count > 0:
                        method_coverage = method_coverage / count
                    break

    return package_coverage, class_coverage, method_coverage

def calculate_coverage(counter):
    missed = int(counter.get('missed'))
    covered = int(counter.get('covered'))
    total = missed + covered
    if total > 0:
        return round((covered / total) * 100, 2)
    else:
        return 0.0
    
def find_jacoco_xml(base_path):
    target_dir = 'target'
    target_file = 'jacoco.xml'
    target_path = f'{target_dir}/site/jacoco/{target_file}'
    
    found_paths = []
    
    for root, dirs, files in os.walk(base_path):
        if target_dir in dirs:
            full_path = os.path.join(root, target_path)
            if os.path.isfile(full_path):
                found_paths.append(os.path.relpath(full_path, base_path))
                
    return found_paths

def handle_class_name(class_name):
    # 如果类名后缀为Test，则去掉Test，属于bug，已解决，新生产coverage中不会带有Test后缀
    if class_name.endswith('Test'):
        class_name = class_name[:len(class_name)-4]
    if class_name.endswith('Tests'):
        class_name = class_name[:len(class_name)-5]
    return class_name

def get_coverage(base_path, package_name, class_name, method_name):
    xml_path = find_jacoco_xml(base_path)
    package_coverage = 0
    class_coverage = 0
    method_coverage = 0
    class_name = handle_class_name(class_name) # 新coverage.json文件可注释掉这句
    for xml_file in xml_path:
        package_cov, class_cov, method_cov = extract_coverage(xml_file, package_name, class_name, method_name)
        if 1 == 0: # 保存对应xml文件用于debug
            xml_append_path = "/home/joseph/TestCaseGeneration/xmls/"
            if not os.path.exists(xml_append_path):
                os.makedirs(xml_append_path)
            with open(xml_append_path + class_name + "_" + method_name + "_" + str(random.randint(1, 50)) + "_jacoco.xml", 'w') as f:
                with open(xml_file, 'r') as file:
                    xmlFile = file.read()
                    f.write(xmlFile)
        if package_cov:
            package_coverage = package_coverage if package_coverage > package_cov else package_cov
        if class_cov:
            class_coverage = class_coverage if class_coverage > class_cov else class_cov
        if method_cov:
            method_coverage = method_coverage if method_coverage > method_cov else method_cov
    return package_coverage, class_coverage, method_coverage
        

if __name__ == "__main__":
    # 调用函数示例
    report_path = 'jacoco.xml'
    package_name = 'org.apache.commons.math4.legacy.core.dfp'
    class_name = 'Dfp'
    method_name = 'add'

    package_coverage, class_coverage, method_coverage = extract_coverage(report_path, package_name, class_name, method_name)
    print(package_coverage)
    print(class_coverage)
    print(method_coverage)
