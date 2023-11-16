/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_TRIPLES_SUM_TO_ZERO {static class __CLR4_4_169e69elp17t68l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,8141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp269e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp269e() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8114);
        __CLR4_4_169e69elp17t68l.R.inc(8115);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, 0}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8116);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl69h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8117,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl69h() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8117);
        __CLR4_4_169e69elp17t68l.R.inc(8118);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, -1}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8119);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4469k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8120,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4469k() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8120);
        __CLR4_4_169e69elp17t68l.R.inc(8121);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, -2, 1}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8122);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn69n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8123,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn69n() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8123);
        __CLR4_4_169e69elp17t68l.R.inc(8124);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 2, 3, 7}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8125);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj669q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8126,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj669q() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8126);
        __CLR4_4_169e69elp17t68l.R.inc(8127);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 2, 5, 7}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8128);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp69t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8129,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp69t() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8129);
        __CLR4_4_169e69elp17t68l.R.inc(8130);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {2, 4, -5, 3, 9, 7}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8131);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy869w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8132,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy869w() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8132);
        __CLR4_4_169e69elp17t68l.R.inc(8133);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8134);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r69z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8135,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r69z() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8135);
        __CLR4_4_169e69elp17t68l.R.inc(8136);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {1, 3, 5, -100}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8137);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_169e69elp17t68l.R.globalSliceStart(getClass().getName(),8138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq6a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_169e69elp17t68l.R.rethrow($CLV_t2$);}finally{__CLR4_4_169e69elp17t68l.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TRIPLES_SUM_TO_ZERO.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8138,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq6a2() throws java.lang.Exception{try{__CLR4_4_169e69elp17t68l.R.inc(8138);
        __CLR4_4_169e69elp17t68l.R.inc(8139);boolean result = humaneval.correct.TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(
            new int[] {100, 3, 5, -100}
        );
        __CLR4_4_169e69elp17t68l.R.inc(8140);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_169e69elp17t68l.R.flushNeeded();}}
}
