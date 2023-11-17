var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":58,"id":5359,"methods":[{"el":13,"sc":5,"sl":4},{"el":24,"sc":5,"sl":15},{"el":35,"sc":5,"sl":26},{"el":46,"sc":5,"sl":37},{"el":57,"sc":5,"sl":48}],"name":"TEST_DECODE_SHIFT","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_142":{"methods":[{"sl":15}],"name":"test_1","pass":true,"statements":[{"sl":17},{"sl":18},{"sl":21}]},"test_157":{"methods":[{"sl":26}],"name":"test_2","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":32}]},"test_189":{"methods":[{"sl":48}],"name":"test_4","pass":true,"statements":[{"sl":50},{"sl":51},{"sl":54}]},"test_522":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7},{"sl":10}]},"test_543":{"methods":[{"sl":37}],"name":"test_3","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [522], [], [522], [522], [], [], [522], [], [], [], [], [142], [], [142], [142], [], [], [142], [], [], [], [], [157], [], [157], [157], [], [], [157], [], [], [], [], [543], [], [543], [543], [], [], [543], [], [], [], [], [189], [], [189], [189], [], [], [189], [], [], [], []]
