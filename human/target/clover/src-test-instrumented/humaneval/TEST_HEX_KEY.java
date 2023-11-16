/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_HEX_KEY {static class __CLR4_4_14oc4oclp17t5rw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6081,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24oc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6060,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24oc() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6060);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6061);int result = humaneval.correct.HEX_KEY.hex_key("AB");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6062);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4of();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4of() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6063);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6064);int result = humaneval.correct.HEX_KEY.hex_key("1077E");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6065);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444oi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6066,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444oi() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6066);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6067);int result = humaneval.correct.HEX_KEY.hex_key("ABED1A33");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6068);org.junit.Assert.assertEquals(
            result, 4
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4ol() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6069);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6070);int result = humaneval.correct.HEX_KEY.hex_key("2020");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6071);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6072,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64oo() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6072);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6073);int result = humaneval.correct.HEX_KEY.hex_key("123456789ABCDEF0");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6074);org.junit.Assert.assertEquals(
            result, 6
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4or();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4or() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6075);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6076);int result = humaneval.correct.HEX_KEY.hex_key("112233445566778899AABBCCDDEEFF00");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6077);org.junit.Assert.assertEquals(
            result, 12
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14oc4oclp17t5rw.R.globalSliceStart(getClass().getName(),6078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84ou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14oc4oclp17t5rw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14oc4oclp17t5rw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HEX_KEY.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6078,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84ou() throws java.lang.Exception{try{__CLR4_4_14oc4oclp17t5rw.R.inc(6078);
        __CLR4_4_14oc4oclp17t5rw.R.inc(6079);int result = humaneval.correct.HEX_KEY.hex_key("");
        __CLR4_4_14oc4oclp17t5rw.R.inc(6080);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_14oc4oclp17t5rw.R.flushNeeded();}}
}
