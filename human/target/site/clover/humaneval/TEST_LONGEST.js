var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":36,"id":6567,"methods":[{"el":15,"sc":5,"sl":7},{"el":25,"sc":5,"sl":17},{"el":35,"sc":5,"sl":27}],"name":"TEST_LONGEST","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_405":{"methods":[{"sl":17}],"name":"test_1","pass":true,"statements":[{"sl":19},{"sl":22}]},"test_624":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_979":{"methods":[{"sl":27}],"name":"test_2","pass":true,"statements":[{"sl":29},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [624], [], [624], [], [], [624], [], [], [], [], [405], [], [405], [], [], [405], [], [], [], [], [979], [], [979], [], [], [979], [], [], [], []]
