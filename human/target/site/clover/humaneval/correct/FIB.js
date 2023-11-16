var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":2915,"methods":[{"el":16,"sc":5,"sl":12}],"name":"FIB","sl":11}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1056":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]},"test_160":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":13},{"sl":14}]},"test_614":{"methods":[{"sl":12}],"name":"test_0","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]},"test_726":{"methods":[{"sl":12}],"name":"test_3","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]},"test_729":{"methods":[{"sl":12}],"name":"test_4","pass":true,"statements":[{"sl":13},{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [160, 729, 726, 1056, 614], [160, 729, 726, 1056, 614], [160, 729, 726, 1056, 614], [729, 726, 1056, 614], [], []]
