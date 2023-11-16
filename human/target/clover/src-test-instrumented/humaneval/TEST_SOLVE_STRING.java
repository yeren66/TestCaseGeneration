/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SOLVE_STRING {static class __CLR4_4_15v45v4lp0zmitg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7624,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7600);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25v4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7600,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25v4() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7600);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7601);String result = humaneval.correct.SOLVE_STRING.solve_string("AsDf");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7602);org.junit.Assert.assertEquals(
            result, "aSdF"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5v7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7603,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5v7() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7603);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7604);String result = humaneval.correct.SOLVE_STRING.solve_string("1234");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7605);org.junit.Assert.assertEquals(
            result, "4321"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7606,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445va() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7606);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7607);String result = humaneval.correct.SOLVE_STRING.solve_string("ab");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7608);org.junit.Assert.assertEquals(
            result, "AB"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5vd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7609,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5vd() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7609);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7610);String result = humaneval.correct.SOLVE_STRING.solve_string("#a@C");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7611);org.junit.Assert.assertEquals(
            result, "#A@c"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65vg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7612,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65vg() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7612);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7613);String result = humaneval.correct.SOLVE_STRING.solve_string("#AsdfW^45");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7614);org.junit.Assert.assertEquals(
            result, "#aSDFw^45"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5vj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7615,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5vj() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7615);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7616);String result = humaneval.correct.SOLVE_STRING.solve_string("#6@2");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7617);org.junit.Assert.assertEquals(
            result, "2@6#"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85vm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85vm() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7618);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7619);String result = humaneval.correct.SOLVE_STRING.solve_string("#$a^D");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7620);org.junit.Assert.assertEquals(
            result, "#$A^d"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15v45v4lp0zmitg.R.globalSliceStart(getClass().getName(),7621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5vp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15v45v4lp0zmitg.R.rethrow($CLV_t2$);}finally{__CLR4_4_15v45v4lp0zmitg.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SOLVE_STRING.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7621,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5vp() throws java.lang.Exception{try{__CLR4_4_15v45v4lp0zmitg.R.inc(7621);
        __CLR4_4_15v45v4lp0zmitg.R.inc(7622);String result = humaneval.correct.SOLVE_STRING.solve_string("#ccc");
        __CLR4_4_15v45v4lp0zmitg.R.inc(7623);org.junit.Assert.assertEquals(
            result, "#CCC"
        );
    }finally{__CLR4_4_15v45v4lp0zmitg.R.flushNeeded();}}
}
