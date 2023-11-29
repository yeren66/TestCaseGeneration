# TestCaseGeneration

### UT Benchmark指标
* 语法正确性（静态分析）--> javalang (寻找更好的分析工具，如joern等)
* 可编译性（动态分析） --> mvn compile
* 覆盖率 --> clover
* 缺陷检测 --> pitest(未做)
* 与人工对比

相较前两个分支，使用java代码代替python代码，human文件夹里的是找到的别人论文里的java源码以及测试代码，-->[clm](https://github.com/lin-tan/clm/tree/main)<--

使用了Code Llama模型进行用例生成:[:Click Here::](https://github.com/facebookresearch/codellama)

这个数据库中的内容在本项目所使用到的主要包括，其他为无关内容。
```
.
├── lib
├── src
│   ├── main/java/humaneval
│   │   ├── source code here
│   └── test/java/humaneval
│       └── munual test case here
└── target
```
运行下述代码以获取报告（覆盖率）
```
cd human
```
```
mvn clean clover:setup test clover:aggregate clover:clover -Dmaven.test.failure.ignore=true surefire-report:report
```
上述`maven`命令可理解为
```
# 使用surefire获取测试用例构建成功率
# 结果在target/site/surefire-report.html中
mvn clean
mvn test -Dmaven.test.failure.ignore=true
mvn surefire-report:report

# 使用open clover获取测试用例的覆盖率
# 结果在target/site/clover/index.html中
mvn clean clover:setup test clover:aggregate clover:clover 
```

>注：human下的modify.py用于修改测试用例，使其分别针对buggy或correct执行测试。
>ParseXml.jar用于生成clover文件并进行处理

### 目前阶段
在human数据集上跑通了流程的前三步，我们发现prompt对结果的影响巨大，这在prompts.py文件中可以得到说明，我们针对第三版prompt，设计了一个对比实验，分别采用有注释与无注释的源码，其余内容不变进行测试用例生成：
```
# 有注释：
语法正确性：111 / 163 = 68.1%
可编译性：83 / 111 = 74.7%
代码覆盖率：31.8%

# 无注释：
语法正确性：103 / 163 = 63.2%
可编译性：81 / 103 = 78.6%
代码覆盖率：14.4%
```
可以看到，在语法正确性和可编译性比例相当的情况下，代码覆盖率相差巨大。

### 下一阶段
扩大数据集，在github的热门项目上进行测试用例的生成，探索在复杂场景下大模型生成测试用例的能力。