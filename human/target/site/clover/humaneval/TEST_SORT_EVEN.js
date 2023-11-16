var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":7701,"methods":[{"el":14,"sc":5,"sl":6},{"el":24,"sc":5,"sl":16},{"el":34,"sc":5,"sl":26}],"name":"TEST_SORT_EVEN","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_140":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":21}]},"test_55":{"methods":[{"sl":26}],"name":"test_2","pass":true,"statements":[{"sl":28},{"sl":31}]},"test_858":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [858], [], [858], [], [], [858], [], [], [], [], [140], [], [140], [], [], [140], [], [], [], [], [55], [], [55], [], [], [55], [], [], [], []]
