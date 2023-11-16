var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":5482,"methods":[{"el":12,"sc":5,"sl":4},{"el":22,"sc":5,"sl":14},{"el":32,"sc":5,"sl":24}],"name":"TEST_DO_ALGEBRA","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_155":{"methods":[{"sl":24}],"name":"test_2","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_307":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":19}]},"test_472":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [472], [], [472], [], [], [472], [], [], [], [], [307], [], [307], [], [], [307], [], [], [], [], [155], [], [155], [], [], [155], [], [], [], []]
