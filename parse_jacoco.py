import xml.etree.ElementTree as ET

def extract_coverage(report_path, package_name, class_name, method_name):
    # 加载JaCoCo XML报告
    tree = ET.parse(report_path)
    root = tree.getroot()

    # 初始化返回值
    package_coverage, class_coverage, method_coverage = None, None, None

    # 遍历package
    for package in root.findall(".//package"):
        if package.get('name') == package_name.replace('.', '/'):
            # 获取并计算包级覆盖率
            package_counter = package.find('counter[@type="LINE"]')
            if package_counter is not None:
                package_cov = calculate_coverage(package_counter)
                package_coverage = f"Package Coverage: {package_cov}%"

            # 遍历class
            for clazz in package.findall('class'):
                if clazz.get('name').endswith(class_name):
                    # 获取并计算类级覆盖率
                    class_counter = clazz.find('counter[@type="LINE"]')
                    if class_counter is not None:
                        class_cov = calculate_coverage(class_counter)
                        class_coverage = f"Class Coverage: {class_cov}%"

                    # 遍历method
                    for method in clazz.findall('method'):
                        if method.get('name') == method_name:
                            # 获取并计算方法级覆盖率
                            method_counter = method.find('counter[@type="LINE"]')
                            if method_counter is not None:
                                method_cov = calculate_coverage(method_counter)
                                method_coverage = f"Method Coverage: {method_cov}%"
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

# 调用函数示例
report_path = 'jacoco.xml'
package_name = 'org.apache.commons.math4.legacy.core.dfp'
class_name = 'Dfp'
method_name = 'add'

package_coverage, class_coverage, method_coverage = extract_coverage(report_path, package_name, class_name, method_name)
print(package_coverage)
print(class_coverage)
print(method_coverage)
