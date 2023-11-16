var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":5192,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20}],"name":"TEST_CONCATENATE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_115":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_719":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_765":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [719], [], [719], [719], [], [], [], [], [115], [], [115], [115], [], [], [], [], [765], [], [765], [765], [], [], [], []]
