var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":7775,"methods":[{"el":9,"sc":5,"sl":4},{"el":15,"sc":5,"sl":10},{"el":21,"sc":5,"sl":16},{"el":27,"sc":5,"sl":22},{"el":33,"sc":5,"sl":28},{"el":39,"sc":5,"sl":34},{"el":45,"sc":5,"sl":40},{"el":51,"sc":5,"sl":46}],"name":"TEST_SPLIT_WORDS","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_11":{"methods":[{"sl":10}],"name":"test_1","pass":true,"statements":[{"sl":12},{"sl":13},{"sl":14}]},"test_123":{"methods":[{"sl":28}],"name":"test_4","pass":true,"statements":[{"sl":30},{"sl":31},{"sl":32}]},"test_278":{"methods":[{"sl":22}],"name":"test_3","pass":true,"statements":[{"sl":24},{"sl":25},{"sl":26}]},"test_299":{"methods":[{"sl":16}],"name":"test_2","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20}]},"test_413":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7},{"sl":8}]},"test_445":{"methods":[{"sl":40}],"name":"test_6","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44}]},"test_701":{"methods":[{"sl":46}],"name":"test_7","pass":true,"statements":[{"sl":48},{"sl":49},{"sl":50}]},"test_88":{"methods":[{"sl":34}],"name":"test_5","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":38}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [413], [], [413], [413], [413], [], [11], [], [11], [11], [11], [], [299], [], [299], [299], [299], [], [278], [], [278], [278], [278], [], [123], [], [123], [123], [123], [], [88], [], [88], [88], [88], [], [445], [], [445], [445], [445], [], [701], [], [701], [701], [701], [], []]
