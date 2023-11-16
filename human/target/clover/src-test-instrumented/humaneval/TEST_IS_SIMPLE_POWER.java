/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_SIMPLE_POWER {static class __CLR4_4_14yd4ydlp17t5uy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6454,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24yd() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6421);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6422);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(16, 2);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6423);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4yg() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6424);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6425);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(143214, 16);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6426);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444yj() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6427);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6428);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(4, 2);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6429);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4ym() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6430);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6431);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(9, 3);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6432);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64yp() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6433);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6434);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(16, 4);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6435);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4ys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4ys() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6436);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6437);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(24, 2);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6438);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6439,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84yv() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6439);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6440);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(128, 4);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6441);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6442,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4yy() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6442);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6443);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(12, 6);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6444);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6445,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4z1() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6445);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6446);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(1, 1);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6447);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f74z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f74z4() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6448);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6449);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(1, 12);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6450);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_14yd4ydlp17t5uy.R.globalSliceStart(getClass().getName(),6451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x4z7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14yd4ydlp17t5uy.R.rethrow($CLV_t2$);}finally{__CLR4_4_14yd4ydlp17t5uy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_SIMPLE_POWER.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6451,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x4z7() throws java.lang.Exception{try{__CLR4_4_14yd4ydlp17t5uy.R.inc(6451);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6452);boolean result = humaneval.correct.IS_SIMPLE_POWER.is_simple_power(7, 1);
        __CLR4_4_14yd4ydlp17t5uy.R.inc(6453);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14yd4ydlp17t5uy.R.flushNeeded();}}
}
