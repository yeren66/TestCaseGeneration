var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":5625,"methods":[{"el":12,"sc":5,"sl":7},{"el":18,"sc":5,"sl":13},{"el":24,"sc":5,"sl":19},{"el":30,"sc":5,"sl":25}],"name":"TEST_FACTORIAL","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_244":{"methods":[{"sl":13}],"name":"test_1","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_612":{"methods":[{"sl":19}],"name":"test_2","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23}]},"test_882":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11}]},"test_92":{"methods":[{"sl":25}],"name":"test_3","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [882], [], [882], [882], [882], [], [244], [], [244], [244], [244], [], [612], [], [612], [612], [612], [], [92], [], [92], [92], [92], [], []]
