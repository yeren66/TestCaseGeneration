/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ANY_INT {static class __CLR4_4_13qv3qvlp17t5d8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,4882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23qv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23qv() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4855);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4856);boolean result = humaneval.correct.ANY_INT.any_int(2, 3, 1);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4857);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3qy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3qy() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4858);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4859);boolean result = humaneval.correct.ANY_INT.any_int(2.5, 2, 3);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4860);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443r1() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4861);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4862);boolean result = humaneval.correct.ANY_INT.any_int(1.5, 5, 3.5);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4863);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3r4() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4864);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4865);boolean result = humaneval.correct.ANY_INT.any_int(2, 6, 2);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4866);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63r7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63r7() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4867);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4868);boolean result = humaneval.correct.ANY_INT.any_int(4, 2, 2);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4869);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3ra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3ra() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4870);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4871);boolean result = humaneval.correct.ANY_INT.any_int(2.2, 2.2, 2.2);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4872);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83rd() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4873);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4874);boolean result = humaneval.correct.ANY_INT.any_int(-4, 6, 2);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4875);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r3rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r3rg() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4876);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4877);boolean result = humaneval.correct.ANY_INT.any_int(2, 1, 1);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4878);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_13qv3qvlp17t5d8.R.globalSliceStart(getClass().getName(),4879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq3rj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qv3qvlp17t5d8.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qv3qvlp17t5d8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANY_INT.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq3rj() throws java.lang.Exception{try{__CLR4_4_13qv3qvlp17t5d8.R.inc(4879);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4880);boolean result = humaneval.correct.ANY_INT.any_int(3, 4, 7);
        __CLR4_4_13qv3qvlp17t5d8.R.inc(4881);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13qv3qvlp17t5d8.R.flushNeeded();}}
}
