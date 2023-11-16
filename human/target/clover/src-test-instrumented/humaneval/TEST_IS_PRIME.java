/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_PRIME {static class __CLR4_4_14xd4xdlp17t5ur{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6421,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24xd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6385,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24xd() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6385);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6386);boolean result = humaneval.correct.IS_PRIME.is_prime(6);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6387);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4xg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6388,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4xg() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6388);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6389);boolean result = humaneval.correct.IS_PRIME.is_prime(101);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6390);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444xj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6391,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444xj() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6391);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6392);boolean result = humaneval.correct.IS_PRIME.is_prime(11);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6393);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4xm() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6394);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6395);boolean result = humaneval.correct.IS_PRIME.is_prime(13441);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6396);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64xp() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6397);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6398);boolean result = humaneval.correct.IS_PRIME.is_prime(61);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6399);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4xs() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6400);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6401);boolean result = humaneval.correct.IS_PRIME.is_prime(4);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6402);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84xv() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6403);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6404);boolean result = humaneval.correct.IS_PRIME.is_prime(1);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6405);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4xy() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6406);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6407);boolean result = humaneval.correct.IS_PRIME.is_prime(5);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6408);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4y1() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6409);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6410);boolean result = humaneval.correct.IS_PRIME.is_prime(17);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6411);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f74y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f74y4() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6412);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6413);boolean result = humaneval.correct.IS_PRIME.is_prime(5 * 17);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6414);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x4y7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x4y7() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6415);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6416);boolean result = humaneval.correct.IS_PRIME.is_prime(11 * 7);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6417);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_14xd4xdlp17t5ur.R.globalSliceStart(getClass().getName(),6418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg4ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14xd4xdlp17t5ur.R.rethrow($CLV_t2$);}finally{__CLR4_4_14xd4xdlp17t5ur.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_PRIME.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg4ya() throws java.lang.Exception{try{__CLR4_4_14xd4xdlp17t5ur.R.inc(6418);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6419);boolean result = humaneval.correct.IS_PRIME.is_prime(13441 * 19);
        __CLR4_4_14xd4xdlp17t5ur.R.inc(6420);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14xd4xdlp17t5ur.R.flushNeeded();}}
}
