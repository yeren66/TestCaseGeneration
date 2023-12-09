# TestCaseGeneration

### UT Benchmark指标
* 语法正确性（静态分析）--> javalang (寻找更好的分析工具，如joern等)
* 可编译性（动态分析） --> mvn compile
* 覆盖率 --> clover
* 缺陷检测 --> pitest(未做)
* 与人工对比

与前几个分支相比，这一版在codereval提供的github项目上进行了测试用例生成的实验。

### 进程

> $ main $ --> $ class\_eval $ --> $ human\_java $ --> $ codereval $ --> $ ... $


### 目前阶段
`out.json`是保存有源代码信息的数据文件，通过generate_test_case_fastjson.py进行测试用例生成。

我们使用三种prompt进行测试用例生成：

1. source code only
2. source code + full context
3. source code + simple context

此外，在每种prompt中都会添加test_info，以期模型能够输出格式规范的测试用例。

结果保存在三个目录中，结构如下：
```
.
├── SourceCodeOnly  
│   ├── ***.json              # handle easily
│   └── ***.txt               # read easily
├── SourceCode&Full
├── SourceCode&Simple
└── ......
```

生成的结果存储在了result.json文件中。