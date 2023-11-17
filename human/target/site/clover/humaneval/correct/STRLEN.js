var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":7,"id":4513,"methods":[{"el":6,"sc":5,"sl":4}],"name":"STRLEN","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_446":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5}]},"test_711":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5}]},"test_779":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [446, 711, 779], [446, 711, 779], [], []]
