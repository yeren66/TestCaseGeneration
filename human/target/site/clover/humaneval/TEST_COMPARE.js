var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":5164,"methods":[{"el":12,"sc":5,"sl":4},{"el":22,"sc":5,"sl":14},{"el":32,"sc":5,"sl":24},{"el":42,"sc":5,"sl":34}],"name":"TEST_COMPARE","sl":3}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_186":{"methods":[{"sl":34}],"name":"test_3","pass":true,"statements":[{"sl":36},{"sl":39}]},"test_426":{"methods":[{"sl":4}],"name":"test_0","pass":true,"statements":[{"sl":6},{"sl":9}]},"test_79":{"methods":[{"sl":24}],"name":"test_2","pass":true,"statements":[{"sl":26},{"sl":29}]},"test_830":{"methods":[{"sl":14}],"name":"test_1","pass":true,"statements":[{"sl":16},{"sl":19}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [426], [], [426], [], [], [426], [], [], [], [], [830], [], [830], [], [], [830], [], [], [], [], [79], [], [79], [], [], [79], [], [], [], [], [186], [], [186], [], [], [186], [], [], [], []]
