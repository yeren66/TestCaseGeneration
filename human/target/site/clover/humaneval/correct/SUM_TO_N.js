var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":19,"id":4564,"methods":[{"el":18,"sc":5,"sl":16}],"name":"SUM_TO_N","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_207":{"methods":[{"sl":16}],"name":"test_2","pass":true,"statements":[{"sl":17}]},"test_593":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":17}]},"test_615":{"methods":[{"sl":16}],"name":"test_4","pass":true,"statements":[{"sl":17}]},"test_651":{"methods":[{"sl":16}],"name":"test_1","pass":true,"statements":[{"sl":17}]},"test_79":{"methods":[{"sl":16}],"name":"test_0","pass":true,"statements":[{"sl":17}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [207, 79, 615, 593, 651], [207, 79, 615, 593, 651], [], []]
