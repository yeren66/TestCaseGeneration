import xml.etree.ElementTree as ET
import re

def get_coverage(clover_report, package_name, class_path, method_name):
    root = read_clover_report(clover_report)
    project_metric, package_metric, file_metric, method_metric = locate_method(root, package_name, class_path, method_name)
    return project_metric, package_metric, file_metric, method_metric

def read_clover_report(clover_report):
    tree = ET.parse(clover_report)
    root = tree.getroot()
    return root

def locate_method(root, package_name, class_path, method_name):
    # project contains two main parts: 'project' and 'testproject'
    project = root.find('project')
    project_metric = calculate_coverage(project.find('metrics'))
    # project contains one 'metrics' and multiple 'package'
    for package in project.iter('package'):
        # we only need the package with the name we want
        if package.get('name') == package_name:
            package_metric = calculate_coverage(package.find('metrics'))
            # package contains one 'metrics' and multiple 'file'
            for file in package.iter('file'):
                # we only need the file with the path we want
                if file.get('path') == class_path:
                    # file contains one 'metrics' and multiple 'line'
                    file_metric = calculate_coverage(file.find('metrics'))
                    method_flag = False
                    total_count = 0
                    coverage_count = 0
                    # a 'line' can be a method or a statement or a condition
                    # here we only need the 'line' with type 'method' and 'stmt'
                    for method in file.iter('line'):
                        if method.get('type') == "method" and judge_method_name(method.get('signature'), method_name) and method.get('count') == "1":
                            method_flag = True
                        elif method.get('type') == "method":
                            method_flag = False
                        if method_flag and method.get('type') == "stmt":
                            total_count += 1
                            if method.get('count') == "1":
                                coverage_count += 1
    if total_count == 0:
        # that means we cannot find the method
        return project_metric, package_metric, file_metric, None
    else:
        return project_metric, package_metric, file_metric, float(coverage_count) / float(total_count)

def calculate_coverage(metric_node):
    return float(metric_node.get('coveredstatements')) / float(metric_node.get('statements'))

def judge_method_name(signature, method_name):
    pattern = str(method_name)
    if re.search(pattern, signature):
        # for arg in args:
        #     arg_pattern = str(arg)
        #     if not re.search(arg_pattern, signature):
        #         return False
        return True
    return False

if __name__ == '__main__':
    ## test ##
    xml_file = "clover.xml"
    package_name = "org.apache.commons.lang3.builder"
    class_path = "/home/yeren/java-project/commons-lang/src/main/java/org/apache/commons/lang3/builder/CompareToBuilder.java"
    method_name = "append"
    # args = ["boolean\[\]", "boolean\[\]"]

    root = read_clover_report(xml_file)
    project_metric, package_metric, file_metric, method_metric = locate_method(root, package_name, class_path, method_name)
    print("project_metric: " + str(project_metric))
    print("package_metric: " + str(package_metric))
    print("file_metric: " + str(file_metric))
    print("method_metric: " + str(method_metric))
