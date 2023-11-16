var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":5412,"methods":[{"el":7,"sc":5,"sl":4},{"el":11,"sc":5,"sl":8},{"el":15,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":24},{"el":31,"sc":5,"sl":28}],"name":"TEST_DIGITS","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1":{"methods":[{"sl":20}],"name":"test_4","pass":true,"statements":[{"sl":22}]},"test_39":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":14}]},"test_48":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":18}]},"test_483":{"methods":[{"sl":28}],"name":"test_6","pass":true,"statements":[{"sl":30}]},"test_551":{"methods":[{"sl":24}],"name":"test_5","pass":true,"statements":[{"sl":26}]},"test_628":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":10}]},"test_727":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [727], [], [727], [], [628], [], [628], [], [39], [], [39], [], [48], [], [48], [], [1], [], [1], [], [551], [], [551], [], [483], [], [483], [], []]
