var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":5394,"methods":[{"el":7,"sc":5,"sl":4},{"el":11,"sc":5,"sl":8},{"el":15,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":24},{"el":31,"sc":5,"sl":28}],"name":"TEST_DIGITS","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1044":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":14}]},"test_297":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":18}]},"test_433":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6}]},"test_455":{"methods":[{"sl":24}],"name":"test_5","pass":true,"statements":[{"sl":26}]},"test_652":{"methods":[{"sl":20}],"name":"test_4","pass":true,"statements":[{"sl":22}]},"test_719":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":10}]},"test_823":{"methods":[{"sl":28}],"name":"test_6","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [433], [], [433], [], [719], [], [719], [], [1044], [], [1044], [], [297], [], [297], [], [652], [], [652], [], [455], [], [455], [], [823], [], [823], [], []]
