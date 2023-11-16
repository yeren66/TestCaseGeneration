var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3575,"methods":[{"el":19,"sc":5,"sl":6}],"name":"LONGEST","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_395":{"methods":[{"sl":6}],"name":"test_1","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":14},{"sl":15}]},"test_907":{"methods":[{"sl":6}],"name":"test_2","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":13},{"sl":14},{"sl":15}]},"test_951":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":13},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [907, 395, 951], [907, 395, 951], [907, 395, 951], [907, 395], [907, 395], [], [], [907, 395, 951], [907, 395], [907, 395], [], [], [951], [], []]
