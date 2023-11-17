var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":5849,"methods":[{"el":12,"sc":5,"sl":4},{"el":22,"sc":5,"sl":14},{"el":32,"sc":5,"sl":24},{"el":42,"sc":5,"sl":34},{"el":52,"sc":5,"sl":44}],"name":"TEST_FIX_SPACES","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_205":{"methods":[{"sl":24}],"name":"test_2","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_260":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":19}]},"test_518":{"methods":[{"sl":34}],"name":"test_3","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_677":{"methods":[{"sl":44}],"name":"test_4","pass":true,"statements":[{"sl":46},{"sl":49}]},"test_934":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [934], [], [934], [], [], [934], [], [], [], [], [260], [], [260], [], [], [260], [], [], [], [], [205], [], [205], [], [], [205], [], [], [], [], [518], [], [518], [], [], [518], [], [], [], [], [677], [], [677], [], [], [677], [], [], [], []]
