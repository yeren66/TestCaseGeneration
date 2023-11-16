var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":3210,"methods":[{"el":16,"sc":5,"sl":7}],"name":"GET_POSITIVE","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_143":{"methods":[{"sl":7}],"name":"test_2","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":15}]},"test_230":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":12},{"sl":15}]},"test_892":{"methods":[{"sl":7}],"name":"test_1","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":12},{"sl":15}]},"test_901":{"methods":[{"sl":7}],"name":"test_3","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [892, 230, 901, 143], [892, 230, 901, 143], [], [892, 230, 901, 143], [892, 230, 143], [892, 230], [], [], [892, 230, 901, 143], [], []]
