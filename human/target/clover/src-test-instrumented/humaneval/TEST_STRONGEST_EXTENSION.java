/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_STRONGEST_EXTENSION {static class __CLR4_4_1634634lp0zmiwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp2634();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7888,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp2634() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7888);
        __CLR4_4_1634634lp0zmiwm.R.inc(7889);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "Watashi", new String[] {"tEN", "niNE", "eIGHt8OKe"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7890);org.junit.Assert.assertEquals(
            result, "Watashi.eIGHt8OKe"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl637();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl637() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7891);
        __CLR4_4_1634634lp0zmiwm.R.inc(7892);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "Boku233", new String[] {"nani", "NazeDa", "YEs.WeCaNe", "32145tggg"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7893);org.junit.Assert.assertEquals(
            result, "Boku233.YEs.WeCaNe"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4463a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4463a() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7894);
        __CLR4_4_1634634lp0zmiwm.R.inc(7895);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "__YESIMHERE", new String[] {"t", "eMptY", "nothing", "zeR00", "NuLl__", "123NoooneB321"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7896);org.junit.Assert.assertEquals(
            result, "__YESIMHERE.NuLl__"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn63d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn63d() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7897);
        __CLR4_4_1634634lp0zmiwm.R.inc(7898);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "K", new String[] {"Ta", "TAR", "t234An", "cosSo"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7899);org.junit.Assert.assertEquals(
            result, "K.TAR"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj663g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj663g() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7900);
        __CLR4_4_1634634lp0zmiwm.R.inc(7901);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "__HAHA", new String[] {"Tab", "123", "781345", "-_-"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7902);org.junit.Assert.assertEquals(
            result, "__HAHA.123"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp63j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp63j() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7903);
        __CLR4_4_1634634lp0zmiwm.R.inc(7904);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "YameRore", new String[] {"HhAas", "okIWILL123", "WorkOut", "Fails", "-_-"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7905);org.junit.Assert.assertEquals(
            result, "YameRore.okIWILL123"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy863m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy863m() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7906);
        __CLR4_4_1634634lp0zmiwm.R.inc(7907);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "finNNalLLly", new String[] {"Die", "NowW", "Wow", "WoW"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7908);org.junit.Assert.assertEquals(
            result, "finNNalLLly.WoW"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r63p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r63p() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7909);
        __CLR4_4_1634634lp0zmiwm.R.inc(7910);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "_", new String[] {"Bb", "91245"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7911);org.junit.Assert.assertEquals(
            result, "_.Bb"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_1634634lp0zmiwm.R.globalSliceStart(getClass().getName(),7912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq63s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_1634634lp0zmiwm.R.rethrow($CLV_t2$);}finally{__CLR4_4_1634634lp0zmiwm.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRONGEST_EXTENSION.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq63s() throws java.lang.Exception{try{__CLR4_4_1634634lp0zmiwm.R.inc(7912);
        __CLR4_4_1634634lp0zmiwm.R.inc(7913);String result = humaneval.correct.STRONGEST_EXTENSION.strongest_extension(
            "Sp", new String[] {"671235", "Bb"}
        );
        __CLR4_4_1634634lp0zmiwm.R.inc(7914);org.junit.Assert.assertEquals(
            result, "Sp.671235"
        );
    }finally{__CLR4_4_1634634lp0zmiwm.R.flushNeeded();}}
}
