/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIB {static class __CLR4_4_14dv4dvlp0zmiek{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5698,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14dv4dvlp0zmiek.R.globalSliceStart(getClass().getName(),5683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dv4dvlp0zmiek.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dv4dvlp0zmiek.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5683,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24dv() throws java.lang.Exception{try{__CLR4_4_14dv4dvlp0zmiek.R.inc(5683);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5684);int result = humaneval.correct.FIB.fib(10);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5685);org.junit.Assert.assertEquals(
            result, 55
        );
    }finally{__CLR4_4_14dv4dvlp0zmiek.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14dv4dvlp0zmiek.R.globalSliceStart(getClass().getName(),5686);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4dy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dv4dvlp0zmiek.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dv4dvlp0zmiek.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5686,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4dy() throws java.lang.Exception{try{__CLR4_4_14dv4dvlp0zmiek.R.inc(5686);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5687);int result = humaneval.correct.FIB.fib(1);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5688);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_14dv4dvlp0zmiek.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14dv4dvlp0zmiek.R.globalSliceStart(getClass().getName(),5689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444e1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dv4dvlp0zmiek.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dv4dvlp0zmiek.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444e1() throws java.lang.Exception{try{__CLR4_4_14dv4dvlp0zmiek.R.inc(5689);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5690);int result = humaneval.correct.FIB.fib(8);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5691);org.junit.Assert.assertEquals(
            result, 21
        );
    }finally{__CLR4_4_14dv4dvlp0zmiek.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14dv4dvlp0zmiek.R.globalSliceStart(getClass().getName(),5692);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4e4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dv4dvlp0zmiek.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dv4dvlp0zmiek.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5692,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4e4() throws java.lang.Exception{try{__CLR4_4_14dv4dvlp0zmiek.R.inc(5692);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5693);int result = humaneval.correct.FIB.fib(11);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5694);org.junit.Assert.assertEquals(
            result, 89
        );
    }finally{__CLR4_4_14dv4dvlp0zmiek.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14dv4dvlp0zmiek.R.globalSliceStart(getClass().getName(),5695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64e7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14dv4dvlp0zmiek.R.rethrow($CLV_t2$);}finally{__CLR4_4_14dv4dvlp0zmiek.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIB.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5695,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64e7() throws java.lang.Exception{try{__CLR4_4_14dv4dvlp0zmiek.R.inc(5695);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5696);int result = humaneval.correct.FIB.fib(12);
        __CLR4_4_14dv4dvlp0zmiek.R.inc(5697);org.junit.Assert.assertEquals(
            result, 144
        );
    }finally{__CLR4_4_14dv4dvlp0zmiek.R.flushNeeded();}}
}
