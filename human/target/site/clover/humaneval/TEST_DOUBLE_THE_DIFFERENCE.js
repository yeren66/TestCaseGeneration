var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":82,"id":5432,"methods":[{"el":12,"sc":5,"sl":4},{"el":22,"sc":5,"sl":14},{"el":32,"sc":5,"sl":24},{"el":42,"sc":5,"sl":34},{"el":52,"sc":5,"sl":44},{"el":62,"sc":5,"sl":54},{"el":81,"sc":5,"sl":64}],"name":"TEST_DOUBLE_THE_DIFFERENCE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":34}],"name":"test_3","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_106":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":19}]},"test_1068":{"methods":[{"sl":54}],"name":"test_5","pass":true,"statements":[{"sl":56},{"sl":59}]},"test_168":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":9}]},"test_465":{"methods":[{"sl":44}],"name":"test_4","pass":true,"statements":[{"sl":46},{"sl":49}]},"test_644":{"methods":[{"sl":64}],"name":"test_6","pass":true,"statements":[{"sl":66},{"sl":67},{"sl":68},{"sl":69},{"sl":70},{"sl":71},{"sl":73},{"sl":75},{"sl":78}]},"test_662":{"methods":[{"sl":24}],"name":"test_2","pass":true,"statements":[{"sl":26},{"sl":29}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [168], [], [168], [], [], [168], [], [], [], [], [106], [], [106], [], [], [106], [], [], [], [], [662], [], [662], [], [], [662], [], [], [], [], [101], [], [101], [], [], [101], [], [], [], [], [465], [], [465], [], [], [465], [], [], [], [], [1068], [], [1068], [], [], [1068], [], [], [], [], [644], [], [644], [644], [644], [644], [644], [644], [], [644], [], [644], [], [], [644], [], [], [], []]
