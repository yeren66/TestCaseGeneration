var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":11,"id":3517,"methods":[{"el":10,"sc":5,"sl":4}],"name":"LARGEST_DIVISOR","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_30":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_44":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_571":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_884":{"methods":[{"sl":4}],"name":"test_4","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]},"test_99":{"methods":[{"sl":4}],"name":"test_5","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [30, 44, 884, 571, 99], [30, 44, 884, 571, 99], [30, 44, 884, 571, 99], [30, 44, 884, 571, 99], [], [], [], []]
