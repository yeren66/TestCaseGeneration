var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":21,"id":3459,"methods":[{"el":20,"sc":5,"sl":14}],"name":"IS_PALINDROME","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_206":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":19}]},"test_255":{"methods":[{"sl":14}],"name":"test_3","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_462":{"methods":[{"sl":14}],"name":"test_2","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":19}]},"test_463":{"methods":[{"sl":14}],"name":"test_5","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_474":{"methods":[{"sl":14}],"name":"test_6","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_706":{"methods":[{"sl":14}],"name":"test_0","pass":true,"statements":[{"sl":15},{"sl":19}]},"test_983":{"methods":[{"sl":14}],"name":"test_4","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [462, 206, 463, 983, 706, 474, 255], [462, 206, 463, 983, 706, 474, 255], [462, 206, 463, 983, 474, 255], [463, 474, 255], [], [462, 206, 983, 706], [], []]
