/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SELECT_WORDS {static class __CLR4_4_15qk5qklp0zmirx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25qk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7436,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25qk() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7436);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7437);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("Mary had a little lamb", 4);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7438);ArrayList<String> desired = new ArrayList<>(Arrays.asList("little"));
        __CLR4_4_15qk5qklp0zmirx.R.inc(7439);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7440);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5qo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7440,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5qo() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7440);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7441);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("Mary had a little lamb", 3);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7442);ArrayList<String> desired = new ArrayList<>(Arrays.asList("Mary", "lamb"));
        __CLR4_4_15qk5qklp0zmirx.R.inc(7443);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445qs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7444,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445qs() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7444);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7445);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("simple white space", 2);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7446);ArrayList<String> desired = new ArrayList<>();
        __CLR4_4_15qk5qklp0zmirx.R.inc(7447);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7448,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5qw() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7448);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7449);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("Hello world", 4);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7450);ArrayList<String> desired = new ArrayList<>(Arrays.asList("world"));
        __CLR4_4_15qk5qklp0zmirx.R.inc(7451);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7452,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65r0() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7452);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7453);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("Uncle sam", 3);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7454);ArrayList<String> desired = new ArrayList<>(Arrays.asList("Uncle"));
        __CLR4_4_15qk5qklp0zmirx.R.inc(7455);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7456,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5r4() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7456);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7457);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("", 4);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7458);ArrayList<String> desired = new ArrayList<>();
        __CLR4_4_15qk5qklp0zmirx.R.inc(7459);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15qk5qklp0zmirx.R.globalSliceStart(getClass().getName(),7460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15qk5qklp0zmirx.R.rethrow($CLV_t2$);}finally{__CLR4_4_15qk5qklp0zmirx.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SELECT_WORDS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7460,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85r8() throws java.lang.Exception{try{__CLR4_4_15qk5qklp0zmirx.R.inc(7460);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7461);ArrayList<String> result = humaneval.correct.SELECT_WORDS.select_words("a b c d e f", 1);
        __CLR4_4_15qk5qklp0zmirx.R.inc(7462);ArrayList<String> desired = new ArrayList<>(Arrays.asList("b", "c", "d", "f"));
        __CLR4_4_15qk5qklp0zmirx.R.inc(7463);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_15qk5qklp0zmirx.R.flushNeeded();}}
}
