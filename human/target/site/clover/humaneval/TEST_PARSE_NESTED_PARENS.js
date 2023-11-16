var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":40,"id":7070,"methods":[{"el":17,"sc":5,"sl":8},{"el":28,"sc":5,"sl":19},{"el":39,"sc":5,"sl":30}],"name":"TEST_PARSE_NESTED_PARENS","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_288":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":10},{"sl":13}]},"test_796":{"methods":[{"sl":30}],"name":"test_2","pass":true,"statements":[{"sl":32},{"sl":35}]},"test_87":{"methods":[{"sl":19}],"name":"test_1","pass":true,"statements":[{"sl":21},{"sl":24}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [288], [], [288], [], [], [288], [], [], [], [], [], [87], [], [87], [], [], [87], [], [], [], [], [], [796], [], [796], [], [], [796], [], [], [], [], []]
