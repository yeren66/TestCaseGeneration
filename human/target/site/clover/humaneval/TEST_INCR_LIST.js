var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":6142,"methods":[{"el":16,"sc":5,"sl":8},{"el":26,"sc":5,"sl":18},{"el":36,"sc":5,"sl":28}],"name":"TEST_INCR_LIST","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_580":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_618":{"methods":[{"sl":18}],"name":"test_1","pass":true,"statements":[{"sl":20},{"sl":23}]},"test_875":{"methods":[{"sl":28}],"name":"test_2","pass":true,"statements":[{"sl":30},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [580], [], [580], [], [], [580], [], [], [], [], [618], [], [618], [], [], [618], [], [], [], [], [875], [], [875], [], [], [875], [], [], [], []]
