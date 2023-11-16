var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":6723,"methods":[{"el":9,"sc":5,"sl":4},{"el":15,"sc":5,"sl":10},{"el":21,"sc":5,"sl":16},{"el":27,"sc":5,"sl":22},{"el":33,"sc":5,"sl":28}],"name":"TEST_MAX_FILL","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1050":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7},{"sl":8}]},"test_306":{"methods":[{"sl":16}],"name":"test_2","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_566":{"methods":[{"sl":10}],"name":"test_1","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_823":{"methods":[{"sl":22}],"name":"test_3","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_896":{"methods":[{"sl":28}],"name":"test_4","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [1050], [], [1050], [1050], [1050], [], [566], [], [566], [566], [566], [], [306], [], [306], [306], [306], [], [823], [], [823], [823], [823], [], [896], [], [896], [896], [896], [], []]
