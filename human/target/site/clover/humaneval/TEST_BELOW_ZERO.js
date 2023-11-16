var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":4918,"methods":[{"el":13,"sc":5,"sl":7},{"el":21,"sc":5,"sl":15},{"el":29,"sc":5,"sl":23},{"el":37,"sc":5,"sl":31},{"el":45,"sc":5,"sl":39},{"el":53,"sc":5,"sl":47}],"name":"TEST_BELOW_ZERO","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_456":{"methods":[{"sl":31}],"name":"test_3","pass":true,"statements":[{"sl":33},{"sl":36}]},"test_526":{"methods":[{"sl":47}],"name":"test_5","pass":true,"statements":[{"sl":49},{"sl":52}]},"test_583":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":12}]},"test_676":{"methods":[{"sl":39}],"name":"test_4","pass":true,"statements":[{"sl":41},{"sl":44}]},"test_754":{"methods":[{"sl":15}],"name":"test_1","pass":true,"statements":[{"sl":17},{"sl":20}]},"test_798":{"methods":[{"sl":23}],"name":"test_2","pass":true,"statements":[{"sl":25},{"sl":28}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [583], [], [583], [], [], [583], [], [], [754], [], [754], [], [], [754], [], [], [798], [], [798], [], [], [798], [], [], [456], [], [456], [], [], [456], [], [], [676], [], [676], [], [], [676], [], [], [526], [], [526], [], [], [526], [], []]
