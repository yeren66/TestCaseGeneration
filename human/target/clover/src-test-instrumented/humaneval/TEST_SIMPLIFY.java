/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SIMPLIFY {static class __CLR4_4_15ro5rolp17t641{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7506,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25ro() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7476);
        __CLR4_4_15ro5rolp17t641.R.inc(7477);boolean result = humaneval.correct.SIMPLIFY.simplify("1/5", "5/1");
        __CLR4_4_15ro5rolp17t641.R.inc(7478);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5rr() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7479);
        __CLR4_4_15ro5rolp17t641.R.inc(7480);boolean result = humaneval.correct.SIMPLIFY.simplify("1/6", "2/1");
        __CLR4_4_15ro5rolp17t641.R.inc(7481);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445ru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445ru() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7482);
        __CLR4_4_15ro5rolp17t641.R.inc(7483);boolean result = humaneval.correct.SIMPLIFY.simplify("5/1", "3/1");
        __CLR4_4_15ro5rolp17t641.R.inc(7484);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5rx() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7485);
        __CLR4_4_15ro5rolp17t641.R.inc(7486);boolean result = humaneval.correct.SIMPLIFY.simplify("7/10", "10/2");
        __CLR4_4_15ro5rolp17t641.R.inc(7487);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65s0() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7488);
        __CLR4_4_15ro5rolp17t641.R.inc(7489);boolean result = humaneval.correct.SIMPLIFY.simplify("2/10", "50/10");
        __CLR4_4_15ro5rolp17t641.R.inc(7490);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5s3() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7491);
        __CLR4_4_15ro5rolp17t641.R.inc(7492);boolean result = humaneval.correct.SIMPLIFY.simplify("7/2", "4/2");
        __CLR4_4_15ro5rolp17t641.R.inc(7493);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85s6() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7494);
        __CLR4_4_15ro5rolp17t641.R.inc(7495);boolean result = humaneval.correct.SIMPLIFY.simplify("11/6", "6/1");
        __CLR4_4_15ro5rolp17t641.R.inc(7496);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5s9() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7497);
        __CLR4_4_15ro5rolp17t641.R.inc(7498);boolean result = humaneval.correct.SIMPLIFY.simplify("2/3", "5/2");
        __CLR4_4_15ro5rolp17t641.R.inc(7499);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5sc() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7500);
        __CLR4_4_15ro5rolp17t641.R.inc(7501);boolean result = humaneval.correct.SIMPLIFY.simplify("5/2", "3/5");
        __CLR4_4_15ro5rolp17t641.R.inc(7502);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15ro5rolp17t641.R.globalSliceStart(getClass().getName(),7503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ro5rolp17t641.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ro5rolp17t641.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SIMPLIFY.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75sf() throws java.lang.Exception{try{__CLR4_4_15ro5rolp17t641.R.inc(7503);
        __CLR4_4_15ro5rolp17t641.R.inc(7504);boolean result = humaneval.correct.SIMPLIFY.simplify("2/4", "8/4");
        __CLR4_4_15ro5rolp17t641.R.inc(7505);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ro5rolp17t641.R.flushNeeded();}}
}
