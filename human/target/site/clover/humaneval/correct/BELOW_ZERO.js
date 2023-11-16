var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":16,"id":2380,"methods":[{"el":15,"sc":5,"sl":6}],"name":"BELOW_ZERO","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_456":{"methods":[{"sl":6}],"name":"test_3","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":14}]},"test_526":{"methods":[{"sl":6}],"name":"test_5","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":11}]},"test_583":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":14}]},"test_676":{"methods":[{"sl":6}],"name":"test_4","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":11}]},"test_754":{"methods":[{"sl":6}],"name":"test_1","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":14}]},"test_798":{"methods":[{"sl":6}],"name":"test_2","pass":true,"statements":[{"sl":7},{"sl":8},{"sl":9},{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [754, 583, 456, 798, 676, 526], [754, 583, 456, 798, 676, 526], [754, 583, 456, 798, 676, 526], [754, 456, 798, 676, 526], [754, 456, 798, 676, 526], [798, 676, 526], [], [], [754, 583, 456], [], []]
