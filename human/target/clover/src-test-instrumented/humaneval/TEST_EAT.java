/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_EAT {static class __CLR4_4_1481481lp17t5ka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2481();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2481() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5473);
        __CLR4_4_1481481lp17t5ka.R.inc(5474);int[] result = humaneval.correct.EAT.eat(5, 6, 10);
        __CLR4_4_1481481lp17t5ka.R.inc(5475);org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 4}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl484();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5476,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl484() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5476);
        __CLR4_4_1481481lp17t5ka.R.inc(5477);int[] result = humaneval.correct.EAT.eat(4, 8, 9);
        __CLR4_4_1481481lp17t5ka.R.inc(5478);org.junit.Assert.assertArrayEquals(
            result, new int[] {12, 1}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44487();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5479,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44487() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5479);
        __CLR4_4_1481481lp17t5ka.R.inc(5480);int[] result = humaneval.correct.EAT.eat(1, 10, 10);
        __CLR4_4_1481481lp17t5ka.R.inc(5481);org.junit.Assert.assertArrayEquals(
            result, new int[] {11, 0}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn48a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5482,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn48a() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5482);
        __CLR4_4_1481481lp17t5ka.R.inc(5483);int[] result = humaneval.correct.EAT.eat(2, 11, 5);
        __CLR4_4_1481481lp17t5ka.R.inc(5484);org.junit.Assert.assertArrayEquals(
            result, new int[] {7, 0}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj648d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5485,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj648d() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5485);
        __CLR4_4_1481481lp17t5ka.R.inc(5486);int[] result = humaneval.correct.EAT.eat(4, 5, 7);
        __CLR4_4_1481481lp17t5ka.R.inc(5487);org.junit.Assert.assertArrayEquals(
            result, new int[] {9, 2}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_1481481lp17t5ka.R.globalSliceStart(getClass().getName(),5488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp48g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1481481lp17t5ka.R.rethrow($CLV_t2$);}finally{__CLR4_4_1481481lp17t5ka.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EAT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5488,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp48g() throws java.lang.Exception{try{__CLR4_4_1481481lp17t5ka.R.inc(5488);
        __CLR4_4_1481481lp17t5ka.R.inc(5489);int[] result = humaneval.correct.EAT.eat(4, 5, 1);
        __CLR4_4_1481481lp17t5ka.R.inc(5490);org.junit.Assert.assertArrayEquals(
            result, new int[] {5, 0}
        );
    }finally{__CLR4_4_1481481lp17t5ka.R.flushNeeded();}}
}
