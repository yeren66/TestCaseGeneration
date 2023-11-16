/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CLOSEST_INTEGER {static class __CLR4_4_13yp3yplp0zmi9g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5152,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13yp3yplp0zmi9g.R.globalSliceStart(getClass().getName(),5137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23yp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yp3yplp0zmi9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yp3yplp0zmi9g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CLOSEST_INTEGER.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5137,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23yp() throws java.lang.Exception{try{__CLR4_4_13yp3yplp0zmi9g.R.inc(5137);
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5138);int result = humaneval.correct.CLOSEST_INTEGER.closest_integer("10");
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5139);org.junit.Assert.assertEquals(
            result, 10
        );
    }finally{__CLR4_4_13yp3yplp0zmi9g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13yp3yplp0zmi9g.R.globalSliceStart(getClass().getName(),5140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3ys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yp3yplp0zmi9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yp3yplp0zmi9g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CLOSEST_INTEGER.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5140,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3ys() throws java.lang.Exception{try{__CLR4_4_13yp3yplp0zmi9g.R.inc(5140);
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5141);int result = humaneval.correct.CLOSEST_INTEGER.closest_integer("14.5");
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5142);org.junit.Assert.assertEquals(
            result, 15
        );
    }finally{__CLR4_4_13yp3yplp0zmi9g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13yp3yplp0zmi9g.R.globalSliceStart(getClass().getName(),5143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443yv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yp3yplp0zmi9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yp3yplp0zmi9g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CLOSEST_INTEGER.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5143,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443yv() throws java.lang.Exception{try{__CLR4_4_13yp3yplp0zmi9g.R.inc(5143);
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5144);int result = humaneval.correct.CLOSEST_INTEGER.closest_integer("-15.5");
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5145);org.junit.Assert.assertEquals(
            result, -16
        );
    }finally{__CLR4_4_13yp3yplp0zmi9g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13yp3yplp0zmi9g.R.globalSliceStart(getClass().getName(),5146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3yy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yp3yplp0zmi9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yp3yplp0zmi9g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CLOSEST_INTEGER.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5146,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3yy() throws java.lang.Exception{try{__CLR4_4_13yp3yplp0zmi9g.R.inc(5146);
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5147);int result = humaneval.correct.CLOSEST_INTEGER.closest_integer("15.3");
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5148);org.junit.Assert.assertEquals(
            result, 15
        );
    }finally{__CLR4_4_13yp3yplp0zmi9g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13yp3yplp0zmi9g.R.globalSliceStart(getClass().getName(),5149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63z1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13yp3yplp0zmi9g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13yp3yplp0zmi9g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CLOSEST_INTEGER.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5149,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63z1() throws java.lang.Exception{try{__CLR4_4_13yp3yplp0zmi9g.R.inc(5149);
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5150);int result = humaneval.correct.CLOSEST_INTEGER.closest_integer("0");
        __CLR4_4_13yp3yplp0zmi9g.R.inc(5151);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_13yp3yplp0zmi9g.R.flushNeeded();}}
}
