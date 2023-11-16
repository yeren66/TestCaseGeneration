/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_IS_MULTIPLY_PRIME {static class __CLR4_4_14v64v6lp17t5u3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24v6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6306,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24v6() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6306);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6307);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(5);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6308);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4v9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6309,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4v9() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6309);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6310);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(30);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6311);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6312,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444vc() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6312);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6313);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(8);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6314);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6315);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4vf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6315,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4vf() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6315);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6316);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(10);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6317);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64vi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6318,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64vi() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6318);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6319);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(125);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6320);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4vl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6321,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4vl() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6321);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6322);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(3 * 5 * 7);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6323);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84vo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6324,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84vo() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6324);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6325);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(3 * 6 * 7);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6326);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6327,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4vr() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6327);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6328);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(9 * 9 * 9);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6329);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4vu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6330,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4vu() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6330);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6331);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(11 * 9 * 9);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6332);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_14v64v6lp17t5u3.R.globalSliceStart(getClass().getName(),6333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f74vx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14v64v6lp17t5u3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14v64v6lp17t5u3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_IS_MULTIPLY_PRIME.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6333,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f74vx() throws java.lang.Exception{try{__CLR4_4_14v64v6lp17t5u3.R.inc(6333);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6334);boolean result = humaneval.correct.IS_MULTIPLY_PRIME.is_multiply_prime(11 * 13 * 7);
        __CLR4_4_14v64v6lp17t5u3.R.inc(6335);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_14v64v6lp17t5u3.R.flushNeeded();}}
}
