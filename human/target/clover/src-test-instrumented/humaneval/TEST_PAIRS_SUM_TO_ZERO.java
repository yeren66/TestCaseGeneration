/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.Arrays;

public class TEST_PAIRS_SUM_TO_ZERO {static class __CLR4_4_15f85f8lp17t5zu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7055,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25f8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7028,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25f8() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7028);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7029);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 3, 5, 0)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7030);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5fb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5fb() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7031);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7032);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 3, -2, 1)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7033);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445fe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7034,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445fe() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7034);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7035);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1, 2, 3, 7)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7036);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7037,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5fh() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7037);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7038);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(2, 4, -5, 3, 5, 7)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7039);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7040,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65fk() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7040);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7041);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(1)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7042);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7043,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5fn() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7043);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7044);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 3, 2, 30)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7045);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85fq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7046,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85fq() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7046);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7047);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 3, 2, 31)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7048);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5ft();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5ft() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7049);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7050);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 4, 2, 30)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7051);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15f85f8lp17t5zu.R.globalSliceStart(getClass().getName(),7052);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5fw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15f85f8lp17t5zu.R.rethrow($CLV_t2$);}finally{__CLR4_4_15f85f8lp17t5zu.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PAIRS_SUM_TO_ZERO.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7052,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5fw() throws java.lang.Exception{try{__CLR4_4_15f85f8lp17t5zu.R.inc(7052);
        __CLR4_4_15f85f8lp17t5zu.R.inc(7053);boolean result = humaneval.correct.PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(
            Arrays.asList(-3, 9, -1, 4, 2, 31)
        );
        __CLR4_4_15f85f8lp17t5zu.R.inc(7054);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15f85f8lp17t5zu.R.flushNeeded();}}
}
