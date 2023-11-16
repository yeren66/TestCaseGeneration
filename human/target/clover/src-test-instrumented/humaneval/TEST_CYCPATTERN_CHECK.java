/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CYCPATTERN_CHECK {static class __CLR4_4_1447447lp0zmibx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2447();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5335,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2447() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5335);
        __CLR4_4_1447447lp0zmibx.R.inc(5336);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("xyzw", "xyw");
        __CLR4_4_1447447lp0zmibx.R.inc(5337);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl44a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl44a() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5338);
        __CLR4_4_1447447lp0zmibx.R.inc(5339);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("yello", "ell");
        __CLR4_4_1447447lp0zmibx.R.inc(5340);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4444d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5341,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4444d() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5341);
        __CLR4_4_1447447lp0zmibx.R.inc(5342);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("whattup", "ptut");
        __CLR4_4_1447447lp0zmibx.R.inc(5343);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn44g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn44g() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5344);
        __CLR4_4_1447447lp0zmibx.R.inc(5345);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("efef", "fee");
        __CLR4_4_1447447lp0zmibx.R.inc(5346);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj644j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5347,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj644j() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5347);
        __CLR4_4_1447447lp0zmibx.R.inc(5348);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("abab", "aabb");
        __CLR4_4_1447447lp0zmibx.R.inc(5349);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_1447447lp0zmibx.R.globalSliceStart(getClass().getName(),5350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp44m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1447447lp0zmibx.R.rethrow($CLV_t2$);}finally{__CLR4_4_1447447lp0zmibx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CYCPATTERN_CHECK.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp44m() throws java.lang.Exception{try{__CLR4_4_1447447lp0zmibx.R.inc(5350);
        __CLR4_4_1447447lp0zmibx.R.inc(5351);boolean result = humaneval.correct.CYCPATTERN_CHECK.cycpattern_check("winemtt", "tinem");
        __CLR4_4_1447447lp0zmibx.R.inc(5352);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_1447447lp0zmibx.R.flushNeeded();}}
}
