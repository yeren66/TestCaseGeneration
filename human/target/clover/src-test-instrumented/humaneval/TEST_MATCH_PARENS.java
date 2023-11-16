/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MATCH_PARENS {static class __CLR4_4_153n53nlp0zmimq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp253n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6611,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp253n() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6611);
        __CLR4_4_153n53nlp0zmimq.R.inc(6612);String[] input = {"()(", ")"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6613);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6614);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl53r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl53r() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6615);
        __CLR4_4_153n53nlp0zmimq.R.inc(6616);String[] input = {")", ")"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6617);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6618);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4453v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6619,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4453v() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6619);
        __CLR4_4_153n53nlp0zmimq.R.inc(6620);String[] input = {"(()(())", "())())"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6621);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6622);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn53z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn53z() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6623);
        __CLR4_4_153n53nlp0zmimq.R.inc(6624);String[] input = {")())", "(()()("};
        __CLR4_4_153n53nlp0zmimq.R.inc(6625);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6626);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj6543();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj6543() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6627);
        __CLR4_4_153n53nlp0zmimq.R.inc(6628);String[] input = {"(())))", "(()())(("};
        __CLR4_4_153n53nlp0zmimq.R.inc(6629);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6630);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp547();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6631,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp547() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6631);
        __CLR4_4_153n53nlp0zmimq.R.inc(6632);String[] input = {"()", "())"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6633);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6634);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy854b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6635,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy854b() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6635);
        __CLR4_4_153n53nlp0zmimq.R.inc(6636);String[] input = {"(()(", "()))()"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6637);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6638);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r54f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r54f() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6639);
        __CLR4_4_153n53nlp0zmimq.R.inc(6640);String[] input = {"((((", "((())"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6641);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6642);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq54j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6643,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq54j() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6643);
        __CLR4_4_153n53nlp0zmimq.R.inc(6644);String[] input = {")(()", "(()("};
        __CLR4_4_153n53nlp0zmimq.R.inc(6645);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6646);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f754n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f754n() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6647);
        __CLR4_4_153n53nlp0zmimq.R.inc(6648);String[] input = {")(", ")("};
        __CLR4_4_153n53nlp0zmimq.R.inc(6649);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6650);org.junit.Assert.assertEquals("No", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x54r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6651,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x54r() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6651);
        __CLR4_4_153n53nlp0zmimq.R.inc(6652);String[] input = {"(", ")"};
        __CLR4_4_153n53nlp0zmimq.R.inc(6653);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6654);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_153n53nlp0zmimq.R.globalSliceStart(getClass().getName(),6655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg54v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_153n53nlp0zmimq.R.rethrow($CLV_t2$);}finally{__CLR4_4_153n53nlp0zmimq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MATCH_PARENS.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6655,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg54v() throws java.lang.Exception{try{__CLR4_4_153n53nlp0zmimq.R.inc(6655);
        __CLR4_4_153n53nlp0zmimq.R.inc(6656);String[] input = {")", "("};
        __CLR4_4_153n53nlp0zmimq.R.inc(6657);String result = humaneval.correct.MATCH_PARENS.match_parens(input);
        __CLR4_4_153n53nlp0zmimq.R.inc(6658);org.junit.Assert.assertEquals("Yes", result);
    }finally{__CLR4_4_153n53nlp0zmimq.R.flushNeeded();}}
}
