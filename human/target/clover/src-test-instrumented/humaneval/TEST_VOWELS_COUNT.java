/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_VOWELS_COUNT {static class __CLR4_4_16c06c0lp0zmiym{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,8229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp26c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8208,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp26c0() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8208);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8209);int result = humaneval.correct.VOWELS_COUNT.vowels_count("abcde");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8210);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl6c3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8211,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl6c3() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8211);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8212);int result = humaneval.correct.VOWELS_COUNT.vowels_count("Alone");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8213);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k446c6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8214,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k446c6() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8214);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8215);int result = humaneval.correct.VOWELS_COUNT.vowels_count("key");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8216);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn6c9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8217,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn6c9() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8217);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8218);int result = humaneval.correct.VOWELS_COUNT.vowels_count("bye");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8219);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj66cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8220,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj66cc() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8220);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8221);int result = humaneval.correct.VOWELS_COUNT.vowels_count("keY");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8222);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp6cf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8223,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp6cf() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8223);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8224);int result = humaneval.correct.VOWELS_COUNT.vowels_count("bYe");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8225);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_16c06c0lp0zmiym.R.globalSliceStart(getClass().getName(),8226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy86ci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16c06c0lp0zmiym.R.rethrow($CLV_t2$);}finally{__CLR4_4_16c06c0lp0zmiym.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_VOWELS_COUNT.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8226,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy86ci() throws java.lang.Exception{try{__CLR4_4_16c06c0lp0zmiym.R.inc(8226);
        __CLR4_4_16c06c0lp0zmiym.R.inc(8227);int result = humaneval.correct.VOWELS_COUNT.vowels_count("ACEDY");
        __CLR4_4_16c06c0lp0zmiym.R.inc(8228);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_16c06c0lp0zmiym.R.flushNeeded();}}
}
