var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":4502,"methods":[{"el":15,"sc":5,"sl":4}],"name":"STRING_XOR","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_121":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":11},{"sl":14}]},"test_803":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":14}]},"test_980":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":11},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [803, 121, 980], [803, 121, 980], [803, 121, 980], [803, 121, 980], [803, 121, 980], [], [], [121, 980], [], [], [803, 121, 980], [], []]
