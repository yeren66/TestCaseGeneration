/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_HAPPY {static class __CLR4_4_14ui4uilp0zmikz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6306,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6282);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24ui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6282,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24ui() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6282);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6283);boolean result = humaneval.correct.IS_HAPPY.is_happy("a");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6284);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4ul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6285,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4ul() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6285);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6286);boolean result = humaneval.correct.IS_HAPPY.is_happy("aa");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6287);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6288,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444uo() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6288);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6289);boolean result = humaneval.correct.IS_HAPPY.is_happy("abcd");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6290);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6291);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4ur();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6291,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4ur() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6291);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6292);boolean result = humaneval.correct.IS_HAPPY.is_happy("aabb");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6293);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64uu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6294,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64uu() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6294);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6295);boolean result = humaneval.correct.IS_HAPPY.is_happy("abd");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6296);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4ux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6297,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4ux() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6297);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6298);boolean result = humaneval.correct.IS_HAPPY.is_happy("xyy");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6299);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84v0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6300,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84v0() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6300);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6301);boolean result = humaneval.correct.IS_HAPPY.is_happy("iopaxpoi");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6302);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14ui4uilp0zmikz.R.globalSliceStart(getClass().getName(),6303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4v3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ui4uilp0zmikz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ui4uilp0zmikz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_HAPPY.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6303,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4v3() throws java.lang.Exception{try{__CLR4_4_14ui4uilp0zmikz.R.inc(6303);
        __CLR4_4_14ui4uilp0zmikz.R.inc(6304);boolean result = humaneval.correct.IS_HAPPY.is_happy("iopaxioi");
        __CLR4_4_14ui4uilp0zmikz.R.inc(6305);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14ui4uilp0zmikz.R.flushNeeded();}}
}
