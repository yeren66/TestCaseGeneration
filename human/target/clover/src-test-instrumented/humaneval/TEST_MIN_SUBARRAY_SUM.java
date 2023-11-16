/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MIN_SUBARRAY_SUM {static class __CLR4_4_159i59ilp0zminp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout=3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp259i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp259i() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6822);
        __CLR4_4_159i59ilp0zminp.R.inc(6823);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(2L, 3L, 4L, 1L, 2L, 4L));
        __CLR4_4_159i59ilp0zminp.R.inc(6824);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6825);org.junit.Assert.assertEquals(1, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl59m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6826,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl59m() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6826);
        __CLR4_4_159i59ilp0zminp.R.inc(6827);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L));
        __CLR4_4_159i59ilp0zminp.R.inc(6828);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6829);org.junit.Assert.assertEquals(-6, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4459q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6830,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4459q() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6830);
        __CLR4_4_159i59ilp0zminp.R.inc(6831);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L, 2L, -10L));
        __CLR4_4_159i59ilp0zminp.R.inc(6832);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6833);org.junit.Assert.assertEquals(-14, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn59u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn59u() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6834);
        __CLR4_4_159i59ilp0zminp.R.inc(6835);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-9999999999999999L));
        __CLR4_4_159i59ilp0zminp.R.inc(6836);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6837);org.junit.Assert.assertEquals(-9999999999999999L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj659y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6838,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj659y() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6838);
        __CLR4_4_159i59ilp0zminp.R.inc(6839);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(0L, 10L, 20L, 1000000L));
        __CLR4_4_159i59ilp0zminp.R.inc(6840);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6841);org.junit.Assert.assertEquals(0L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5a2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6842,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5a2() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6842);
        __CLR4_4_159i59ilp0zminp.R.inc(6843);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-1L, -2L, -3L, 10L, -5L));
        __CLR4_4_159i59ilp0zminp.R.inc(6844);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6845);org.junit.Assert.assertEquals(-6L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85a6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85a6() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6846);
        __CLR4_4_159i59ilp0zminp.R.inc(6847);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(100L, -1L, -2L, -3L, 10L, -5L));
        __CLR4_4_159i59ilp0zminp.R.inc(6848);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6849);org.junit.Assert.assertEquals(-6L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5aa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6850,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5aa() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6850);
        __CLR4_4_159i59ilp0zminp.R.inc(6851);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(10L, 11L, 13L, 8L, 3L, 4L));
        __CLR4_4_159i59ilp0zminp.R.inc(6852);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6853);org.junit.Assert.assertEquals(3L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6854,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5ae() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6854);
        __CLR4_4_159i59ilp0zminp.R.inc(6855);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(100L, -33L, 32L, -1L, 0L, -2L));
        __CLR4_4_159i59ilp0zminp.R.inc(6856);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6857);org.junit.Assert.assertEquals(-33L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75ai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6858,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75ai() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6858);
        __CLR4_4_159i59ilp0zminp.R.inc(6859);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(-10L));
        __CLR4_4_159i59ilp0zminp.R.inc(6860);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6861);org.junit.Assert.assertEquals(-10L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x5am();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6862,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x5am() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6862);
        __CLR4_4_159i59ilp0zminp.R.inc(6863);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(7L));
        __CLR4_4_159i59ilp0zminp.R.inc(6864);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6865);org.junit.Assert.assertEquals(7L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
    @org.junit.Test(timeout=3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_159i59ilp0zminp.R.globalSliceStart(getClass().getName(),6866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg5aq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_159i59ilp0zminp.R.rethrow($CLV_t2$);}finally{__CLR4_4_159i59ilp0zminp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_SUBARRAY_SUM.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6866,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg5aq() throws java.lang.Exception{try{__CLR4_4_159i59ilp0zminp.R.inc(6866);
        __CLR4_4_159i59ilp0zminp.R.inc(6867);ArrayList<Long> input = new ArrayList<Long>(Arrays.asList(1L, -1L));
        __CLR4_4_159i59ilp0zminp.R.inc(6868);long result = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(input);
        __CLR4_4_159i59ilp0zminp.R.inc(6869);org.junit.Assert.assertEquals(-1L, result);
    }finally{__CLR4_4_159i59ilp0zminp.R.flushNeeded();}}
}
