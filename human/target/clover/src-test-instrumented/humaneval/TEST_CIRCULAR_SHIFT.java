/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CIRCULAR_SHIFT {static class __CLR4_4_13ya3yalp0zmi9c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13ya3yalp0zmi9c.R.globalSliceStart(getClass().getName(),5122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23ya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ya3yalp0zmi9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ya3yalp0zmi9c.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CIRCULAR_SHIFT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5122,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23ya() throws java.lang.Exception{try{__CLR4_4_13ya3yalp0zmi9c.R.inc(5122);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5123);String result = humaneval.correct.CIRCULAR_SHIFT.circular_shift(100, 2);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5124);org.junit.Assert.assertEquals(
            result, "001"
        );
    }finally{__CLR4_4_13ya3yalp0zmi9c.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13ya3yalp0zmi9c.R.globalSliceStart(getClass().getName(),5125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3yd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ya3yalp0zmi9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ya3yalp0zmi9c.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CIRCULAR_SHIFT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3yd() throws java.lang.Exception{try{__CLR4_4_13ya3yalp0zmi9c.R.inc(5125);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5126);String result = humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 2);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5127);org.junit.Assert.assertEquals(
            result, "12"
        );
    }finally{__CLR4_4_13ya3yalp0zmi9c.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13ya3yalp0zmi9c.R.globalSliceStart(getClass().getName(),5128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443yg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ya3yalp0zmi9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ya3yalp0zmi9c.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CIRCULAR_SHIFT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5128,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443yg() throws java.lang.Exception{try{__CLR4_4_13ya3yalp0zmi9c.R.inc(5128);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5129);String result = humaneval.correct.CIRCULAR_SHIFT.circular_shift(97, 8);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5130);org.junit.Assert.assertEquals(
            result, "79"
        );
    }finally{__CLR4_4_13ya3yalp0zmi9c.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13ya3yalp0zmi9c.R.globalSliceStart(getClass().getName(),5131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3yj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ya3yalp0zmi9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ya3yalp0zmi9c.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CIRCULAR_SHIFT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5131,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3yj() throws java.lang.Exception{try{__CLR4_4_13ya3yalp0zmi9c.R.inc(5131);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5132);String result = humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 1);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5133);org.junit.Assert.assertEquals(
            result, "21"
        );
    }finally{__CLR4_4_13ya3yalp0zmi9c.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13ya3yalp0zmi9c.R.globalSliceStart(getClass().getName(),5134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63ym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ya3yalp0zmi9c.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ya3yalp0zmi9c.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CIRCULAR_SHIFT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5134,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63ym() throws java.lang.Exception{try{__CLR4_4_13ya3yalp0zmi9c.R.inc(5134);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5135);String result = humaneval.correct.CIRCULAR_SHIFT.circular_shift(11, 101);
        __CLR4_4_13ya3yalp0zmi9c.R.inc(5136);org.junit.Assert.assertEquals(
            result, "11"
        );
    }finally{__CLR4_4_13ya3yalp0zmi9c.R.flushNeeded();}}
}
