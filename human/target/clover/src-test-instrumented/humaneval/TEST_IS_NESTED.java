/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_NESTED {static class __CLR4_4_14w04w0lp17t5ub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24w0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6336,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24w0() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6336);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6337);org.junit.Assert.assertEquals(true, humaneval.correct.IS_NESTED.is_nested("[[]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6338,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4w2() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6338);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6339);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[]]]]]]][[[[[]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6340,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444w4() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6340);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6341);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[][]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4w6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6342,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4w6() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6342);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6343);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64w8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6344,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64w8() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6344);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6345);org.junit.Assert.assertEquals(true, humaneval.correct.IS_NESTED.is_nested("[[[[]]]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4wa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6346,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4wa() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6346);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6347);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[]]]]]]]]]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84wc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6348,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84wc() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6348);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6349);org.junit.Assert.assertEquals(true, humaneval.correct.IS_NESTED.is_nested("[][][[]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4we();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6350,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4we() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6350);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6351);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[[]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6352,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4wg() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6352);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6353);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f74wi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6354,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f74wi() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6354);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6355);org.junit.Assert.assertEquals(true, humaneval.correct.IS_NESTED.is_nested("[[]][["));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x4wk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6356,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x4wk() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6356);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6357);org.junit.Assert.assertEquals(true, humaneval.correct.IS_NESTED.is_nested("[[][]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg4wm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6358,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg4wm() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6358);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6359);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested(""));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6360);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lolmz4wo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6360,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lolmz4wo() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6360);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6361);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("[[[[[[[["));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {__CLR4_4_14w04w0lp17t5ub.R.globalSliceStart(getClass().getName(),6362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12comui4wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14w04w0lp17t5ub.R.rethrow($CLV_t2$);}finally{__CLR4_4_14w04w0lp17t5ub.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_NESTED.test_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6362,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12comui4wq() throws java.lang.Exception{try{__CLR4_4_14w04w0lp17t5ub.R.inc(6362);
        __CLR4_4_14w04w0lp17t5ub.R.inc(6363);org.junit.Assert.assertEquals(false, humaneval.correct.IS_NESTED.is_nested("]]]]]]]]"));
    }finally{__CLR4_4_14w04w0lp17t5ub.R.flushNeeded();}}
}