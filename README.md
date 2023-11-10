# TestCaseGeneration

## UT Benchmark指标

* 语法正确性
* 可执行性
* 覆盖率
* 缺陷检测
* 与人工对比

相比main分支，使用了meta的Ollama模型，以及class_eval数据集

## ClassEval官方测试用例运行方法
data文件夹中的benchmark_test_code的测试用例是经过修改的，可在原数据集上运行handle_test_file.py得到
想要执行官方测试用例，请执行
```
cd data
python coverage_calculate.py
```
结果会显示在coverage_result.txt与official_coverage_resul.jpg中，同时可在official_result_html中查看具体覆盖情况