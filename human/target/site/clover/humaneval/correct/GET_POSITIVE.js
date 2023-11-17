var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":3210,"methods":[{"el":16,"sc":5,"sl":7}],"name":"GET_POSITIVE","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_184":{"methods":[{"sl":7}],"name":"test_3","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":15}]},"test_213":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":12},{"sl":15}]},"test_403":{"methods":[{"sl":7}],"name":"test_1","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":12},{"sl":15}]},"test_444":{"methods":[{"sl":7}],"name":"test_2","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [184, 444, 213, 403], [184, 444, 213, 403], [], [184, 444, 213, 403], [444, 213, 403], [213, 403], [], [], [184, 444, 213, 403], [], []]
