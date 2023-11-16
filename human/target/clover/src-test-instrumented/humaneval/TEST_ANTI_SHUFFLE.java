/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ANTI_SHUFFLE {static class __CLR4_4_13qa3qalp17t5cz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,4855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23qa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23qa() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4834);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4835);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("Hi");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4836);org.junit.Assert.assertEquals(
            result, "Hi"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3qd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3qd() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4837);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4838);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("hello");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4839);org.junit.Assert.assertEquals(
            result, "ehllo"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443qg() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4840);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4841);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("number");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4842);org.junit.Assert.assertEquals(
            result, "bemnru"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3qj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3qj() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4843);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4844);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("abcd");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4845);org.junit.Assert.assertEquals(
            result, "abcd"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63qm() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4846);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4847);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("Hello World!!!");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4848);org.junit.Assert.assertEquals(
            result, "Hello !!!Wdlor"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3qp() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4849);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4850);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4851);org.junit.Assert.assertEquals(
            result, ""
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13qa3qalp17t5cz.R.globalSliceStart(getClass().getName(),4852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13qa3qalp17t5cz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13qa3qalp17t5cz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ANTI_SHUFFLE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83qs() throws java.lang.Exception{try{__CLR4_4_13qa3qalp17t5cz.R.inc(4852);
        __CLR4_4_13qa3qalp17t5cz.R.inc(4853);String result = humaneval.correct.ANTI_SHUFFLE.anti_shuffle("Hi. My name is Mister Robot. How are you?");
        __CLR4_4_13qa3qalp17t5cz.R.inc(4854);org.junit.Assert.assertEquals(
            result, ".Hi My aemn is Meirst .Rboot How aer ?ouy"
        );
    }finally{__CLR4_4_13qa3qalp17t5cz.R.flushNeeded();}}
}
