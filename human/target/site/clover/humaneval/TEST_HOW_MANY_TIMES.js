var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":35,"id":6130,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28}],"name":"TEST_HOW_MANY_TIMES","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_691":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]},"test_783":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_804":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_933":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [933], [], [933], [933], [], [], [], [], [783], [], [783], [783], [], [], [], [], [804], [], [804], [804], [], [], [], [], [691], [], [691], [691], [], [], [], []]
