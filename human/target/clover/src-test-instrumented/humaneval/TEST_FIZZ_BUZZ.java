/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIZZ_BUZZ {static class __CLR4_4_14iw4iwlp17t5o9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5864,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24iw() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5864);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5865);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(50);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5866);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5867,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4iz() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5867);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5868);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(78);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5869);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5870,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444j2() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5870);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5871);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(79);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5872);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5873,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4j5() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5873);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5874);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(100);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5875);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5876,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64j8() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5876);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5877);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(200);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5878);org.junit.Assert.assertEquals(
            result, 6
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4jb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5879,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4jb() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5879);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5880);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(4000);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5881);org.junit.Assert.assertEquals(
            result, 192
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84je();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5882,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84je() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5882);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5883);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(10000);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5884);org.junit.Assert.assertEquals(
            result, 639
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14iw4iwlp17t5o9.R.globalSliceStart(getClass().getName(),5885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4jh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14iw4iwlp17t5o9.R.rethrow($CLV_t2$);}finally{__CLR4_4_14iw4iwlp17t5o9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIZZ_BUZZ.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5885,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4jh() throws java.lang.Exception{try{__CLR4_4_14iw4iwlp17t5o9.R.inc(5885);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5886);int result = humaneval.correct.FIZZ_BUZZ.fizz_buzz(100000);
        __CLR4_4_14iw4iwlp17t5o9.R.inc(5887);org.junit.Assert.assertEquals(
            result, 8026
        );
    }finally{__CLR4_4_14iw4iwlp17t5o9.R.flushNeeded();}}
}
