/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ORDER_BY_POINTS {static class __CLR4_4_15eq5eqlp0zmiou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25eq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7010,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25eq() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7010);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7011);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1, 11, -1, -11, -12}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7012);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-1, -11, 1, -12, 11}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5et();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7013,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5et() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7013);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7014);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1234,423,463,145,2,423,423,53,6,37,3457,3,56,0,46}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7015);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {0, 2, 3, 6, 53, 423, 423, 423, 1234, 145, 37, 46, 56, 463, 3457}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445ew();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7016,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445ew() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7016);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7017);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7018);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7019,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5ez() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7019);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7020);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1, -11, -32, 43, 54, -98, 2, -3}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7021);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-3, -32, -98, -11, 1, 2, 43, 54}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7022,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65f2() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7022);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7023);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {1,2,3,4,5,6,7,8,9,10,11}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7024);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {1, 10, 2, 11, 3, 4, 5, 6, 7, 8, 9}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15eq5eqlp0zmiou.R.globalSliceStart(getClass().getName(),7025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5f5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15eq5eqlp0zmiou.R.rethrow($CLV_t2$);}finally{__CLR4_4_15eq5eqlp0zmiou.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ORDER_BY_POINTS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7025,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5f5() throws java.lang.Exception{try{__CLR4_4_15eq5eqlp0zmiou.R.inc(7025);
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7026);Integer[] result = humaneval.correct.ORDER_BY_POINTS.order_by_points(
            new Integer[] {0,6,6,-76,-21,23,4}
        );
        __CLR4_4_15eq5eqlp0zmiou.R.inc(7027);org.junit.Assert.assertArrayEquals(
            result, new Integer[] {-76, -21, 0, 4, 23, 6, 6}
        );
    }finally{__CLR4_4_15eq5eqlp0zmiou.R.flushNeeded();}}
}
