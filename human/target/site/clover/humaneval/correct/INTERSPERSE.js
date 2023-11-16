var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":3342,"methods":[{"el":19,"sc":5,"sl":7}],"name":"INTERSPERSE","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_252":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":11}]},"test_524":{"methods":[{"sl":7}],"name":"test_1","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18}]},"test_831":{"methods":[{"sl":7}],"name":"test_2","pass":true,"statements":[{"sl":8},{"sl":10},{"sl":13},{"sl":14},{"sl":15},{"sl":17},{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [252, 831, 524], [252, 831, 524], [], [252, 831, 524], [252], [], [831, 524], [831, 524], [831, 524], [], [831, 524], [831, 524], [], []]
