var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":37,"id":6995,"methods":[{"el":15,"sc":5,"sl":7},{"el":25,"sc":5,"sl":16},{"el":36,"sc":5,"sl":26}],"name":"TEST_ODD_COUNT","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1073":{"methods":[{"sl":26}],"name":"test_2","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":35}]},"test_504":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":24}]},"test_648":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":14}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [648], [], [648], [648], [648], [], [], [648], [], [504], [], [504], [504], [504], [], [], [], [504], [], [1073], [], [1073], [1073], [1073], [], [], [], [], [1073], [], []]
