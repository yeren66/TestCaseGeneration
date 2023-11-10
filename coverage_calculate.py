import matplotlib.pyplot as plt
import coverage
import unittest
from tqdm import tqdm
from suppress_stdout import suppress_stdout_stderr


# 实例化一个对象
cov = coverage.coverage()

coverage_result = []
excuting_result = []

# 对每个测试用例进行覆盖率测试
for i in tqdm(range(164)):
    with suppress_stdout_stderr(): # 此行用于屏蔽无关输出
        cov.start()
        # 人工测试用例
        suite = unittest.defaultTestLoader.discover("./dataset", f"test_code_{i}.py")
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
        coverage_score = cov.html_report(morfs=f"source_code_{i}.py", directory='result_html')
        coverage_result.append(coverage_score)
        cov.erase()

# 处理结果
plt.plot(coverage_result)
plt.savefig('./official_covergae_result.jpg')
plt.show()

plt.hist(excuting_result)
plt.savefig('./official_excuting_result.jpg')
# print(result)
# print(excuting_result)


