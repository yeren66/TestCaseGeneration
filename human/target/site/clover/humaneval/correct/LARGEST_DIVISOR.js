var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":11,"id":3517,"methods":[{"el":10,"sc":5,"sl":4}],"name":"LARGEST_DIVISOR","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1001":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_1071":{"methods":[{"sl":4}],"name":"test_5","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_330":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_6":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_639":{"methods":[{"sl":4}],"name":"test_4","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [639, 1001, 330, 1071, 6], [639, 1001, 330, 1071, 6], [639, 1001, 330, 1071, 6], [639, 1001, 330, 1071, 6], [], [], [], []]
