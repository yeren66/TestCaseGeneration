var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":8141,"methods":[{"el":8,"sc":5,"sl":4},{"el":14,"sc":5,"sl":10},{"el":20,"sc":5,"sl":16}],"name":"TEST_TRUNCATE_NUMBER","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1005":{"methods":[{"sl":16}],"name":"test_2","pass":true,"statements":[{"sl":18},{"sl":19}]},"test_654":{"methods":[{"sl":10}],"name":"test_1","pass":true,"statements":[{"sl":12},{"sl":13}]},"test_797":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [797], [], [797], [797], [], [], [654], [], [654], [654], [], [], [1005], [], [1005], [1005], [], []]
