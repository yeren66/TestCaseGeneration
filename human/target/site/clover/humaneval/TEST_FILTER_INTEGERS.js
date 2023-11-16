var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":5781,"methods":[{"el":14,"sc":5,"sl":6},{"el":26,"sc":5,"sl":16},{"el":38,"sc":5,"sl":28}],"name":"TEST_FILTER_INTEGERS","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_43":{"methods":[{"sl":28}],"name":"test_2","pass":true,"statements":[{"sl":30},{"sl":35}]},"test_443":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_696":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [443], [], [443], [], [], [443], [], [], [], [], [696], [], [696], [], [], [], [], [696], [], [], [], [], [43], [], [43], [], [], [], [], [43], [], [], [], []]
