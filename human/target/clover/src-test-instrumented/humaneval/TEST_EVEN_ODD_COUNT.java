/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_EVEN_ODD_COUNT {static class __CLR4_4_14a44a4lp0zmidl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5572,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24a4() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5548);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5549);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(7);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5550);org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 1}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4a7() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5551);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5552);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-78);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5553);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 1}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5554,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444aa() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5554);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5555);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(3452);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5556);org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 2}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4ad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5557,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4ad() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5557);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5558);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(346211);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5559);org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64ag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5560,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64ag() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5560);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5561);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-345821);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5562);org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5563);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4aj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5563,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4aj() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5563);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5564);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-2);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5565);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5566,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84am() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5566);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5567);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-45347);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5568);org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 3}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14a44a4lp0zmidl.R.globalSliceStart(getClass().getName(),5569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4ap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14a44a4lp0zmidl.R.rethrow($CLV_t2$);}finally{__CLR4_4_14a44a4lp0zmidl.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5569,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4ap() throws java.lang.Exception{try{__CLR4_4_14a44a4lp0zmidl.R.inc(5569);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5570);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(0);
        __CLR4_4_14a44a4lp0zmidl.R.inc(5571);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }finally{__CLR4_4_14a44a4lp0zmidl.R.flushNeeded();}}
}
