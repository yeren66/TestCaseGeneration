var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":4493,"methods":[{"el":20,"sc":5,"sl":13}],"name":"STRING_TO_MD5","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_310":{"methods":[{"sl":13}],"name":"test_2","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_448":{"methods":[{"sl":13}],"name":"test_3","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_567":{"methods":[{"sl":13}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_693":{"methods":[{"sl":13}],"name":"test_1","pass":true,"statements":[{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [310, 693, 448, 567], [310, 693, 448, 567], [], [310, 448, 567], [310, 448, 567], [310, 448, 567], [310, 448, 567], [], []]
