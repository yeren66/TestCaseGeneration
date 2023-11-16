var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":5790,"methods":[{"el":10,"sc":5,"sl":4},{"el":18,"sc":5,"sl":12},{"el":26,"sc":5,"sl":20},{"el":34,"sc":5,"sl":28},{"el":42,"sc":5,"sl":36}],"name":"TEST_FIND_CLOSEST_ELEMENTS","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1007":{"methods":[{"sl":36}],"name":"test_4","pass":true,"statements":[{"sl":38},{"sl":39}]},"test_21":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":7}]},"test_304":{"methods":[{"sl":20}],"name":"test_2","pass":true,"statements":[{"sl":22},{"sl":23}]},"test_546":{"methods":[{"sl":28}],"name":"test_3","pass":true,"statements":[{"sl":30},{"sl":31}]},"test_784":{"methods":[{"sl":12}],"name":"test_1","pass":true,"statements":[{"sl":14},{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [21], [], [21], [21], [], [], [], [], [784], [], [784], [784], [], [], [], [], [304], [], [304], [304], [], [], [], [], [546], [], [546], [546], [], [], [], [], [1007], [], [1007], [1007], [], [], [], []]
