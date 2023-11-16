/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_WORDS_IN_SENTENCE {static class __CLR4_4_16d36d3lp17t69a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,8268,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp26d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8247,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp26d3() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8247);
        __CLR4_4_16d36d3lp17t69a.R.inc(8248);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("This is a test");
        __CLR4_4_16d36d3lp17t69a.R.inc(8249);org.junit.Assert.assertEquals(
            result, "is"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl6d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl6d6() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8250);
        __CLR4_4_16d36d3lp17t69a.R.inc(8251);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("lets go for swimming");
        __CLR4_4_16d36d3lp17t69a.R.inc(8252);org.junit.Assert.assertEquals(
            result, "go for"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k446d9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8253,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k446d9() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8253);
        __CLR4_4_16d36d3lp17t69a.R.inc(8254);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("there is no place available here");
        __CLR4_4_16d36d3lp17t69a.R.inc(8255);org.junit.Assert.assertEquals(
            result, "there is no place"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn6dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8256,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn6dc() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8256);
        __CLR4_4_16d36d3lp17t69a.R.inc(8257);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("Hi I am Hussein");
        __CLR4_4_16d36d3lp17t69a.R.inc(8258);org.junit.Assert.assertEquals(
            result, "Hi am Hussein"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj66df();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8259,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj66df() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8259);
        __CLR4_4_16d36d3lp17t69a.R.inc(8260);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("go for it");
        __CLR4_4_16d36d3lp17t69a.R.inc(8261);org.junit.Assert.assertEquals(
            result, "go for it"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp6di();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp6di() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8262);
        __CLR4_4_16d36d3lp17t69a.R.inc(8263);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("here is");
        __CLR4_4_16d36d3lp17t69a.R.inc(8264);org.junit.Assert.assertEquals(
            result, "is"
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_16d36d3lp17t69a.R.globalSliceStart(getClass().getName(),8265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy86dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16d36d3lp17t69a.R.rethrow($CLV_t2$);}finally{__CLR4_4_16d36d3lp17t69a.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WORDS_IN_SENTENCE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8265,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy86dl() throws java.lang.Exception{try{__CLR4_4_16d36d3lp17t69a.R.inc(8265);
        __CLR4_4_16d36d3lp17t69a.R.inc(8266);String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence("here");
        __CLR4_4_16d36d3lp17t69a.R.inc(8267);org.junit.Assert.assertEquals(
            result, ""
        );
    }finally{__CLR4_4_16d36d3lp17t69a.R.flushNeeded();}}
}
