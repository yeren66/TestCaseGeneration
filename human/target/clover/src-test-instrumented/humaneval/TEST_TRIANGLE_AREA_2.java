/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_TRIANGLE_AREA_2 {static class __CLR4_4_168n68nlp0zmixp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,8114,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp268n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp268n() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8087);
        __CLR4_4_168n68nlp0zmixp.R.inc(8088);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(3, 4, 5);
        __CLR4_4_168n68nlp0zmixp.R.inc(8089);org.junit.Assert.assertEquals(
            result, 6, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl68q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8090,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl68q() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8090);
        __CLR4_4_168n68nlp0zmixp.R.inc(8091);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(1, 2, 10);
        __CLR4_4_168n68nlp0zmixp.R.inc(8092);org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4468t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4468t() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8093);
        __CLR4_4_168n68nlp0zmixp.R.inc(8094);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(4, 8, 5);
        __CLR4_4_168n68nlp0zmixp.R.inc(8095);org.junit.Assert.assertEquals(
            result, 8.18, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn68w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8096,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn68w() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8096);
        __CLR4_4_168n68nlp0zmixp.R.inc(8097);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(2, 2, 2);
        __CLR4_4_168n68nlp0zmixp.R.inc(8098);org.junit.Assert.assertEquals(
            result, 1.73, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj668z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8099,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj668z() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8099);
        __CLR4_4_168n68nlp0zmixp.R.inc(8100);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(1, 2, 3);
        __CLR4_4_168n68nlp0zmixp.R.inc(8101);org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp692();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp692() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8102);
        __CLR4_4_168n68nlp0zmixp.R.inc(8103);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(10, 5, 7);
        __CLR4_4_168n68nlp0zmixp.R.inc(8104);org.junit.Assert.assertEquals(
            result, 16.25, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy8695();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8105,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy8695() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8105);
        __CLR4_4_168n68nlp0zmixp.R.inc(8106);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(2, 6, 3);
        __CLR4_4_168n68nlp0zmixp.R.inc(8107);org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r698();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8108,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r698() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8108);
        __CLR4_4_168n68nlp0zmixp.R.inc(8109);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(1, 1, 1);
        __CLR4_4_168n68nlp0zmixp.R.inc(8110);org.junit.Assert.assertEquals(
            result, 0.43, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_168n68nlp0zmixp.R.globalSliceStart(getClass().getName(),8111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq69b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_168n68nlp0zmixp.R.rethrow($CLV_t2$);}finally{__CLR4_4_168n68nlp0zmixp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIANGLE_AREA_2.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8111,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq69b() throws java.lang.Exception{try{__CLR4_4_168n68nlp0zmixp.R.inc(8111);
        __CLR4_4_168n68nlp0zmixp.R.inc(8112);double result = humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(2, 2, 10);
        __CLR4_4_168n68nlp0zmixp.R.inc(8113);org.junit.Assert.assertEquals(
            result, -1, 1e-6
        );
    }finally{__CLR4_4_168n68nlp0zmixp.R.flushNeeded();}}
}
