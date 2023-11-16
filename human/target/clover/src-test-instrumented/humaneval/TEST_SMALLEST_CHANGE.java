/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SMALLEST_CHANGE {static class __CLR4_4_15t95t9lp0zmisy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25t9() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7533);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7534);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 5, 4, 7, 9, 6});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7535);org.junit.Assert.assertEquals(
            result, 4
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5tc() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7536);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7537);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 4, 3, 2, 2});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7538);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445tf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445tf() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7539);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7540);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1, 4, 2});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7541);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5ti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5ti() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7542);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7543);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1, 4, 4, 2});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7544);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65tl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65tl() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7545);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7546);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1, 2, 3, 2, 1});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7547);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5to();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5to() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7548);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7549);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {3, 1, 1, 3});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7550);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85tr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85tr() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7551);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7552);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {1});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7553);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15t95t9lp0zmisy.R.globalSliceStart(getClass().getName(),7554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5tu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15t95t9lp0zmisy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15t95t9lp0zmisy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SMALLEST_CHANGE.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5tu() throws java.lang.Exception{try{__CLR4_4_15t95t9lp0zmisy.R.inc(7554);
        __CLR4_4_15t95t9lp0zmisy.R.inc(7555);int result = humaneval.correct.SMALLEST_CHANGE.smallest_change(new int[] {0, 1});
        __CLR4_4_15t95t9lp0zmisy.R.inc(7556);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15t95t9lp0zmisy.R.flushNeeded();}}
}
