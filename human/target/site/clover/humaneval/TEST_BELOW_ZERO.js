var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":4900,"methods":[{"el":13,"sc":5,"sl":7},{"el":21,"sc":5,"sl":15},{"el":29,"sc":5,"sl":23},{"el":37,"sc":5,"sl":31},{"el":45,"sc":5,"sl":39},{"el":53,"sc":5,"sl":47}],"name":"TEST_BELOW_ZERO","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_150":{"methods":[{"sl":23}],"name":"test_2","pass":true,"statements":[{"sl":25},{"sl":28}]},"test_169":{"methods":[{"sl":47}],"name":"test_5","pass":true,"statements":[{"sl":49},{"sl":52}]},"test_231":{"methods":[{"sl":39}],"name":"test_4","pass":true,"statements":[{"sl":41},{"sl":44}]},"test_61":{"methods":[{"sl":15}],"name":"test_1","pass":true,"statements":[{"sl":17},{"sl":20}]},"test_668":{"methods":[{"sl":31}],"name":"test_3","pass":true,"statements":[{"sl":33},{"sl":36}]},"test_77":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":12}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [77], [], [77], [], [], [77], [], [], [61], [], [61], [], [], [61], [], [], [150], [], [150], [], [], [150], [], [], [668], [], [668], [], [], [668], [], [], [231], [], [231], [], [], [231], [], [], [169], [], [169], [], [], [169], [], []]
