var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":30,"id":6743,"methods":[{"el":13,"sc":5,"sl":7},{"el":21,"sc":5,"sl":15},{"el":29,"sc":5,"sl":23}],"name":"TEST_MEAN_ABSOLUTE_DEVIATION","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_270":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_276":{"methods":[{"sl":23}],"name":"test_2","pass":true,"statements":[{"sl":25},{"sl":28}]},"test_800":{"methods":[{"sl":15}],"name":"test_1","pass":true,"statements":[{"sl":17},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [270], [], [270], [], [], [270], [], [], [800], [], [800], [], [], [800], [], [], [276], [], [276], [], [], [276], [], []]
