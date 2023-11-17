var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":4825,"methods":[{"el":12,"sc":5,"sl":6},{"el":20,"sc":5,"sl":14},{"el":28,"sc":5,"sl":22}],"name":"TEST_ALL_PREFIXES","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_249":{"methods":[{"sl":22}],"name":"test_2","pass":true,"statements":[{"sl":24},{"sl":25}]},"test_476":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_605":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [476], [], [476], [476], [], [], [], [], [605], [], [605], [605], [], [], [], [], [249], [], [249], [249], [], [], [], []]
