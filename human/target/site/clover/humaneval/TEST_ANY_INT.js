var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":4855,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28},{"el":42,"sc":5,"sl":36},{"el":50,"sc":5,"sl":44},{"el":58,"sc":5,"sl":52},{"el":66,"sc":5,"sl":60},{"el":74,"sc":5,"sl":68}],"name":"TEST_ANY_INT","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1006":{"methods":[{"sl":44}],"name":"test_5","pass":true,"statements":[{"sl":46},{"sl":47}]},"test_1084":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_216":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_241":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]},"test_456":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":38},{"sl":39}]},"test_703":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_837":{"methods":[{"sl":68}],"name":"test_8","pass":true,"statements":[{"sl":70},{"sl":71}]},"test_84":{"methods":[{"sl":52}],"name":"test_6","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_913":{"methods":[{"sl":60}],"name":"test_7","pass":true,"statements":[{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [216], [], [216], [216], [], [], [], [], [1084], [], [1084], [1084], [], [], [], [], [703], [], [703], [703], [], [], [], [], [241], [], [241], [241], [], [], [], [], [456], [], [456], [456], [], [], [], [], [1006], [], [1006], [1006], [], [], [], [], [84], [], [84], [84], [], [], [], [], [913], [], [913], [913], [], [], [], [], [837], [], [837], [837], [], [], [], []]
