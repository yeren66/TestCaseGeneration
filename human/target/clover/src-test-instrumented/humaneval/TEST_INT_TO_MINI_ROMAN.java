/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_INT_TO_MINI_ROMAN {static class __CLR4_4_14s04s0lp17t5su{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6221,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6192);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24s0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6192,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24s0() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6192);
        __CLR4_4_14s04s0lp17t5su.R.inc(6193);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(19);
        __CLR4_4_14s04s0lp17t5su.R.inc(6194);org.junit.Assert.assertEquals(
            result, "xix"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6195,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4s3() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6195);
        __CLR4_4_14s04s0lp17t5su.R.inc(6196);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(152);
        __CLR4_4_14s04s0lp17t5su.R.inc(6197);org.junit.Assert.assertEquals(
            result, "clii"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6198);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4s6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6198,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4s6() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6198);
        __CLR4_4_14s04s0lp17t5su.R.inc(6199);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(251);
        __CLR4_4_14s04s0lp17t5su.R.inc(6200);org.junit.Assert.assertEquals(
            result, "ccli"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64s9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64s9() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6201);
        __CLR4_4_14s04s0lp17t5su.R.inc(6202);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(426);
        __CLR4_4_14s04s0lp17t5su.R.inc(6203);org.junit.Assert.assertEquals(
            result, "cdxxvi"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4sc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4sc() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6204);
        __CLR4_4_14s04s0lp17t5su.R.inc(6205);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(500);
        __CLR4_4_14s04s0lp17t5su.R.inc(6206);org.junit.Assert.assertEquals(
            result, "d"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84sf() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6207);
        __CLR4_4_14s04s0lp17t5su.R.inc(6208);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(1);
        __CLR4_4_14s04s0lp17t5su.R.inc(6209);org.junit.Assert.assertEquals(
            result, "i"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4si() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6210);
        __CLR4_4_14s04s0lp17t5su.R.inc(6211);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(4);
        __CLR4_4_14s04s0lp17t5su.R.inc(6212);org.junit.Assert.assertEquals(
            result, "iv"
        );
    }finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14s04s0lp17t5su.R.globalSliceStart(getClass().getName(),6213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14s04s0lp17t5su.R.rethrow($CLV_t2$);}finally{__CLR4_4_14s04s0lp17t5su.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_INT_TO_MINI_ROMAN.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4sl() throws java.lang.Exception{try{__CLR4_4_14s04s0lp17t5su.R.inc(6213);
        __CLR4_4_14s04s0lp17t5su.R.inc(6214);int[] inputs = new int[] {43, 90, 94, 532, 900, 994, 1000};
        __CLR4_4_14s04s0lp17t5su.R.inc(6215);String[] outputs = new String[] {"xliii", "xc", "xciv", "dxxxii", "cm", "cmxciv", "m"};
        __CLR4_4_14s04s0lp17t5su.R.inc(6216);for (int i = 0; (((i < inputs.length)&&(__CLR4_4_14s04s0lp17t5su.R.iget(6217)!=0|true))||(__CLR4_4_14s04s0lp17t5su.R.iget(6218)==0&false)); i += 1){{
            __CLR4_4_14s04s0lp17t5su.R.inc(6219);String result = humaneval.correct.INT_TO_MINI_ROMAN.int_to_mini_roman(inputs[i]);
            __CLR4_4_14s04s0lp17t5su.R.inc(6220);org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }}finally{__CLR4_4_14s04s0lp17t5su.R.flushNeeded();}}

}
