var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":5692,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28},{"el":42,"sc":5,"sl":36},{"el":50,"sc":5,"sl":44},{"el":58,"sc":5,"sl":52}],"name":"TEST_FIBFIB","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":44}],"name":"test_5","pass":true,"statements":[{"sl":46},{"sl":47}]},"test_200":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_331":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_538":{"methods":[{"sl":52}],"name":"test_6","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_675":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_902":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":38},{"sl":39}]},"test_99":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [331], [], [331], [331], [], [], [], [], [675], [], [675], [675], [], [], [], [], [200], [], [200], [200], [], [], [], [], [99], [], [99], [99], [], [], [], [], [902], [], [902], [902], [], [], [], [], [123], [], [123], [123], [], [], [], [], [538], [], [538], [538], [], [], [], []]
