var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":8156,"methods":[{"el":13,"sc":5,"sl":7},{"el":20,"sc":5,"sl":14},{"el":27,"sc":5,"sl":21},{"el":34,"sc":5,"sl":28}],"name":"TEST_UNIQUE_DIGITS","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_187":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32},{"sl":33}]},"test_343":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11},{"sl":12}]},"test_466":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":17},{"sl":18},{"sl":19}]},"test_891":{"methods":[{"sl":21}],"name":"test_2","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [343], [], [343], [343], [343], [343], [], [466], [], [466], [466], [466], [466], [], [891], [], [891], [891], [891], [891], [], [187], [], [187], [187], [187], [187], [], []]
