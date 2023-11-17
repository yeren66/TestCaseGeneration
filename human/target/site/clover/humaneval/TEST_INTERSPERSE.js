var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":6183,"methods":[{"el":14,"sc":5,"sl":8},{"el":25,"sc":5,"sl":16},{"el":36,"sc":5,"sl":27}],"name":"TEST_INTERSPERSE","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1078":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":21}]},"test_362":{"methods":[{"sl":27}],"name":"test_2","pass":true,"statements":[{"sl":29},{"sl":32}]},"test_552":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [552], [], [552], [], [], [552], [], [], [1078], [], [1078], [], [], [1078], [], [], [], [], [], [362], [], [362], [], [], [362], [], [], [], [], []]
