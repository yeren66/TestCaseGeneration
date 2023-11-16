var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":6151,"methods":[{"el":8,"sc":5,"sl":4},{"el":13,"sc":5,"sl":9},{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":19},{"el":28,"sc":5,"sl":24},{"el":33,"sc":5,"sl":29},{"el":38,"sc":5,"sl":34},{"el":43,"sc":5,"sl":39}],"name":"TEST_INTERSECTION","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1073":{"methods":[{"sl":9}],"name":"test_1","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_201":{"methods":[{"sl":39}],"name":"test_7","pass":true,"statements":[{"sl":41},{"sl":42}]},"test_216":{"methods":[{"sl":29}],"name":"test_5","pass":true,"statements":[{"sl":31},{"sl":32}]},"test_223":{"methods":[{"sl":19}],"name":"test_3","pass":true,"statements":[{"sl":21},{"sl":22}]},"test_461":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_473":{"methods":[{"sl":24}],"name":"test_4","pass":true,"statements":[{"sl":26},{"sl":27}]},"test_938":{"methods":[{"sl":14}],"name":"test_2","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_971":{"methods":[{"sl":34}],"name":"test_6","pass":true,"statements":[{"sl":36},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [461], [], [461], [461], [], [1073], [], [1073], [1073], [], [938], [], [938], [938], [], [223], [], [223], [223], [], [473], [], [473], [473], [], [216], [], [216], [216], [], [971], [], [971], [971], [], [201], [], [201], [201], [], []]
