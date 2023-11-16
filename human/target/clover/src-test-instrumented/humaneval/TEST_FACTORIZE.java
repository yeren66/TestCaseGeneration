/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.Arrays;
import java.util.List;

public class TEST_FACTORIZE {static class __CLR4_4_14cp4cplp17t5lq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5665,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5641,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24cp() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5641);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5642);List<Integer> result = humaneval.correct.FACTORIZE.factorize(2);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5643);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5644,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4cs() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5644);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5645);List<Integer> result = humaneval.correct.FACTORIZE.factorize(4);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5646);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 2).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444cv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5647,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444cv() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5647);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5648);List<Integer> result = humaneval.correct.FACTORIZE.factorize(8);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5649);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 2, 2).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4cy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5650,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4cy() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5650);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5651);List<Integer> result = humaneval.correct.FACTORIZE.factorize(3 * 19);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5652);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 19).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64d1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5653,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64d1() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5653);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5654);List<Integer> result = humaneval.correct.FACTORIZE.factorize(3 * 19 * 3 * 19);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5655);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 3, 19, 19).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4d4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5656,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4d4() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5656);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5657);List<Integer> result = humaneval.correct.FACTORIZE.factorize(3 * 19 * 3 * 19 * 3 * 19);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5658);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 3, 3, 19, 19, 19).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84d7() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5659);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5660);List<Integer> result = humaneval.correct.FACTORIZE.factorize(3 * 19 * 19 * 19);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5661);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(3, 19, 19, 19).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14cp4cplp17t5lq.R.globalSliceStart(getClass().getName(),5662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14cp4cplp17t5lq.R.rethrow($CLV_t2$);}finally{__CLR4_4_14cp4cplp17t5lq.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FACTORIZE.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5662,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4da() throws java.lang.Exception{try{__CLR4_4_14cp4cplp17t5lq.R.inc(5662);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5663);List<Integer> result = humaneval.correct.FACTORIZE.factorize(3 * 2 * 3);
        __CLR4_4_14cp4cplp17t5lq.R.inc(5664);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 3, 3).toArray()
        );
    }finally{__CLR4_4_14cp4cplp17t5lq.R.flushNeeded();}}
}
