var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":13,"id":3301,"methods":[{"el":12,"sc":5,"sl":4}],"name":"HOW_MANY_TIMES","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1069":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":11}]},"test_243":{"methods":[{"sl":4}],"name":"test_3","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":11}]},"test_678":{"methods":[{"sl":4}],"name":"test_1","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":11}]},"test_792":{"methods":[{"sl":4}],"name":"test_2","pass":true,"statements":[{"sl":5},{"sl":6},{"sl":7},{"sl":8},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [1069, 792, 243, 678], [1069, 792, 243, 678], [1069, 792, 243, 678], [792, 243, 678], [792, 243, 678], [], [], [1069, 792, 243, 678], [], []]
