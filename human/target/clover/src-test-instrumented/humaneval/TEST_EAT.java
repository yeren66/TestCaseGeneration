/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_EAT {static class __CLR4_4_148j48jlp0zmid7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp248j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5491,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp248j() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5491);
        __CLR4_4_148j48jlp0zmid7.R.inc(5492);int[] result = humaneval.correct.EAT.eat(5, 6, 10);
        __CLR4_4_148j48jlp0zmid7.R.inc(5493);org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 4}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl48m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5494,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl48m() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5494);
        __CLR4_4_148j48jlp0zmid7.R.inc(5495);int[] result = humaneval.correct.EAT.eat(4, 8, 9);
        __CLR4_4_148j48jlp0zmid7.R.inc(5496);org.junit.Assert.assertArrayEquals(
            result, new int[] {12, 1}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4448p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5497,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4448p() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5497);
        __CLR4_4_148j48jlp0zmid7.R.inc(5498);int[] result = humaneval.correct.EAT.eat(1, 10, 10);
        __CLR4_4_148j48jlp0zmid7.R.inc(5499);org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 0}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn48s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5500,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn48s() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5500);
        __CLR4_4_148j48jlp0zmid7.R.inc(5501);int[] result = humaneval.correct.EAT.eat(2, 11, 5);
        __CLR4_4_148j48jlp0zmid7.R.inc(5502);org.junit.Assert.assertArrayEquals(
            result, new int[] {7, 0}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj648v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5503,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj648v() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5503);
        __CLR4_4_148j48jlp0zmid7.R.inc(5504);int[] result = humaneval.correct.EAT.eat(4, 5, 7);
        __CLR4_4_148j48jlp0zmid7.R.inc(5505);org.junit.Assert.assertArrayEquals(
            result, new int[] {9, 2}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_148j48jlp0zmid7.R.globalSliceStart(getClass().getName(),5506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp48y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148j48jlp0zmid7.R.rethrow($CLV_t2$);}finally{__CLR4_4_148j48jlp0zmid7.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp48y() throws java.lang.Exception{try{__CLR4_4_148j48jlp0zmid7.R.inc(5506);
        __CLR4_4_148j48jlp0zmid7.R.inc(5507);int[] result = humaneval.correct.EAT.eat(4, 5, 1);
        __CLR4_4_148j48jlp0zmid7.R.inc(5508);org.junit.Assert.assertArrayEquals(
            result, new int[] {5, 0}
        );
    }finally{__CLR4_4_148j48jlp0zmid7.R.flushNeeded();}}
}
