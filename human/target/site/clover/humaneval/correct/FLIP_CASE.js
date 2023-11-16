var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":3120,"methods":[{"el":17,"sc":5,"sl":4}],"name":"FLIP_CASE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":16}]},"test_202":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":16}]},"test_412":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [412, 1006, 202], [412, 1006, 202], [], [412, 1006, 202], [412, 1006], [412, 1006], [412, 1006], [], [], [412, 1006], [], [], [412, 1006, 202], [], []]
