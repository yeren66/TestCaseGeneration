var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":17,"id":2439,"methods":[{"el":16,"sc":5,"sl":14}],"name":"CAR_RACE_COLLISION","sl":13}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1085":{"methods":[{"sl":14}],"name":"test_3","pass":true,"statements":[{"sl":15}]},"test_301":{"methods":[{"sl":14}],"name":"test_4","pass":true,"statements":[{"sl":15}]},"test_428":{"methods":[{"sl":14}],"name":"test_2","pass":true,"statements":[{"sl":15}]},"test_641":{"methods":[{"sl":14}],"name":"test_0","pass":true,"statements":[{"sl":15}]},"test_704":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [428, 1085, 704, 641, 301], [428, 1085, 704, 641, 301], [], []]
