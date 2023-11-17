var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":18,"id":3120,"methods":[{"el":17,"sc":5,"sl":4}],"name":"FLIP_CASE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_242":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":16}]},"test_346":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":16}]},"test_524":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":16}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [524, 242, 346], [524, 242, 346], [], [524, 242, 346], [524, 346], [524, 346], [524, 346], [], [], [524, 346], [], [], [524, 242, 346], [], []]
