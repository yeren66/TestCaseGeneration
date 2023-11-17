var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":4939,"methods":[{"el":13,"sc":5,"sl":7},{"el":20,"sc":5,"sl":14},{"el":27,"sc":5,"sl":21},{"el":34,"sc":5,"sl":28},{"el":41,"sc":5,"sl":35}],"name":"TEST_BY_LENGTH","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_261":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12}]},"test_56":{"methods":[{"sl":21}],"name":"test_2","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]},"test_607":{"methods":[{"sl":35}],"name":"test_4","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_657":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_927":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [261], [], [261], [261], [261], [261], [], [657], [], [657], [657], [657], [657], [], [56], [], [56], [56], [56], [56], [], [927], [], [927], [927], [927], [927], [], [607], [], [607], [607], [607], [607], [], []]
