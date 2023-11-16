var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":7746,"methods":[{"el":7,"sc":5,"sl":4},{"el":11,"sc":5,"sl":8},{"el":15,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16}],"name":"TEST_SPECIAL_FACTORIAL","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_103":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6}]},"test_12":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":14}]},"test_209":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":18}]},"test_722":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":10}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [103], [], [103], [], [722], [], [722], [], [12], [], [12], [], [209], [], [209], [], []]
