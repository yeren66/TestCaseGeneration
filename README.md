# TestCaseGeneration

## UT Benchmark指标

* 语法正确性
* 可执行性
* 覆盖率
* 缺陷检测
* 与人工对比

相比main分支，使用了meta的Ollama模型，以及class_eval数据集

## ClassEval官方测试用例运行方法
data文件夹中的benchmark_test_code的测试用例是经过修改的，如你的benchmark_test_code为原数据，请执行
```
cd data
python handle_test_file.py 
```

若想要执行修改之后的官方测试用例并查看覆盖率，请执行
```
cd data
python coverage_calculate.py
```
结果会显示在coverage_result.txt与official_coverage_result.jpg中，同时可在official_result_html中查看具体覆盖情况

![official_coverage_result](/data/official_covergae_result.jpg)