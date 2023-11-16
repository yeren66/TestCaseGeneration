var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":2348,"methods":[{"el":15,"sc":5,"sl":7}],"name":"ALL_PREFIXES","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_692":{"methods":[{"sl":7}],"name":"test_1","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":14}]},"test_787":{"methods":[{"sl":7}],"name":"test_2","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11},{"sl":14}]},"test_860":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [787, 692, 860], [787, 692, 860], [], [787, 692, 860], [787, 692], [], [], [787, 692, 860], [], []]
