var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":4843,"methods":[{"el":12,"sc":5,"sl":6},{"el":20,"sc":5,"sl":14},{"el":28,"sc":5,"sl":22}],"name":"TEST_ALL_PREFIXES","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_692":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_787":{"methods":[{"sl":22}],"name":"test_2","pass":true,"statements":[{"sl":24},{"sl":25}]},"test_860":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [860], [], [860], [860], [], [], [], [], [692], [], [692], [692], [], [], [], [], [787], [], [787], [787], [], [], [], []]
