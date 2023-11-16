var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":11,"id":4596,"methods":[{"el":10,"sc":5,"sl":8}],"name":"TRIANGLE_AREA","sl":7}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_718":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":9}]},"test_80":{"methods":[{"sl":8}],"name":"test_0","pass":true,"statements":[{"sl":9}]},"test_861":{"methods":[{"sl":8}],"name":"test_2","pass":true,"statements":[{"sl":9}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [80, 861, 718], [80, 861, 718], [], []]
