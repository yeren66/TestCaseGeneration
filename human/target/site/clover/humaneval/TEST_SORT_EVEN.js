var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":7701,"methods":[{"el":14,"sc":5,"sl":6},{"el":24,"sc":5,"sl":16},{"el":34,"sc":5,"sl":26}],"name":"TEST_SORT_EVEN","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":11}]},"test_393":{"methods":[{"sl":26}],"name":"test_2","pass":true,"statements":[{"sl":28},{"sl":31}]},"test_773":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [10], [], [10], [], [], [10], [], [], [], [], [773], [], [773], [], [], [773], [], [], [], [], [393], [], [393], [], [], [393], [], [], [], []]
