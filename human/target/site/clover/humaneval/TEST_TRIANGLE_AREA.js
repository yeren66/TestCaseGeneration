var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":27,"id":8078,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20}],"name":"TEST_TRIANGLE_AREA","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_718":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_80":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_861":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [80], [], [80], [80], [], [], [], [], [718], [], [718], [718], [], [], [], [], [861], [], [861], [861], [], [], [], []]
