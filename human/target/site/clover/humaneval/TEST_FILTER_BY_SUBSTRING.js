var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":51,"id":5751,"methods":[{"el":17,"sc":5,"sl":8},{"el":28,"sc":5,"sl":19},{"el":39,"sc":5,"sl":30},{"el":50,"sc":5,"sl":41}],"name":"TEST_FILTER_BY_SUBSTRING","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_124":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_875":{"methods":[{"sl":30}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":35}]},"test_880":{"methods":[{"sl":19}],"name":"test_1","pass":true,"statements":[{"sl":21},{"sl":24}]},"test_892":{"methods":[{"sl":41}],"name":"test_3","pass":true,"statements":[{"sl":43},{"sl":46}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [124], [], [124], [], [], [124], [], [], [], [], [], [880], [], [880], [], [], [880], [], [], [], [], [], [875], [], [875], [], [], [875], [], [], [], [], [], [892], [], [892], [], [], [892], [], [], [], [], []]
