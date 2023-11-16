var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":2371,"methods":[{"el":16,"sc":5,"sl":10}],"name":"BELOW_THRESHOLD","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_232":{"methods":[{"sl":10}],"name":"test_1","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_295":{"methods":[{"sl":10}],"name":"test_4","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":15}]},"test_35":{"methods":[{"sl":10}],"name":"test_3","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":15}]},"test_512":{"methods":[{"sl":10}],"name":"test_0","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":15}]},"test_738":{"methods":[{"sl":10}],"name":"test_5","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":13}]},"test_913":{"methods":[{"sl":10}],"name":"test_2","pass":true,"statements":[{"sl":11},{"sl":12},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [35, 913, 295, 738, 512, 232], [35, 913, 295, 738, 512, 232], [35, 913, 295, 738, 512, 232], [738, 232], [], [35, 913, 295, 512], [], []]
