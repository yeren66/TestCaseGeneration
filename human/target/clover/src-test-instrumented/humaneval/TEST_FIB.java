/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIB {static class __CLR4_4_14dd4ddlp17t5lw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5680,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14dd4ddlp17t5lw.R.globalSliceStart(getClass().getName(),5665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dd4ddlp17t5lw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dd4ddlp17t5lw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5665,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24dd() throws java.lang.Exception{try{__CLR4_4_14dd4ddlp17t5lw.R.inc(5665);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5666);int result = humaneval.correct.FIB.fib(10);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5667);org.junit.Assert.assertEquals(
            result, 55
        );
    }finally{__CLR4_4_14dd4ddlp17t5lw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14dd4ddlp17t5lw.R.globalSliceStart(getClass().getName(),5668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4dg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dd4ddlp17t5lw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dd4ddlp17t5lw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5668,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4dg() throws java.lang.Exception{try{__CLR4_4_14dd4ddlp17t5lw.R.inc(5668);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5669);int result = humaneval.correct.FIB.fib(1);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5670);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_14dd4ddlp17t5lw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14dd4ddlp17t5lw.R.globalSliceStart(getClass().getName(),5671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444dj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dd4ddlp17t5lw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dd4ddlp17t5lw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5671,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444dj() throws java.lang.Exception{try{__CLR4_4_14dd4ddlp17t5lw.R.inc(5671);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5672);int result = humaneval.correct.FIB.fib(8);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5673);org.junit.Assert.assertEquals(
            result, 21
        );
    }finally{__CLR4_4_14dd4ddlp17t5lw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14dd4ddlp17t5lw.R.globalSliceStart(getClass().getName(),5674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4dm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dd4ddlp17t5lw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dd4ddlp17t5lw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4dm() throws java.lang.Exception{try{__CLR4_4_14dd4ddlp17t5lw.R.inc(5674);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5675);int result = humaneval.correct.FIB.fib(11);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5676);org.junit.Assert.assertEquals(
            result, 89
        );
    }finally{__CLR4_4_14dd4ddlp17t5lw.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14dd4ddlp17t5lw.R.globalSliceStart(getClass().getName(),5677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dd4ddlp17t5lw.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dd4ddlp17t5lw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5677,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64dp() throws java.lang.Exception{try{__CLR4_4_14dd4ddlp17t5lw.R.inc(5677);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5678);int result = humaneval.correct.FIB.fib(12);
        __CLR4_4_14dd4ddlp17t5lw.R.inc(5679);org.junit.Assert.assertEquals(
            result, 144
        );
    }finally{__CLR4_4_14dd4ddlp17t5lw.R.flushNeeded();}}
}
