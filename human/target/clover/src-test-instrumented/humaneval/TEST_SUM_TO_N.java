/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SUM_TO_N {static class __CLR4_4_1664664lp0zmixb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,8011,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1664664lp0zmixb.R.globalSliceStart(getClass().getName(),7996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2664();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1664664lp0zmixb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1664664lp0zmixb.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_TO_N.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7996,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2664() throws java.lang.Exception{try{__CLR4_4_1664664lp0zmixb.R.inc(7996);
        __CLR4_4_1664664lp0zmixb.R.inc(7997);int result = humaneval.correct.SUM_TO_N.sum_to_n(1);
        __CLR4_4_1664664lp0zmixb.R.inc(7998);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_1664664lp0zmixb.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1664664lp0zmixb.R.globalSliceStart(getClass().getName(),7999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl667();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1664664lp0zmixb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1664664lp0zmixb.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_TO_N.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7999,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl667() throws java.lang.Exception{try{__CLR4_4_1664664lp0zmixb.R.inc(7999);
        __CLR4_4_1664664lp0zmixb.R.inc(8000);int result = humaneval.correct.SUM_TO_N.sum_to_n(6);
        __CLR4_4_1664664lp0zmixb.R.inc(8001);org.junit.Assert.assertEquals(
            result, 21
        );
    }finally{__CLR4_4_1664664lp0zmixb.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1664664lp0zmixb.R.globalSliceStart(getClass().getName(),8002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4466a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1664664lp0zmixb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1664664lp0zmixb.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_TO_N.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8002,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4466a() throws java.lang.Exception{try{__CLR4_4_1664664lp0zmixb.R.inc(8002);
        __CLR4_4_1664664lp0zmixb.R.inc(8003);int result = humaneval.correct.SUM_TO_N.sum_to_n(11);
        __CLR4_4_1664664lp0zmixb.R.inc(8004);org.junit.Assert.assertEquals(
            result, 66
        );
    }finally{__CLR4_4_1664664lp0zmixb.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1664664lp0zmixb.R.globalSliceStart(getClass().getName(),8005);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn66d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1664664lp0zmixb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1664664lp0zmixb.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_TO_N.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8005,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn66d() throws java.lang.Exception{try{__CLR4_4_1664664lp0zmixb.R.inc(8005);
        __CLR4_4_1664664lp0zmixb.R.inc(8006);int result = humaneval.correct.SUM_TO_N.sum_to_n(30);
        __CLR4_4_1664664lp0zmixb.R.inc(8007);org.junit.Assert.assertEquals(
            result, 465
        );
    }finally{__CLR4_4_1664664lp0zmixb.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1664664lp0zmixb.R.globalSliceStart(getClass().getName(),8008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj666g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1664664lp0zmixb.R.rethrow($CLV_t2$);}finally{__CLR4_4_1664664lp0zmixb.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_TO_N.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8008,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj666g() throws java.lang.Exception{try{__CLR4_4_1664664lp0zmixb.R.inc(8008);
        __CLR4_4_1664664lp0zmixb.R.inc(8009);int result = humaneval.correct.SUM_TO_N.sum_to_n(100);
        __CLR4_4_1664664lp0zmixb.R.inc(8010);org.junit.Assert.assertEquals(
            result, 5050
        );
    }finally{__CLR4_4_1664664lp0zmixb.R.flushNeeded();}}
}
