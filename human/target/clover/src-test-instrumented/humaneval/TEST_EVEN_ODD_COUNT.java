/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_EVEN_ODD_COUNT {static class __CLR4_4_149m49mlp17t5kp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5554,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp249m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5530,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp249m() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5530);
        __CLR4_4_149m49mlp17t5kp.R.inc(5531);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(7);
        __CLR4_4_149m49mlp17t5kp.R.inc(5532);org.junit.Assert.assertArrayEquals(
            result, new int[] {0, 1}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl49p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5533,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl49p() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5533);
        __CLR4_4_149m49mlp17t5kp.R.inc(5534);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-78);
        __CLR4_4_149m49mlp17t5kp.R.inc(5535);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 1}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4449s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5536,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4449s() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5536);
        __CLR4_4_149m49mlp17t5kp.R.inc(5537);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(3452);
        __CLR4_4_149m49mlp17t5kp.R.inc(5538);org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 2}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn49v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5539,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn49v() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5539);
        __CLR4_4_149m49mlp17t5kp.R.inc(5540);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(346211);
        __CLR4_4_149m49mlp17t5kp.R.inc(5541);org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj649y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5542,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj649y() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5542);
        __CLR4_4_149m49mlp17t5kp.R.inc(5543);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-345821);
        __CLR4_4_149m49mlp17t5kp.R.inc(5544);org.junit.Assert.assertArrayEquals(
            result, new int[] {3, 3}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5545,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4a1() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5545);
        __CLR4_4_149m49mlp17t5kp.R.inc(5546);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-2);
        __CLR4_4_149m49mlp17t5kp.R.inc(5547);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5548);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84a4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5548,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84a4() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5548);
        __CLR4_4_149m49mlp17t5kp.R.inc(5549);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-45347);
        __CLR4_4_149m49mlp17t5kp.R.inc(5550);org.junit.Assert.assertArrayEquals(
            result, new int[] {2, 3}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_149m49mlp17t5kp.R.globalSliceStart(getClass().getName(),5551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4a7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_149m49mlp17t5kp.R.rethrow($CLV_t2$);}finally{__CLR4_4_149m49mlp17t5kp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EVEN_ODD_COUNT.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5551,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4a7() throws java.lang.Exception{try{__CLR4_4_149m49mlp17t5kp.R.inc(5551);
        __CLR4_4_149m49mlp17t5kp.R.inc(5552);int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(0);
        __CLR4_4_149m49mlp17t5kp.R.inc(5553);org.junit.Assert.assertArrayEquals(
            result, new int[] {1, 0}
        );
    }finally{__CLR4_4_149m49mlp17t5kp.R.flushNeeded();}}
}
