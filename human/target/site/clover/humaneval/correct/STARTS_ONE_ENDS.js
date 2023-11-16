var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":12,"id":4466,"methods":[{"el":11,"sc":5,"sl":7}],"name":"STARTS_ONE_ENDS","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_128":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_283":{"methods":[{"sl":7}],"name":"test_4","pass":true,"statements":[{"sl":8},{"sl":10}]},"test_357":{"methods":[{"sl":7}],"name":"test_2","pass":true,"statements":[{"sl":8},{"sl":10}]},"test_762":{"methods":[{"sl":7}],"name":"test_1","pass":true,"statements":[{"sl":8},{"sl":10}]},"test_766":{"methods":[{"sl":7}],"name":"test_3","pass":true,"statements":[{"sl":8},{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [128, 766, 762, 283, 357], [128, 766, 762, 283, 357], [128], [766, 762, 283, 357], [], []]
