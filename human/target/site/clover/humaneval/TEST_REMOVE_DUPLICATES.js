var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":7199,"methods":[{"el":16,"sc":5,"sl":8},{"el":26,"sc":5,"sl":18},{"el":36,"sc":5,"sl":28}],"name":"TEST_REMOVE_DUPLICATES","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_366":{"methods":[{"sl":18}],"name":"test_1","pass":true,"statements":[{"sl":20},{"sl":23}]},"test_895":{"methods":[{"sl":28}],"name":"test_2","pass":true,"statements":[{"sl":30},{"sl":33}]},"test_938":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [938], [], [938], [], [], [938], [], [], [], [], [366], [], [366], [], [], [366], [], [], [], [], [895], [], [895], [], [], [895], [], [], [], []]
