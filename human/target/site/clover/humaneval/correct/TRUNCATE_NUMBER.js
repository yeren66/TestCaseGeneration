var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":7,"id":4623,"methods":[{"el":6,"sc":5,"sl":4}],"name":"TRUNCATE_NUMBER","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1005":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5}]},"test_654":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5}]},"test_797":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [654, 1005, 797], [654, 1005, 797], [], []]
