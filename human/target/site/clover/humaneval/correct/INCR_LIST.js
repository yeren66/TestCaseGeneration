var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":3311,"methods":[{"el":20,"sc":5,"sl":13}],"name":"INCR_LIST","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_580":{"methods":[{"sl":13}],"name":"test_0","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":19}]},"test_618":{"methods":[{"sl":13}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":19}]},"test_875":{"methods":[{"sl":13}],"name":"test_2","pass":true,"statements":[{"sl":14},{"sl":16},{"sl":17},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [580, 618, 875], [580, 618, 875], [], [580, 618, 875], [618, 875], [], [580, 618, 875], [], []]
