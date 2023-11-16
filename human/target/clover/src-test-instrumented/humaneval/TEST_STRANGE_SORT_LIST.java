/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_STRANGE_SORT_LIST {static class __CLR4_4_161a61alp0zmivp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp261a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7822,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp261a() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7822);
        __CLR4_4_161a61alp0zmivp.R.inc(7823);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7824);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 4, 2, 3))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl61d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl61d() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7825);
        __CLR4_4_161a61alp0zmivp.R.inc(7826);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7827);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(5, 9, 6, 8, 7))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4461g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7828,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4461g() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7828);
        __CLR4_4_161a61alp0zmivp.R.inc(7829);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7830);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 5, 2, 4, 3))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn61j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7831,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn61j() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7831);
        __CLR4_4_161a61alp0zmivp.R.inc(7832);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 6, 7, 8, 9, 1))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7833);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 9, 5, 8, 6, 7))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj661m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7834,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj661m() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7834);
        __CLR4_4_161a61alp0zmivp.R.inc(7835);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>()
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7836);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp61p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp61p() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7837);
        __CLR4_4_161a61alp0zmivp.R.inc(7838);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7839);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(1, 8, 2, 7, 3, 6, 4, 5))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy861s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7840,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy861s() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7840);
        __CLR4_4_161a61alp0zmivp.R.inc(7841);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(0,2,2,2,5,5,-5,-5))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7842);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(-5, 5, -5, 5, 0, 2, 2, 2))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r61v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r61v() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7843);
        __CLR4_4_161a61alp0zmivp.R.inc(7844);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7845);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(5, 5, 5, 5))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_161a61alp0zmivp.R.globalSliceStart(getClass().getName(),7846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq61y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_161a61alp0zmivp.R.rethrow($CLV_t2$);}finally{__CLR4_4_161a61alp0zmivp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_STRANGE_SORT_LIST.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7846,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq61y() throws java.lang.Exception{try{__CLR4_4_161a61alp0zmivp.R.inc(7846);
        __CLR4_4_161a61alp0zmivp.R.inc(7847);List<Integer> result = humaneval.correct.STRANGE_SORT_LIST.strange_sort_list(
            new ArrayList<Integer>(Arrays.asList(111111))
        );
        __CLR4_4_161a61alp0zmivp.R.inc(7848);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(111111))
        );
    }finally{__CLR4_4_161a61alp0zmivp.R.flushNeeded();}}
}
