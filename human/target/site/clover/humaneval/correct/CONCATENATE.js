var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":10,"id":2610,"methods":[{"el":9,"sc":5,"sl":4}],"name":"CONCATENATE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_115":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8}]},"test_719":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":8}]},"test_765":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [765, 115, 719], [765, 115, 719], [765, 115, 719], [765, 115], [765, 115, 719], [], []]
