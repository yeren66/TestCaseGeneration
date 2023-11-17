var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":4964,"methods":[{"el":8,"sc":5,"sl":4},{"el":13,"sc":5,"sl":9},{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":19},{"el":28,"sc":5,"sl":24}],"name":"TEST_CAN_ARRANGE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1046":{"methods":[{"sl":14}],"name":"test_2","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_464":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_620":{"methods":[{"sl":19}],"name":"test_3","pass":true,"statements":[{"sl":21},{"sl":22}]},"test_623":{"methods":[{"sl":9}],"name":"test_1","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_805":{"methods":[{"sl":24}],"name":"test_4","pass":true,"statements":[{"sl":26},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [464], [], [464], [464], [], [623], [], [623], [623], [], [1046], [], [1046], [1046], [], [620], [], [620], [620], [], [805], [], [805], [805], [], []]
