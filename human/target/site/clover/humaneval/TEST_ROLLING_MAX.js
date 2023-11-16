var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":7313,"methods":[{"el":17,"sc":5,"sl":8},{"el":28,"sc":5,"sl":19},{"el":39,"sc":5,"sl":30},{"el":50,"sc":5,"sl":41}],"name":"TEST_ROLLING_MAX","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_212":{"methods":[{"sl":19}],"name":"test_1","pass":true,"statements":[{"sl":21},{"sl":24}]},"test_273":{"methods":[{"sl":30}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":35}]},"test_949":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_984":{"methods":[{"sl":41}],"name":"test_3","pass":true,"statements":[{"sl":43},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [949], [], [949], [], [], [949], [], [], [], [], [], [212], [], [212], [], [], [212], [], [], [], [], [], [273], [], [273], [], [], [273], [], [], [], [], [], [984], [], [984], [], [], [984], [], [], [], [], []]
