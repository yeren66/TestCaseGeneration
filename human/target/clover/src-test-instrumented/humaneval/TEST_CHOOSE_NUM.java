/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CHOOSE_NUM {static class __CLR4_4_13xm3xmlp0zmi96{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23xm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5098,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23xm() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5098);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5099);int result = humaneval.correct.CHOOSE_NUM.choose_num(12, 15);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5100);org.junit.Assert.assertEquals(result, 14);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3xp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5101,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3xp() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5101);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5102);int result = humaneval.correct.CHOOSE_NUM.choose_num(13, 12);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5103);org.junit.Assert.assertEquals(result, -1);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443xs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5104,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443xs() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5104);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5105);int result = humaneval.correct.CHOOSE_NUM.choose_num(33, 12354);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5106);org.junit.Assert.assertEquals(result, 12354);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3xv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5107,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3xv() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5107);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5108);int result = humaneval.correct.CHOOSE_NUM.choose_num(5234, 5233);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5109);org.junit.Assert.assertEquals(result, -1);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63xy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5110,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63xy() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5110);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5111);int result = humaneval.correct.CHOOSE_NUM.choose_num(6, 29);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5112);org.junit.Assert.assertEquals(result, 28);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3y1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5113,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3y1() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5113);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5114);int result = humaneval.correct.CHOOSE_NUM.choose_num(27, 10);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5115);org.junit.Assert.assertEquals(result, -1);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83y4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5116,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83y4() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5116);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5117);int result = humaneval.correct.CHOOSE_NUM.choose_num(7, 7);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5118);org.junit.Assert.assertEquals(result, -1);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {__CLR4_4_13xm3xmlp0zmi96.R.globalSliceStart(getClass().getName(),5119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r3y7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13xm3xmlp0zmi96.R.rethrow($CLV_t2$);}finally{__CLR4_4_13xm3xmlp0zmi96.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHOOSE_NUM.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5119,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r3y7() throws java.lang.Exception{try{__CLR4_4_13xm3xmlp0zmi96.R.inc(5119);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5120);int result = humaneval.correct.CHOOSE_NUM.choose_num(546, 546);
        __CLR4_4_13xm3xmlp0zmi96.R.inc(5121);org.junit.Assert.assertEquals(result, 546);
    }finally{__CLR4_4_13xm3xmlp0zmi96.R.flushNeeded();}}
}
