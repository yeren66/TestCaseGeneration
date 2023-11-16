var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":7055,"methods":[{"el":12,"sc":5,"sl":6},{"el":20,"sc":5,"sl":14},{"el":28,"sc":5,"sl":22},{"el":36,"sc":5,"sl":30},{"el":44,"sc":5,"sl":38}],"name":"TEST_PARSE_MUSIC","sl":5}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1080":{"methods":[{"sl":6}],"name":"test_0","pass":true,"statements":[{"sl":8},{"sl":9}]},"test_262":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":17}]},"test_301":{"methods":[{"sl":22}],"name":"test_2","pass":true,"statements":[{"sl":24},{"sl":25}]},"test_364":{"methods":[{"sl":38}],"name":"test_4","pass":true,"statements":[{"sl":40},{"sl":41}]},"test_811":{"methods":[{"sl":30}],"name":"test_3","pass":true,"statements":[{"sl":32},{"sl":33}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [1080], [], [1080], [1080], [], [], [], [], [262], [], [262], [262], [], [], [], [], [301], [], [301], [301], [], [], [], [], [811], [], [811], [811], [], [], [], [], [364], [], [364], [364], [], [], [], []]
