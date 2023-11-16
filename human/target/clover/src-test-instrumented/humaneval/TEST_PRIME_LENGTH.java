/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_PRIME_LENGTH {static class __CLR4_4_15i55i5lp0zmipw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7175,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25i5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7133,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25i5() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7133);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7134);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("Hello");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7135);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5i8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7136,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5i8() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7136);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7137);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("abcdcba");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7138);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7139,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445ib() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7139);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7140);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("kittens");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7141);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5ie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7142,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5ie() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7142);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7143);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("orange");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7144);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7145,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65ih() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7145);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7146);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("wow");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7147);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7148,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5ik() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7148);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7149);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("world");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7150);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7151,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85in() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7151);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7152);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("MadaM");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7153);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7154,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5iq() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7154);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7155);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("Wow");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7156);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7157,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5it() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7157);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7158);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7159);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75iw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7160,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75iw() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7160);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7161);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("HI");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7162);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x5iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7163,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x5iz() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7163);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7164);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("go");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7165);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg5j2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7166,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg5j2() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7166);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7167);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("gogo");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7168);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7169);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lolmz5j5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7169,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lolmz5j5() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7169);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7170);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("aaaaaaaaaaaaaaa");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7171);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {__CLR4_4_15i55i5lp0zmipw.R.globalSliceStart(getClass().getName(),7172);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12comui5j8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15i55i5lp0zmipw.R.rethrow($CLV_t2$);}finally{__CLR4_4_15i55i5lp0zmipw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_LENGTH.test_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7172,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12comui5j8() throws java.lang.Exception{try{__CLR4_4_15i55i5lp0zmipw.R.inc(7172);
        __CLR4_4_15i55i5lp0zmipw.R.inc(7173);boolean result = humaneval.correct.PRIME_LENGTH.prime_length("M");
        __CLR4_4_15i55i5lp0zmipw.R.inc(7174);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15i55i5lp0zmipw.R.flushNeeded();}}
}
