import coverage
import unittest
import os
from tqdm import tqdm
import matplotlib.pyplot as plt
from suppress_stdout import suppress_stdout_stderr

# 实例化一个对象
cov = coverage.coverage()

# 指定 benchmark_test_code 文件夹的路径
folder_path = 'benchmark_test_code'  # 这里假设 data 文件夹与你的脚本文件在同一目录下，如果不是，需要调整路径

# 获取文件夹中的所有文件名
file_names = [f for f in os.listdir(folder_path) if os.path.isfile(os.path.join(folder_path, f)) and f.endswith('.py')]

coverage_result = []
excuting_result = []

# 对每个测试用例进行覆盖率测试
for file_name in file_names:
    # with suppress_stdout_stderr(): # 此行用于屏蔽无关输出
    cov.start()
    # 人工测试用例
    suite = unittest.defaultTestLoader.discover("./benchmark_test_code", file_name)
    # 生成测试用例
    # suite = unittest.defaultTestLoader.discover("./dataset", f"generate_test_code_{i}.py")
    try:
        unittest.TextTestRunner().run(suite)
    except:
        excuting_result.append(1)
    else:
        excuting_result.append(0)
    # coverage_score = cov.report(morfs=f"source_code_{i}.py")
    # result.append(coverage_score)
    cov.stop()
    cov.save()
    # cov.report()
    coverage_score = cov.html_report(morfs="./benchmark_solution_code/" + file_name, directory='./official_result_html')
    print(coverage_score)
    print()
    coverage_result.append(coverage_score)
    cov.erase()


with open('coverage_result.txt', 'w') as f:
    for i in range(len(coverage_result)):
        print(file_names[i] + '\t'+ str(coverage_result[i]))
        f.write(file_names[i] + '\t'+ str(coverage_result[i]) + '\n')
    f.write("覆盖率平均值为：" + str(sum(coverage_result) / len(coverage_result)))
    
# print(excuting_result)

print("覆盖率平均值为：", sum(coverage_result) / len(coverage_result))

plt.plot(coverage_result)
plt.savefig('./official_covergae_result.jpg')