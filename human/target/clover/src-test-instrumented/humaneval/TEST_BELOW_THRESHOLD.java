/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_BELOW_THRESHOLD {static class __CLR4_4_13rm3rmlp17t5dh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,4900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23rm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23rm() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4882);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4883);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 100);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4884);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3rp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3rp() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4885);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4886);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 20, 4, 10}, 5);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4887);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443rs() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4888);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4889);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 21);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4890);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3rv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3rv() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4891);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4892);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 2, 4, 10}, 22);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4893);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63ry();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63ry() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4894);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4895);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 8, 4, 10}, 11);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4896);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13rm3rmlp17t5dh.R.globalSliceStart(getClass().getName(),4897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13rm3rmlp17t5dh.R.rethrow($CLV_t2$);}finally{__CLR4_4_13rm3rmlp17t5dh.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BELOW_THRESHOLD.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3s1() throws java.lang.Exception{try{__CLR4_4_13rm3rmlp17t5dh.R.inc(4897);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4898);boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(new int[] {1, 8, 4, 10}, 10);
        __CLR4_4_13rm3rmlp17t5dh.R.inc(4899);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13rm3rmlp17t5dh.R.flushNeeded();}}
}
