var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":44,"id":5060,"methods":[{"el":7,"sc":5,"sl":4},{"el":11,"sc":5,"sl":8},{"el":15,"sc":5,"sl":12},{"el":19,"sc":5,"sl":16},{"el":23,"sc":5,"sl":20},{"el":27,"sc":5,"sl":24},{"el":31,"sc":5,"sl":28},{"el":35,"sc":5,"sl":32},{"el":39,"sc":5,"sl":36},{"el":43,"sc":5,"sl":40}],"name":"TEST_CHECK_IF_LAST_CHAR_IS_A_LETTER","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1011":{"methods":[{"sl":40}],"name":"test_9","pass":true,"statements":[{"sl":42}]},"test_121":{"methods":[{"sl":8}],"name":"test_1","pass":true,"statements":[{"sl":10}]},"test_262":{"methods":[{"sl":16}],"name":"test_3","pass":true,"statements":[{"sl":18}]},"test_41":{"methods":[{"sl":28}],"name":"test_6","pass":true,"statements":[{"sl":30}]},"test_546":{"methods":[{"sl":32}],"name":"test_7","pass":true,"statements":[{"sl":34}]},"test_587":{"methods":[{"sl":24}],"name":"test_5","pass":true,"statements":[{"sl":26}]},"test_631":{"methods":[{"sl":12}],"name":"test_2","pass":true,"statements":[{"sl":14}]},"test_861":{"methods":[{"sl":20}],"name":"test_4","pass":true,"statements":[{"sl":22}]},"test_871":{"methods":[{"sl":36}],"name":"test_8","pass":true,"statements":[{"sl":38}]},"test_921":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [921], [], [921], [], [121], [], [121], [], [631], [], [631], [], [262], [], [262], [], [861], [], [861], [], [587], [], [587], [], [41], [], [41], [], [546], [], [546], [], [871], [], [871], [], [1011], [], [1011], [], []]
