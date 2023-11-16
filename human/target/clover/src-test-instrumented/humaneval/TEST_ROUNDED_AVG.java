/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ROUNDED_AVG {static class __CLR4_4_15nh5nhlp0zmir4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7373,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25nh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7325,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25nh() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7325);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7326);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(1, 5);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7327);String desired = "11";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7328);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5nl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5nl() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7329);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7330);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(7, 13);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7331);String desired = "1010";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7332);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445np();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445np() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7333);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7334);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(964, 977);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7335);String desired = "1111001010";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7336);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5nt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7337,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5nt() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7337);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7338);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(996, 997);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7339);String desired = "1111100100";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7340);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65nx() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7341);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7342);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(560, 851);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7343);String desired = "1011000001";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7344);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5o1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7345,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5o1() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7345);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7346);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(185, 546);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7347);String desired = "101101101";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7348);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85o5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7349,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85o5() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7349);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7350);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(362, 496);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7351);String desired = "110101101";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7352);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5o9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7353,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5o9() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7353);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7354);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(350, 902);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7355);String desired = "1001110010";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7356);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7357,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5od() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7357);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7358);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(197, 233);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7359);String desired = "11010111";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7360);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7361,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75oh() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7361);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7362);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(7, 5);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7363);String desired = "-1";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7364);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x5ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7365,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x5ol() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7365);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7366);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(5, 1);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7367);String desired = "-1";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7368);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_15nh5nhlp0zmir4.R.globalSliceStart(getClass().getName(),7369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg5op();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15nh5nhlp0zmir4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15nh5nhlp0zmir4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ROUNDED_AVG.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7369,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg5op() throws java.lang.Exception{try{__CLR4_4_15nh5nhlp0zmir4.R.inc(7369);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7370);String result = humaneval.correct.ROUNDED_AVG.rounded_avg(5, 5);
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7371);String desired = "101";
        __CLR4_4_15nh5nhlp0zmir4.R.inc(7372);org.junit.Assert.assertEquals(result, desired);
    }finally{__CLR4_4_15nh5nhlp0zmir4.R.flushNeeded();}}
}