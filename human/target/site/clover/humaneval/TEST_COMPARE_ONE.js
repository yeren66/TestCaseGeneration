var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":5176,"methods":[{"el":7,"sc":5,"sl":4},{"el":11,"sc":5,"sl":8},{"el":15,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":24},{"el":31,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32}],"name":"TEST_COMPARE_ONE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1012":{"methods":[{"sl":28}],"name":"test_6","pass":true,"statements":[{"sl":30}]},"test_1041":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":14}]},"test_1052":{"methods":[{"sl":32}],"name":"test_7","pass":true,"statements":[{"sl":34}]},"test_403":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":18}]},"test_83":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6}]},"test_850":{"methods":[{"sl":20}],"name":"test_4","pass":true,"statements":[{"sl":22}]},"test_919":{"methods":[{"sl":24}],"name":"test_5","pass":true,"statements":[{"sl":26}]},"test_990":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [83], [], [83], [], [990], [], [990], [], [1041], [], [1041], [], [403], [], [403], [], [850], [], [850], [], [919], [], [919], [], [1012], [], [1012], [], [1052], [], [1052], [], []]
