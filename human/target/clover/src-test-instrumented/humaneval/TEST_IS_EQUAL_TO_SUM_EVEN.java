/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_EQUAL_TO_SUM_EVEN {static class __CLR4_4_14u24u2lp17t5tl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6282,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24u2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6266,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24u2() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6266);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6267);org.junit.Assert.assertEquals(false, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4u4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6268,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4u4() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6268);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6269);org.junit.Assert.assertEquals(false, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444u6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6270,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444u6() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6270);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6271);org.junit.Assert.assertEquals(true, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4u8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6272,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4u8() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6272);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6273);org.junit.Assert.assertEquals(true, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(10));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64ua();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6274,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64ua() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6274);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6275);org.junit.Assert.assertEquals(false, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(11));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4uc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6276,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4uc() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6276);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6277);org.junit.Assert.assertEquals(true, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(12));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84ue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6278,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84ue() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6278);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6279);org.junit.Assert.assertEquals(false, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(13));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14u24u2lp17t5tl.R.globalSliceStart(getClass().getName(),6280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4ug();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14u24u2lp17t5tl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14u24u2lp17t5tl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_EQUAL_TO_SUM_EVEN.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4ug() throws java.lang.Exception{try{__CLR4_4_14u24u2lp17t5tl.R.inc(6280);
        __CLR4_4_14u24u2lp17t5tl.R.inc(6281);org.junit.Assert.assertEquals(true, humaneval.correct.IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(16));
    }finally{__CLR4_4_14u24u2lp17t5tl.R.flushNeeded();}}
}
