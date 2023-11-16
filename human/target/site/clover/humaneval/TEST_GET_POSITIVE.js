var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":47,"id":6015,"methods":[{"el":16,"sc":5,"sl":8},{"el":26,"sc":5,"sl":18},{"el":36,"sc":5,"sl":28},{"el":46,"sc":5,"sl":38}],"name":"TEST_GET_POSITIVE","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_143":{"methods":[{"sl":28}],"name":"test_2","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_230":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_892":{"methods":[{"sl":18}],"name":"test_1","pass":true,"statements":[{"sl":20},{"sl":23}]},"test_901":{"methods":[{"sl":38}],"name":"test_3","pass":true,"statements":[{"sl":40},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [230], [], [230], [], [], [230], [], [], [], [], [892], [], [892], [], [], [892], [], [], [], [], [143], [], [143], [], [], [143], [], [], [], [], [901], [], [901], [], [], [901], [], [], [], []]
