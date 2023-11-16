var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":8268,"methods":[{"el":12,"sc":2,"sl":7},{"el":18,"sc":2,"sl":13},{"el":24,"sc":2,"sl":19},{"el":30,"sc":2,"sl":25},{"el":36,"sc":2,"sl":31},{"el":42,"sc":2,"sl":37}],"name":"TEST_WORDS_STRINGS","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_600":{"methods":[{"sl":19}],"name":"test_2","pass":true,"statements":[{"sl":21},{"sl":22},{"sl":23}]},"test_684":{"methods":[{"sl":25}],"name":"test_3","pass":true,"statements":[{"sl":27},{"sl":28},{"sl":29}]},"test_746":{"methods":[{"sl":13}],"name":"test_1","pass":true,"statements":[{"sl":15},{"sl":16},{"sl":17}]},"test_806":{"methods":[{"sl":37}],"name":"test_5","pass":true,"statements":[{"sl":39},{"sl":40},{"sl":41}]},"test_921":{"methods":[{"sl":31}],"name":"test_4","pass":true,"statements":[{"sl":33},{"sl":34},{"sl":35}]},"test_929":{"methods":[{"sl":7}],"name":"test_0","pass":true,"statements":[{"sl":9},{"sl":10},{"sl":11}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [929], [], [929], [929], [929], [], [746], [], [746], [746], [746], [], [600], [], [600], [600], [600], [], [684], [], [684], [684], [684], [], [921], [], [921], [921], [921], [], [806], [], [806], [806], [806], [], []]
