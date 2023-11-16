/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MODP {static class __CLR4_4_15au5aulp17t5y5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6891,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25au();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25au() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6870);
        __CLR4_4_15au5aulp17t5y5.R.inc(6871);int result = humaneval.correct.MODP.modp(3, 5);
        __CLR4_4_15au5aulp17t5y5.R.inc(6872);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5ax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5ax() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6873);
        __CLR4_4_15au5aulp17t5y5.R.inc(6874);int result = humaneval.correct.MODP.modp(1101, 101);
        __CLR4_4_15au5aulp17t5y5.R.inc(6875);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445b0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445b0() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6876);
        __CLR4_4_15au5aulp17t5y5.R.inc(6877);int result = humaneval.correct.MODP.modp(0, 101);
        __CLR4_4_15au5aulp17t5y5.R.inc(6878);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5b3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5b3() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6879);
        __CLR4_4_15au5aulp17t5y5.R.inc(6880);int result = humaneval.correct.MODP.modp(3, 11);
        __CLR4_4_15au5aulp17t5y5.R.inc(6881);org.junit.Assert.assertEquals(
            result, 8
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65b6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65b6() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6882);
        __CLR4_4_15au5aulp17t5y5.R.inc(6883);int result = humaneval.correct.MODP.modp(100, 101);
        __CLR4_4_15au5aulp17t5y5.R.inc(6884);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5b9() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6885);
        __CLR4_4_15au5aulp17t5y5.R.inc(6886);int result = humaneval.correct.MODP.modp(30, 5);
        __CLR4_4_15au5aulp17t5y5.R.inc(6887);org.junit.Assert.assertEquals(
            result, 4
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15au5aulp17t5y5.R.globalSliceStart(getClass().getName(),6888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15au5aulp17t5y5.R.rethrow($CLV_t2$);}finally{__CLR4_4_15au5aulp17t5y5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MODP.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85bc() throws java.lang.Exception{try{__CLR4_4_15au5aulp17t5y5.R.inc(6888);
        __CLR4_4_15au5aulp17t5y5.R.inc(6889);int result = humaneval.correct.MODP.modp(31, 5);
        __CLR4_4_15au5aulp17t5y5.R.inc(6890);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_15au5aulp17t5y5.R.flushNeeded();}}
}
