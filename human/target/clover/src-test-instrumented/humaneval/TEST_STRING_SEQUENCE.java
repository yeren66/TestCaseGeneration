/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_STRING_SEQUENCE {static class __CLR4_4_1621621lp17t66r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7858,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1621621lp17t66r.R.globalSliceStart(getClass().getName(),7849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2621();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1621621lp17t66r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1621621lp17t66r.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRING_SEQUENCE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2621() throws java.lang.Exception{try{__CLR4_4_1621621lp17t66r.R.inc(7849);
        __CLR4_4_1621621lp17t66r.R.inc(7850);String result = humaneval.correct.STRING_SEQUENCE.string_sequence(0);
        __CLR4_4_1621621lp17t66r.R.inc(7851);org.junit.Assert.assertEquals(
            result, "0" 
        );
    }finally{__CLR4_4_1621621lp17t66r.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1621621lp17t66r.R.globalSliceStart(getClass().getName(),7852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl624();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1621621lp17t66r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1621621lp17t66r.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRING_SEQUENCE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl624() throws java.lang.Exception{try{__CLR4_4_1621621lp17t66r.R.inc(7852);
        __CLR4_4_1621621lp17t66r.R.inc(7853);String result = humaneval.correct.STRING_SEQUENCE.string_sequence(3);
        __CLR4_4_1621621lp17t66r.R.inc(7854);org.junit.Assert.assertEquals(
            result, "0 1 2 3" 
        );
    }finally{__CLR4_4_1621621lp17t66r.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1621621lp17t66r.R.globalSliceStart(getClass().getName(),7855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44627();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1621621lp17t66r.R.rethrow($CLV_t2$);}finally{__CLR4_4_1621621lp17t66r.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRING_SEQUENCE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44627() throws java.lang.Exception{try{__CLR4_4_1621621lp17t66r.R.inc(7855);
        __CLR4_4_1621621lp17t66r.R.inc(7856);String result = humaneval.correct.STRING_SEQUENCE.string_sequence(10);
        __CLR4_4_1621621lp17t66r.R.inc(7857);org.junit.Assert.assertEquals(
            result, "0 1 2 3 4 5 6 7 8 9 10" 
        );
    }finally{__CLR4_4_1621621lp17t66r.R.flushNeeded();}}
}