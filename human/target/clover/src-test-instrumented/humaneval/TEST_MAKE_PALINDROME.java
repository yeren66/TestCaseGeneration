/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MAKE_PALINDROME {static class __CLR4_4_1538538lp17t5w9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6611,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1538538lp17t5w9.R.globalSliceStart(getClass().getName(),6596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2538();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1538538lp17t5w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1538538lp17t5w9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAKE_PALINDROME.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6596,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2538() throws java.lang.Exception{try{__CLR4_4_1538538lp17t5w9.R.inc(6596);
        __CLR4_4_1538538lp17t5w9.R.inc(6597);String result = humaneval.correct.MAKE_PALINDROME.make_palindrome("");
        __CLR4_4_1538538lp17t5w9.R.inc(6598);org.junit.Assert.assertEquals(
            result, ""
        );
    }finally{__CLR4_4_1538538lp17t5w9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1538538lp17t5w9.R.globalSliceStart(getClass().getName(),6599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl53b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1538538lp17t5w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1538538lp17t5w9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAKE_PALINDROME.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6599,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl53b() throws java.lang.Exception{try{__CLR4_4_1538538lp17t5w9.R.inc(6599);
        __CLR4_4_1538538lp17t5w9.R.inc(6600);String result = humaneval.correct.MAKE_PALINDROME.make_palindrome("x");
        __CLR4_4_1538538lp17t5w9.R.inc(6601);org.junit.Assert.assertEquals(
            result, "x"
        );
    }finally{__CLR4_4_1538538lp17t5w9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1538538lp17t5w9.R.globalSliceStart(getClass().getName(),6602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4453e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1538538lp17t5w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1538538lp17t5w9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAKE_PALINDROME.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6602,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4453e() throws java.lang.Exception{try{__CLR4_4_1538538lp17t5w9.R.inc(6602);
        __CLR4_4_1538538lp17t5w9.R.inc(6603);String result = humaneval.correct.MAKE_PALINDROME.make_palindrome("xyz");
        __CLR4_4_1538538lp17t5w9.R.inc(6604);org.junit.Assert.assertEquals(
            result, "xyzyx"
        );
    }finally{__CLR4_4_1538538lp17t5w9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1538538lp17t5w9.R.globalSliceStart(getClass().getName(),6605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn53h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1538538lp17t5w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1538538lp17t5w9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAKE_PALINDROME.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6605,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn53h() throws java.lang.Exception{try{__CLR4_4_1538538lp17t5w9.R.inc(6605);
        __CLR4_4_1538538lp17t5w9.R.inc(6606);String result = humaneval.correct.MAKE_PALINDROME.make_palindrome("xyx");
        __CLR4_4_1538538lp17t5w9.R.inc(6607);org.junit.Assert.assertEquals(
            result, "xyx"
        );
    }finally{__CLR4_4_1538538lp17t5w9.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1538538lp17t5w9.R.globalSliceStart(getClass().getName(),6608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj653k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1538538lp17t5w9.R.rethrow($CLV_t2$);}finally{__CLR4_4_1538538lp17t5w9.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAKE_PALINDROME.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj653k() throws java.lang.Exception{try{__CLR4_4_1538538lp17t5w9.R.inc(6608);
        __CLR4_4_1538538lp17t5w9.R.inc(6609);String result = humaneval.correct.MAKE_PALINDROME.make_palindrome("jerry");
        __CLR4_4_1538538lp17t5w9.R.inc(6610);org.junit.Assert.assertEquals(
            result, "jerryrrej"
        );
    }finally{__CLR4_4_1538538lp17t5w9.R.flushNeeded();}}
}