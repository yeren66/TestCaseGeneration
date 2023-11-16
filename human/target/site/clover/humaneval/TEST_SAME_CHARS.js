var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":59,"id":7373,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28},{"el":42,"sc":5,"sl":36},{"el":50,"sc":5,"sl":44},{"el":58,"sc":5,"sl":52}],"name":"TEST_SAME_CHARS","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_116":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_211":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_293":{"methods":[{"sl":52}],"name":"test_6","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_410":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_582":{"methods":[{"sl":44}],"name":"test_5","pass":true,"statements":[{"sl":46},{"sl":47}]},"test_859":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]},"test_882":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":38},{"sl":39}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [211], [], [211], [211], [], [], [], [], [116], [], [116], [116], [], [], [], [], [410], [], [410], [410], [], [], [], [], [859], [], [859], [859], [], [], [], [], [882], [], [882], [882], [], [], [], [], [582], [], [582], [582], [], [], [], [], [293], [], [293], [293], [], [], [], []]
