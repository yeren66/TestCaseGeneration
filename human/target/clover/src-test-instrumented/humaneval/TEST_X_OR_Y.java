/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_X_OR_Y {static class __CLR4_4_16ec6eclp17t69h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,8322,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp26ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp26ec() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8292);
        __CLR4_4_16ec6eclp17t69h.R.inc(8293);int result = humaneval.correct.X_OR_Y.x_or_y(7, 34, 12);
        __CLR4_4_16ec6eclp17t69h.R.inc(8294);org.junit.Assert.assertEquals(
            result, 34
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl6ef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl6ef() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8295);
        __CLR4_4_16ec6eclp17t69h.R.inc(8296);int result = humaneval.correct.X_OR_Y.x_or_y(15, 8, 5);
        __CLR4_4_16ec6eclp17t69h.R.inc(8297);org.junit.Assert.assertEquals(
            result, 5
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k446ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k446ei() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8298);
        __CLR4_4_16ec6eclp17t69h.R.inc(8299);int result = humaneval.correct.X_OR_Y.x_or_y(3, 33, 5212);
        __CLR4_4_16ec6eclp17t69h.R.inc(8300);org.junit.Assert.assertEquals(
            result, 33
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn6el();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn6el() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8301);
        __CLR4_4_16ec6eclp17t69h.R.inc(8302);int result = humaneval.correct.X_OR_Y.x_or_y(1259, 3, 52);
        __CLR4_4_16ec6eclp17t69h.R.inc(8303);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj66eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj66eo() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8304);
        __CLR4_4_16ec6eclp17t69h.R.inc(8305);int result = humaneval.correct.X_OR_Y.x_or_y(7919, -1, 12);
        __CLR4_4_16ec6eclp17t69h.R.inc(8306);org.junit.Assert.assertEquals(
            result, -1
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp6er();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp6er() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8307);
        __CLR4_4_16ec6eclp17t69h.R.inc(8308);int result = humaneval.correct.X_OR_Y.x_or_y(3609, 1245, 583);
        __CLR4_4_16ec6eclp17t69h.R.inc(8309);org.junit.Assert.assertEquals(
            result, 583
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy86eu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy86eu() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8310);
        __CLR4_4_16ec6eclp17t69h.R.inc(8311);int result = humaneval.correct.X_OR_Y.x_or_y(91, 56, 129);
        __CLR4_4_16ec6eclp17t69h.R.inc(8312);org.junit.Assert.assertEquals(
            result, 129
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r6ex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8313,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r6ex() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8313);
        __CLR4_4_16ec6eclp17t69h.R.inc(8314);int result = humaneval.correct.X_OR_Y.x_or_y(6, 34, 1234);
        __CLR4_4_16ec6eclp17t69h.R.inc(8315);org.junit.Assert.assertEquals(
            result, 1234
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq6f0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8316,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq6f0() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8316);
        __CLR4_4_16ec6eclp17t69h.R.inc(8317);int result = humaneval.correct.X_OR_Y.x_or_y(1, 2, 0);
        __CLR4_4_16ec6eclp17t69h.R.inc(8318);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_16ec6eclp17t69h.R.globalSliceStart(getClass().getName(),8319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f76f3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ec6eclp17t69h.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ec6eclp17t69h.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_X_OR_Y.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8319,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f76f3() throws java.lang.Exception{try{__CLR4_4_16ec6eclp17t69h.R.inc(8319);
        __CLR4_4_16ec6eclp17t69h.R.inc(8320);int result = humaneval.correct.X_OR_Y.x_or_y(2, 2, 0);
        __CLR4_4_16ec6eclp17t69h.R.inc(8321);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_16ec6eclp17t69h.R.flushNeeded();}}
}
