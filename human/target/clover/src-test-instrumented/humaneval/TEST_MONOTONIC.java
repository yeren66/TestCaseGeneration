/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MONOTONIC {static class __CLR4_4_15bf5bflp17t5yf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25bf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6891,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25bf() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6891);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6892);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {1, 2, 4, 10}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6893);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5bi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6894,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5bi() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6894);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6895);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {1, 2, 4, 20}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6896);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445bl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6897,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445bl() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6897);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6898);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {1, 20, 4, 10}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6899);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5bo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6900,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5bo() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6900);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6901);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {4, 1, 0, -10}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6902);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65br();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6903,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65br() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6903);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6904);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {4, 1, 1, 0}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6905);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5bu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6906,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5bu() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6906);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6907);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {1, 2, 3, 2, 5, 60}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6908);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6909,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85bx() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6909);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6910);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {1, 2, 3, 4, 5, 60}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6911);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15bf5bflp17t5yf.R.globalSliceStart(getClass().getName(),6912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15bf5bflp17t5yf.R.rethrow($CLV_t2$);}finally{__CLR4_4_15bf5bflp17t5yf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MONOTONIC.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6912,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5c0() throws java.lang.Exception{try{__CLR4_4_15bf5bflp17t5yf.R.inc(6912);
        __CLR4_4_15bf5bflp17t5yf.R.inc(6913);boolean result = humaneval.correct.MONOTONIC.monotonic(
            new int[] {9, 9, 9, 9}
        );
        __CLR4_4_15bf5bflp17t5yf.R.inc(6914);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15bf5bflp17t5yf.R.flushNeeded();}}
}
