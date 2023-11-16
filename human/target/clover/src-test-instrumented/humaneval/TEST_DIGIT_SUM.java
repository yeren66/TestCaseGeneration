/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_DIGIT_SUM {static class __CLR4_4_1468468lp17t5jo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5432,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2468();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5408,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2468() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5408);
        __CLR4_4_1468468lp17t5jo.R.inc(5409);int result = humaneval.correct.DIGIT_SUM.digit_sum("");
        __CLR4_4_1468468lp17t5jo.R.inc(5410);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl46b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5411,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl46b() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5411);
        __CLR4_4_1468468lp17t5jo.R.inc(5412);int result = humaneval.correct.DIGIT_SUM.digit_sum("abAB");
        __CLR4_4_1468468lp17t5jo.R.inc(5413);org.junit.Assert.assertEquals(
            result, 131
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4446e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5414,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4446e() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5414);
        __CLR4_4_1468468lp17t5jo.R.inc(5415);int result = humaneval.correct.DIGIT_SUM.digit_sum("abcCd");
        __CLR4_4_1468468lp17t5jo.R.inc(5416);org.junit.Assert.assertEquals(
            result, 67
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn46h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5417,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn46h() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5417);
        __CLR4_4_1468468lp17t5jo.R.inc(5418);int result = humaneval.correct.DIGIT_SUM.digit_sum("helloE");
        __CLR4_4_1468468lp17t5jo.R.inc(5419);org.junit.Assert.assertEquals(
            result, 69
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj646k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5420,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj646k() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5420);
        __CLR4_4_1468468lp17t5jo.R.inc(5421);int result = humaneval.correct.DIGIT_SUM.digit_sum("woArBld");
        __CLR4_4_1468468lp17t5jo.R.inc(5422);org.junit.Assert.assertEquals(
            result, 131
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp46n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5423,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp46n() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5423);
        __CLR4_4_1468468lp17t5jo.R.inc(5424);int result = humaneval.correct.DIGIT_SUM.digit_sum("aAaaaXa");
        __CLR4_4_1468468lp17t5jo.R.inc(5425);org.junit.Assert.assertEquals(
            result, 153
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy846q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5426,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy846q() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5426);
        __CLR4_4_1468468lp17t5jo.R.inc(5427);int result = humaneval.correct.DIGIT_SUM.digit_sum(" How are yOu?");
        __CLR4_4_1468468lp17t5jo.R.inc(5428);org.junit.Assert.assertEquals(
            result, 151
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_1468468lp17t5jo.R.globalSliceStart(getClass().getName(),5429);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r46t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1468468lp17t5jo.R.rethrow($CLV_t2$);}finally{__CLR4_4_1468468lp17t5jo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_DIGIT_SUM.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5429,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r46t() throws java.lang.Exception{try{__CLR4_4_1468468lp17t5jo.R.inc(5429);
        __CLR4_4_1468468lp17t5jo.R.inc(5430);int result = humaneval.correct.DIGIT_SUM.digit_sum("You arE Very Smart");
        __CLR4_4_1468468lp17t5jo.R.inc(5431);org.junit.Assert.assertEquals(
            result, 327
        );
    }finally{__CLR4_4_1468468lp17t5jo.R.flushNeeded();}}
}
