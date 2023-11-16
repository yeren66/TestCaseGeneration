/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MULTIPLY {static class __CLR4_4_15cn5cnlp0zmio9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6959,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25cn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6935,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25cn() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6935);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6936);int result = humaneval.correct.MULTIPLY.multiply(148, 412);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6937);org.junit.Assert.assertEquals(
            result, 16
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5cq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6938,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5cq() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6938);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6939);int result = humaneval.correct.MULTIPLY.multiply(19, 28);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6940);org.junit.Assert.assertEquals(
            result, 72
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445ct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6941,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445ct() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6941);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6942);int result = humaneval.correct.MULTIPLY.multiply(2020, 1851);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6943);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6944,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5cw() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6944);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6945);int result = humaneval.correct.MULTIPLY.multiply(14, -15);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6946);org.junit.Assert.assertEquals(
            result, 20
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6947,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65cz() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6947);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6948);int result = humaneval.correct.MULTIPLY.multiply(76, 67);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6949);org.junit.Assert.assertEquals(
            result, 42
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5d2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6950,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5d2() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6950);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6951);int result = humaneval.correct.MULTIPLY.multiply(17, 27);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6952);org.junit.Assert.assertEquals(
            result, 49
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85d5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6953,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85d5() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6953);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6954);int result = humaneval.correct.MULTIPLY.multiply(0, 1);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6955);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15cn5cnlp0zmio9.R.globalSliceStart(getClass().getName(),6956);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15cn5cnlp0zmio9.R.rethrow($CLV_t2$);}finally{__CLR4_4_15cn5cnlp0zmio9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MULTIPLY.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6956,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5d8() throws java.lang.Exception{try{__CLR4_4_15cn5cnlp0zmio9.R.inc(6956);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6957);int result = humaneval.correct.MULTIPLY.multiply(0, 0);
        __CLR4_4_15cn5cnlp0zmio9.R.inc(6958);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_15cn5cnlp0zmio9.R.flushNeeded();}}
}
