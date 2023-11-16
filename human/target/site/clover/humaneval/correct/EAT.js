var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":2790,"methods":[{"el":38,"sc":5,"sl":31}],"name":"EAT","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1025":{"methods":[{"sl":31}],"name":"test_1","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_222":{"methods":[{"sl":31}],"name":"test_4","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_662":{"methods":[{"sl":31}],"name":"test_3","pass":true,"statements":[{"sl":32},{"sl":36}]},"test_685":{"methods":[{"sl":31}],"name":"test_5","pass":true,"statements":[{"sl":32},{"sl":36}]},"test_853":{"methods":[{"sl":31}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":33}]},"test_898":{"methods":[{"sl":31}],"name":"test_0","pass":true,"statements":[{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [662, 898, 853, 1025, 222, 685], [662, 898, 853, 1025, 222, 685], [898, 853, 1025, 222], [], [], [662, 685], [], [], []]
