/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ISCUBE {static class __CLR4_4_14st4stlp0zmikm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6248,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6221,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24st() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6221);
        __CLR4_4_14st4stlp0zmikm.R.inc(6222);boolean result = humaneval.correct.ISCUBE.iscude(1);
        __CLR4_4_14st4stlp0zmikm.R.inc(6223);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6224,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4sw() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6224);
        __CLR4_4_14st4stlp0zmikm.R.inc(6225);boolean result = humaneval.correct.ISCUBE.iscude(2);
        __CLR4_4_14st4stlp0zmikm.R.inc(6226);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444sz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6227,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444sz() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6227);
        __CLR4_4_14st4stlp0zmikm.R.inc(6228);boolean result = humaneval.correct.ISCUBE.iscude(-1);
        __CLR4_4_14st4stlp0zmikm.R.inc(6229);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4t2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6230,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4t2() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6230);
        __CLR4_4_14st4stlp0zmikm.R.inc(6231);boolean result = humaneval.correct.ISCUBE.iscude(64);
        __CLR4_4_14st4stlp0zmikm.R.inc(6232);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6233,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64t5() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6233);
        __CLR4_4_14st4stlp0zmikm.R.inc(6234);boolean result = humaneval.correct.ISCUBE.iscude(180);
        __CLR4_4_14st4stlp0zmikm.R.inc(6235);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6236,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4t8() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6236);
        __CLR4_4_14st4stlp0zmikm.R.inc(6237);boolean result = humaneval.correct.ISCUBE.iscude(1000);
        __CLR4_4_14st4stlp0zmikm.R.inc(6238);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84tb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6239,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84tb() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6239);
        __CLR4_4_14st4stlp0zmikm.R.inc(6240);boolean result = humaneval.correct.ISCUBE.iscude(0);
        __CLR4_4_14st4stlp0zmikm.R.inc(6241);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4te();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4te() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6242);
        __CLR4_4_14st4stlp0zmikm.R.inc(6243);boolean result = humaneval.correct.ISCUBE.iscude(1729);
        __CLR4_4_14st4stlp0zmikm.R.inc(6244);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14st4stlp0zmikm.R.globalSliceStart(getClass().getName(),6245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4th();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14st4stlp0zmikm.R.rethrow($CLV_t2$);}finally{__CLR4_4_14st4stlp0zmikm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ISCUBE.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6245,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4th() throws java.lang.Exception{try{__CLR4_4_14st4stlp0zmikm.R.inc(6245);
        __CLR4_4_14st4stlp0zmikm.R.inc(6246);boolean result = humaneval.correct.ISCUBE.iscude(-8);
        __CLR4_4_14st4stlp0zmikm.R.inc(6247);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14st4stlp0zmikm.R.flushNeeded();}}
}
