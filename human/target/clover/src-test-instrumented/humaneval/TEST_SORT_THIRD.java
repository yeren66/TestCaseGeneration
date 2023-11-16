/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_SORT_THIRD {static class __CLR4_4_15yl5yllp17t660{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7746,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25yl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7725,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25yl() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7725);
        __CLR4_4_15yl5yllp17t660.R.inc(7726);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7727);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 2, 3).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5yo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7728,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5yo() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7728);
        __CLR4_4_15yl5yllp17t660.R.inc(7729);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7730);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 3, -5, 2, -3, 3, 5, 0, 123, 9, -10).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445yr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445yr() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7731);
        __CLR4_4_15yl5yllp17t660.R.inc(7732);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 8, -12, 4, 23, 2, 3, 11, 12, -10))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7733);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(-10, 8, -12, 3, 23, 2, 4, 11, 12, 5).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5yu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5yu() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7734);
        __CLR4_4_15yl5yllp17t660.R.inc(7735);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 3, 4, 8, 9, 2))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7736);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 3, 4, 8, 9, 5).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65yx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65yx() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7737);
        __CLR4_4_15yl5yllp17t660.R.inc(7738);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 8, 3, 4, 6, 9, 2))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7739);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 8, 3, 4, 6, 9, 5).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5z0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5z0() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7740);
        __CLR4_4_15yl5yllp17t660.R.inc(7741);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 9, 4, 8, 3, 2))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7742);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 9, 4, 8, 3, 5).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15yl5yllp17t660.R.globalSliceStart(getClass().getName(),7743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85z3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15yl5yllp17t660.R.rethrow($CLV_t2$);}finally{__CLR4_4_15yl5yllp17t660.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORT_THIRD.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85z3() throws java.lang.Exception{try{__CLR4_4_15yl5yllp17t660.R.inc(7743);
        __CLR4_4_15yl5yllp17t660.R.inc(7744);List<Integer> result = humaneval.correct.SORT_THIRD.sort_third(
            new ArrayList<Integer>(Arrays.asList(5, 6, 3, 4, 8, 9, 2, 1))
        );
        __CLR4_4_15yl5yllp17t660.R.inc(7745);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(2, 6, 3, 4, 8, 9, 5, 1).toArray()
        );
    }finally{__CLR4_4_15yl5yllp17t660.R.flushNeeded();}}
}
