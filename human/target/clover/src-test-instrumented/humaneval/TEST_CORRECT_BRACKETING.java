/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CORRECT_BRACKETING {static class __CLR4_4_140h40hlp0zmiar{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5237,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp240h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5201,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp240h() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5201);
        __CLR4_4_140h40hlp0zmiar.R.inc(5202);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5203);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl40k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5204,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl40k() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5204);
        __CLR4_4_140h40hlp0zmiar.R.inc(5205);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<<><>>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5206);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4440n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5207,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4440n() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5207);
        __CLR4_4_140h40hlp0zmiar.R.inc(5208);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<><><<><>><>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5209);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn40q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5210,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn40q() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5210);
        __CLR4_4_140h40hlp0zmiar.R.inc(5211);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<><><<<><><>><>><<><><<>>>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5212);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj640t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5213,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj640t() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5213);
        __CLR4_4_140h40hlp0zmiar.R.inc(5214);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<<<><>>>>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5215);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp40w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5216,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp40w() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5216);
        __CLR4_4_140h40hlp0zmiar.R.inc(5217);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("><<>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5218);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy840z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5219,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy840z() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5219);
        __CLR4_4_140h40hlp0zmiar.R.inc(5220);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<");
        __CLR4_4_140h40hlp0zmiar.R.inc(5221);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r412();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5222,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r412() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5222);
        __CLR4_4_140h40hlp0zmiar.R.inc(5223);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<<<<");
        __CLR4_4_140h40hlp0zmiar.R.inc(5224);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq415();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5225,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq415() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5225);
        __CLR4_4_140h40hlp0zmiar.R.inc(5226);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing(">");
        __CLR4_4_140h40hlp0zmiar.R.inc(5227);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7418();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5228,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7418() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5228);
        __CLR4_4_140h40hlp0zmiar.R.inc(5229);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<<>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5230);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x41b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5231,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x41b() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5231);
        __CLR4_4_140h40hlp0zmiar.R.inc(5232);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<><><<><>><>><<>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5233);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_140h40hlp0zmiar.R.globalSliceStart(getClass().getName(),5234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg41e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_140h40hlp0zmiar.R.rethrow($CLV_t2$);}finally{__CLR4_4_140h40hlp0zmiar.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CORRECT_BRACKETING.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg41e() throws java.lang.Exception{try{__CLR4_4_140h40hlp0zmiar.R.inc(5234);
        __CLR4_4_140h40hlp0zmiar.R.inc(5235);boolean result = humaneval.correct.CORRECT_BRACKETING.correct_bracketing("<><><<><>><>>><>");
        __CLR4_4_140h40hlp0zmiar.R.inc(5236);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_140h40hlp0zmiar.R.flushNeeded();}}
}
