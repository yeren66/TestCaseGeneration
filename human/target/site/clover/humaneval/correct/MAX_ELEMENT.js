var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":15,"id":3651,"methods":[{"el":14,"sc":5,"sl":6}],"name":"MAX_ELEMENT","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_125":{"methods":[{"sl":6}],"name":"test_2","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":13}]},"test_742":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13}]},"test_952":{"methods":[{"sl":6}],"name":"test_1","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [125, 952, 742], [125, 952, 742], [125, 952, 742], [125, 952, 742], [952, 742], [], [], [125, 952, 742], [], []]
