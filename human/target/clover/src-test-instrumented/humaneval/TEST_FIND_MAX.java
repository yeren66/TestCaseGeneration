/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIND_MAX {static class __CLR4_4_14h94h9lp0zmig9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24h9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5805,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24h9() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5805);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5806);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"name", "of", "string"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5807);org.junit.Assert.assertEquals(
            result, "string"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4hc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5808,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4hc() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5808);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5809);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"name", "enam", "game"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5810);org.junit.Assert.assertEquals(
            result, "enam"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444hf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5811,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444hf() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5811);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5812);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"aaaaaaa", "bb", "cc"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5813);org.junit.Assert.assertEquals(
            result, "aaaaaaa"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4hi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5814,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4hi() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5814);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5815);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"abc", "cba"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5816);org.junit.Assert.assertEquals(
            result, "abc"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64hl() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5817);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5818);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"play", "this", "game", "of", "footbott"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5819);org.junit.Assert.assertEquals(
            result, "footbott"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4ho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5820,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4ho() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5820);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5821);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"we", "are", "gonna", "rock"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5822);org.junit.Assert.assertEquals(
            result, "gonna"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84hr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5823,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84hr() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5823);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5824);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"we", "are", "a", "mad", "nation"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5825);org.junit.Assert.assertEquals(
            result, "nation"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4hu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4hu() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5826);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5827);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"this", "is", "a", "prrk"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5828);org.junit.Assert.assertEquals(
            result, "this"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4hx() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5829);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5830);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"b"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5831);org.junit.Assert.assertEquals(
            result, "b"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_14h94h9lp0zmig9.R.globalSliceStart(getClass().getName(),5832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f74i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14h94h9lp0zmig9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14h94h9lp0zmig9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_MAX.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5832,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f74i0() throws java.lang.Exception{try{__CLR4_4_14h94h9lp0zmig9.R.inc(5832);
        __CLR4_4_14h94h9lp0zmig9.R.inc(5833);String result = humaneval.correct.FIND_MAX.find_max(
            new String[] {"play", "play", "play"}
        );
        __CLR4_4_14h94h9lp0zmig9.R.inc(5834);org.junit.Assert.assertEquals(
            result, "play"
        );
    }finally{__CLR4_4_14h94h9lp0zmig9.R.flushNeeded();}}
}
