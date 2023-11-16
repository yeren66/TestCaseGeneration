var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":4564,"methods":[{"el":18,"sc":5,"sl":16}],"name":"SUM_TO_N","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_102":{"methods":[{"sl":16}],"name":"test_0","pass":true,"statements":[{"sl":17}]},"test_184":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":17}]},"test_376":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":17}]},"test_750":{"methods":[{"sl":16}],"name":"test_4","pass":true,"statements":[{"sl":17}]},"test_793":{"methods":[{"sl":16}],"name":"test_2","pass":true,"statements":[{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [102, 184, 793, 376, 750], [102, 184, 793, 376, 750], [], []]
