# import matplotlib
# matplotlib.use('TkAgg')
import matplotlib.pyplot as plt
import coverage
import unittest
from tqdm import tqdm
from suppress_stdout import suppress_stdout_stderr


# 实例化一个对象
cov = coverage.coverage()

result = []

# 对每个测试用例进行覆盖率测试
for i in tqdm(range(164)):
    with suppress_stdout_stderr(): # 此行用于屏蔽无关输出
        cov.start()
        suite = unittest.defaultTestLoader.discover("./dataset", f"test_code_{i}.py")
        unittest.TextTestRunner().run(suite)
        # coverage_score = cov.report(morfs=f"source_code_{i}.py")
        # result.append(coverage_score)
        cov.stop()
        cov.save()
        coverage_score = cov.html_report(morfs=f"source_code_{i}.py", directory='result_html')
        result.append(coverage_score)
        cov.erase()

# 处理结果
plt.plot(result)
plt.savefig('./result.jpg')
plt.show()
# print(result)


