/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIX_SPACES {static class __CLR4_4_14ih4ihlp17t5nz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5864,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14ih4ihlp17t5nz.R.globalSliceStart(getClass().getName(),5849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24ih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ih4ihlp17t5nz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ih4ihlp17t5nz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIX_SPACES.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5849,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24ih() throws java.lang.Exception{try{__CLR4_4_14ih4ihlp17t5nz.R.inc(5849);
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5850);String result = humaneval.correct.FIX_SPACES.fix_spaces(
            "Example"
        );
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5851);org.junit.Assert.assertEquals(
            result, "Example"
        );
    }finally{__CLR4_4_14ih4ihlp17t5nz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14ih4ihlp17t5nz.R.globalSliceStart(getClass().getName(),5852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4ik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ih4ihlp17t5nz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ih4ihlp17t5nz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIX_SPACES.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5852,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4ik() throws java.lang.Exception{try{__CLR4_4_14ih4ihlp17t5nz.R.inc(5852);
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5853);String result = humaneval.correct.FIX_SPACES.fix_spaces(
            "Mudasir Hanif "
        );
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5854);org.junit.Assert.assertEquals(
            result, "Mudasir_Hanif_"
        );
    }finally{__CLR4_4_14ih4ihlp17t5nz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14ih4ihlp17t5nz.R.globalSliceStart(getClass().getName(),5855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ih4ihlp17t5nz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ih4ihlp17t5nz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIX_SPACES.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444in() throws java.lang.Exception{try{__CLR4_4_14ih4ihlp17t5nz.R.inc(5855);
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5856);String result = humaneval.correct.FIX_SPACES.fix_spaces(
            "Yellow Yellow  Dirty  Fellow"
        );
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5857);org.junit.Assert.assertEquals(
            result, "Yellow_Yellow__Dirty__Fellow"
        );
    }finally{__CLR4_4_14ih4ihlp17t5nz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14ih4ihlp17t5nz.R.globalSliceStart(getClass().getName(),5858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4iq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ih4ihlp17t5nz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ih4ihlp17t5nz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIX_SPACES.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4iq() throws java.lang.Exception{try{__CLR4_4_14ih4ihlp17t5nz.R.inc(5858);
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5859);String result = humaneval.correct.FIX_SPACES.fix_spaces(
            "Exa   mple"
        );
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5860);org.junit.Assert.assertEquals(
            result, "Exa-mple"
        );
    }finally{__CLR4_4_14ih4ihlp17t5nz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14ih4ihlp17t5nz.R.globalSliceStart(getClass().getName(),5861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64it();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ih4ihlp17t5nz.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ih4ihlp17t5nz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIX_SPACES.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5861,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64it() throws java.lang.Exception{try{__CLR4_4_14ih4ihlp17t5nz.R.inc(5861);
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5862);String result = humaneval.correct.FIX_SPACES.fix_spaces(
            "   Exa 1 2 2 mple"
        );
        __CLR4_4_14ih4ihlp17t5nz.R.inc(5863);org.junit.Assert.assertEquals(
            result, "-Exa_1_2_2_mple"
        );
    }finally{__CLR4_4_14ih4ihlp17t5nz.R.flushNeeded();}}
}
