/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SAME_CHARS {static class __CLR4_4_15ot5otlp0zmir8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7394,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7373,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25ot() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7373);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7374);boolean result = humaneval.correct.SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddeddabc");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7375);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7376,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5ow() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7376);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7377);boolean result = humaneval.correct.SAME_CHARS.same_chars("abcd", "dddddddabc");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7378);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7379,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445oz() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7379);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7380);boolean result = humaneval.correct.SAME_CHARS.same_chars("dddddddabc", "abcd");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7381);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7382);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7382,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5p2() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7382);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7383);boolean result = humaneval.correct.SAME_CHARS.same_chars("eabcd", "dddddddabc");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7384);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65p5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65p5() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7385);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7386);boolean result = humaneval.correct.SAME_CHARS.same_chars("abcd", "dddddddabcf");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7387);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5p8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5p8() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7388);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7389);boolean result = humaneval.correct.SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddddabc");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7390);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15ot5otlp0zmir8.R.globalSliceStart(getClass().getName(),7391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85pb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15ot5otlp0zmir8.R.rethrow($CLV_t2$);}finally{__CLR4_4_15ot5otlp0zmir8.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SAME_CHARS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85pb() throws java.lang.Exception{try{__CLR4_4_15ot5otlp0zmir8.R.inc(7391);
        __CLR4_4_15ot5otlp0zmir8.R.inc(7392);boolean result = humaneval.correct.SAME_CHARS.same_chars("aabb", "aaccc");
        __CLR4_4_15ot5otlp0zmir8.R.inc(7393);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15ot5otlp0zmir8.R.flushNeeded();}}
}
