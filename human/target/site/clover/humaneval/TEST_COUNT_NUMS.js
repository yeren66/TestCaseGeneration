var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":5234,"methods":[{"el":12,"sc":5,"sl":7},{"el":18,"sc":5,"sl":13},{"el":24,"sc":5,"sl":19},{"el":30,"sc":5,"sl":25},{"el":36,"sc":5,"sl":31},{"el":42,"sc":5,"sl":37},{"el":48,"sc":5,"sl":43},{"el":54,"sc":5,"sl":49}],"name":"TEST_COUNT_NUMS","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1055":{"methods":[{"sl":25}],"name":"test_3","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]},"test_344":{"methods":[{"sl":19}],"name":"test_2","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23}]},"test_387":{"methods":[{"sl":31}],"name":"test_4","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35}]},"test_397":{"methods":[{"sl":13}],"name":"test_1","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_430":{"methods":[{"sl":43}],"name":"test_6","pass":true,"statements":[{"sl":45},{"sl":46},{"sl":47}]},"test_49":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11}]},"test_879":{"methods":[{"sl":49}],"name":"test_7","pass":true,"statements":[{"sl":51},{"sl":52},{"sl":53}]},"test_907":{"methods":[{"sl":37}],"name":"test_5","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [49], [], [49], [49], [49], [], [397], [], [397], [397], [397], [], [344], [], [344], [344], [344], [], [1055], [], [1055], [1055], [1055], [], [387], [], [387], [387], [387], [], [907], [], [907], [907], [907], [], [430], [], [430], [430], [430], [], [879], [], [879], [879], [879], [], []]
