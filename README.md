# TestCaseGeneration

To see the useage of coverage.py, please click: https://coverage.readthedocs.io/en/latest/api.html

### UT Benchmark指标
* 语法正确性
* 可执行性
* 覆盖率
* 缺陷检测
* 与人工对比

使用human_eval方法：
1. 运行python_file_generate.py中的前两个文件写入段落生成human_eval的源码和测试用例
2. 运行api_usage.py以使用gpt接口生成测试用例（请注意输入正确的api_key）
3. 运行python_file_generate.py中的后一个文件写入段落生成generate的测试用例
4. 运行coverage_calculate.py分别计算human_eval的测试用例以及generate的测试用例
