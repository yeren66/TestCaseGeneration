var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":3240,"methods":[{"el":11,"sc":5,"sl":4}],"name":"GREATEST_COMMON_DIVISOR","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1005":{"methods":[{"sl":4}],"name":"test_3","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":10}]},"test_295":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":10}]},"test_491":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":10}]},"test_709":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [295, 709, 491, 1005], [295, 709, 491, 1005], [295, 709, 491, 1005], [295, 709, 491, 1005], [295, 709, 491, 1005], [], [295, 709, 491, 1005], [], []]
