var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":4625,"methods":[{"el":19,"sc":5,"sl":8}],"name":"UNIQUE","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_640":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":18}]},"test_710":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":9},{"sl":11},{"sl":12},{"sl":13},{"sl":14},{"sl":16},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [710, 640], [710, 640], [], [710, 640], [710, 640], [710, 640], [710, 640], [], [710, 640], [], [710, 640], [], []]
