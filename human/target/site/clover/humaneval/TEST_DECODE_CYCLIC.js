var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":5365,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28}],"name":"TEST_DECODE_CYCLIC","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_170":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_589":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_744":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_955":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [589], [], [589], [589], [], [], [], [], [170], [], [170], [170], [], [], [], [], [744], [], [744], [744], [], [], [], [], [955], [], [955], [955], [], [], [], []]
