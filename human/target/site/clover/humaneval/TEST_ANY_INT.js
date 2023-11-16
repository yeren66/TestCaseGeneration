var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":75,"id":4873,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28},{"el":42,"sc":5,"sl":36},{"el":50,"sc":5,"sl":44},{"el":58,"sc":5,"sl":52},{"el":66,"sc":5,"sl":60},{"el":74,"sc":5,"sl":68}],"name":"TEST_ANY_INT","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1059":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_126":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]},"test_133":{"methods":[{"sl":44}],"name":"test_5","pass":true,"statements":[{"sl":46},{"sl":47}]},"test_220":{"methods":[{"sl":68}],"name":"test_8","pass":true,"statements":[{"sl":70},{"sl":71}]},"test_254":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":38},{"sl":39}]},"test_480":{"methods":[{"sl":52}],"name":"test_6","pass":true,"statements":[{"sl":54},{"sl":55}]},"test_485":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]},"test_604":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_931":{"methods":[{"sl":60}],"name":"test_7","pass":true,"statements":[{"sl":62},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [1059], [], [1059], [1059], [], [], [], [], [126], [], [126], [126], [], [], [], [], [604], [], [604], [604], [], [], [], [], [485], [], [485], [485], [], [], [], [], [254], [], [254], [254], [], [], [], [], [133], [], [133], [133], [], [], [], [], [480], [], [480], [480], [], [], [], [], [931], [], [931], [931], [], [], [], [], [220], [], [220], [220], [], [], [], []]
