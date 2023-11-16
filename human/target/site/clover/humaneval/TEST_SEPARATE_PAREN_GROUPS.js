var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":7464,"methods":[{"el":17,"sc":5,"sl":8},{"el":28,"sc":5,"sl":19},{"el":39,"sc":5,"sl":30},{"el":50,"sc":5,"sl":41}],"name":"TEST_SEPARATE_PAREN_GROUPS","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_328":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_333":{"methods":[{"sl":19}],"name":"test_1","pass":true,"statements":[{"sl":21},{"sl":24}]},"test_481":{"methods":[{"sl":41}],"name":"test_3","pass":true,"statements":[{"sl":43},{"sl":46}]},"test_577":{"methods":[{"sl":30}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":35}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [328], [], [328], [], [], [328], [], [], [], [], [], [333], [], [333], [], [], [333], [], [], [], [], [], [577], [], [577], [], [], [577], [], [], [], [], [], [481], [], [481], [], [], [481], [], [], [], [], []]
