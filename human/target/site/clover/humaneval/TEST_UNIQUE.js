var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":8150,"methods":[{"el":16,"sc":5,"sl":8},{"el":26,"sc":5,"sl":18}],"name":"TEST_UNIQUE","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_640":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_710":{"methods":[{"sl":18}],"name":"test_1","pass":true,"statements":[{"sl":20},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [640], [], [640], [], [], [640], [], [], [], [], [710], [], [710], [], [], [710], [], [], [], []]
