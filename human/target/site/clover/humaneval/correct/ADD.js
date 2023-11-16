var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":2326,"methods":[{"el":12,"sc":5,"sl":10}],"name":"ADD","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1002":{"methods":[{"sl":10}],"name":"test_1","pass":true,"statements":[{"sl":11}]},"test_1060":{"methods":[{"sl":10}],"name":"test_0","pass":true,"statements":[{"sl":11}]},"test_322":{"methods":[{"sl":10}],"name":"test_2","pass":true,"statements":[{"sl":11}]},"test_476":{"methods":[{"sl":10}],"name":"test_4","pass":true,"statements":[{"sl":11}]},"test_479":{"methods":[{"sl":10}],"name":"test_3","pass":true,"statements":[{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [476, 479, 322, 1060, 1002], [476, 479, 322, 1060, 1002], [], []]
