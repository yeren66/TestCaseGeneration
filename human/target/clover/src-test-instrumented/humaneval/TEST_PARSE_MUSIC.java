/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.List;

public class TEST_PARSE_MUSIC {static class __CLR4_4_15fz5fzlp17t602{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7070,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15fz5fzlp17t602.R.globalSliceStart(getClass().getName(),7055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25fz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fz5fzlp17t602.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fz5fzlp17t602.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PARSE_MUSIC.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7055,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25fz() throws java.lang.Exception{try{__CLR4_4_15fz5fzlp17t602.R.inc(7055);
        __CLR4_4_15fz5fzlp17t602.R.inc(7056);List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music("");
        __CLR4_4_15fz5fzlp17t602.R.inc(7057);org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {}
        );
    }finally{__CLR4_4_15fz5fzlp17t602.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15fz5fzlp17t602.R.globalSliceStart(getClass().getName(),7058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5g2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fz5fzlp17t602.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fz5fzlp17t602.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PARSE_MUSIC.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7058,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5g2() throws java.lang.Exception{try{__CLR4_4_15fz5fzlp17t602.R.inc(7058);
        __CLR4_4_15fz5fzlp17t602.R.inc(7059);List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music("o o o o");
        __CLR4_4_15fz5fzlp17t602.R.inc(7060);org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {4, 4, 4, 4}
        );
    }finally{__CLR4_4_15fz5fzlp17t602.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15fz5fzlp17t602.R.globalSliceStart(getClass().getName(),7061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445g5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fz5fzlp17t602.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fz5fzlp17t602.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PARSE_MUSIC.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7061,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445g5() throws java.lang.Exception{try{__CLR4_4_15fz5fzlp17t602.R.inc(7061);
        __CLR4_4_15fz5fzlp17t602.R.inc(7062);List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music(".| .| .| .|");
        __CLR4_4_15fz5fzlp17t602.R.inc(7063);org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {1, 1, 1, 1}
        );
    }finally{__CLR4_4_15fz5fzlp17t602.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15fz5fzlp17t602.R.globalSliceStart(getClass().getName(),7064);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fz5fzlp17t602.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fz5fzlp17t602.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PARSE_MUSIC.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7064,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5g8() throws java.lang.Exception{try{__CLR4_4_15fz5fzlp17t602.R.inc(7064);
        __CLR4_4_15fz5fzlp17t602.R.inc(7065);List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music("o| o| .| .| o o o o");
        __CLR4_4_15fz5fzlp17t602.R.inc(7066);org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {2, 2, 1, 1, 4, 4, 4, 4}
        );
    }finally{__CLR4_4_15fz5fzlp17t602.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15fz5fzlp17t602.R.globalSliceStart(getClass().getName(),7067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15fz5fzlp17t602.R.rethrow($CLV_t2$);}finally{__CLR4_4_15fz5fzlp17t602.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PARSE_MUSIC.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7067,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65gb() throws java.lang.Exception{try{__CLR4_4_15fz5fzlp17t602.R.inc(7067);
        __CLR4_4_15fz5fzlp17t602.R.inc(7068);List<Integer> result = humaneval.correct.PARSE_MUSIC.parse_music("o| .| o| .| o o| o o|");
        __CLR4_4_15fz5fzlp17t602.R.inc(7069);org.junit.Assert.assertArrayEquals(
            result.toArray(), new Integer[] {2, 1, 2, 1, 4, 2, 4, 2}
        );
    }finally{__CLR4_4_15fz5fzlp17t602.R.flushNeeded();}}
}
