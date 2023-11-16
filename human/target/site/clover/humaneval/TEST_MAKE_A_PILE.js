var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":6576,"methods":[{"el":12,"sc":2,"sl":7},{"el":17,"sc":2,"sl":13},{"el":22,"sc":2,"sl":18},{"el":27,"sc":2,"sl":23},{"el":32,"sc":2,"sl":28}],"name":"TEST_MAKE_A_PILE","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_311":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [311], [], [311], [311], [311], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
