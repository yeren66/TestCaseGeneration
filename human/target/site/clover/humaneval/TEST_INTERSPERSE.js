var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":6183,"methods":[{"el":14,"sc":5,"sl":8},{"el":25,"sc":5,"sl":16},{"el":36,"sc":5,"sl":27}],"name":"TEST_INTERSPERSE","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_252":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_524":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":21}]},"test_831":{"methods":[{"sl":27}],"name":"test_2","pass":true,"statements":[{"sl":29},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [252], [], [252], [], [], [252], [], [], [524], [], [524], [], [], [524], [], [], [], [], [], [831], [], [831], [], [], [831], [], [], [], [], []]
