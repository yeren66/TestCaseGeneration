var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":29,"id":4982,"methods":[{"el":8,"sc":5,"sl":4},{"el":13,"sc":5,"sl":9},{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":19},{"el":28,"sc":5,"sl":24}],"name":"TEST_CAN_ARRANGE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1034":{"methods":[{"sl":9}],"name":"test_1","pass":true,"statements":[{"sl":11},{"sl":12}]},"test_723":{"methods":[{"sl":24}],"name":"test_4","pass":true,"statements":[{"sl":26},{"sl":27}]},"test_756":{"methods":[{"sl":14}],"name":"test_2","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_849":{"methods":[{"sl":19}],"name":"test_3","pass":true,"statements":[{"sl":21},{"sl":22}]},"test_937":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [937], [], [937], [937], [], [1034], [], [1034], [1034], [], [756], [], [756], [756], [], [849], [], [849], [849], [], [723], [], [723], [723], [], []]
