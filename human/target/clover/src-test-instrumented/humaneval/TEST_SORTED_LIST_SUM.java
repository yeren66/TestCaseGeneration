/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_SORTED_LIST_SUM {static class __CLR4_4_15vs5vslp17t653{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7645,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25vs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7624,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25vs() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7624);
        __CLR4_4_15vs5vslp17t653.R.inc(7625);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("aa", "a", "aaa"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7626);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("aa"))
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5vv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7627,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5vv() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7627);
        __CLR4_4_15vs5vslp17t653.R.inc(7628);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("school", "AI", "asdf", "b"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7629);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("AI", "asdf", "school"))
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445vy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7630,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445vy() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7630);
        __CLR4_4_15vs5vslp17t653.R.inc(7631);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("d", "b", "c", "a"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7632);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5w1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5w1() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7633);
        __CLR4_4_15vs5vslp17t653.R.inc(7634);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("d", "dcba", "abcd", "a"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7635);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("abcd", "dcba"))
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65w4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7636,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65w4() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7636);
        __CLR4_4_15vs5vslp17t653.R.inc(7637);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("AI", "ai", "au"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7638);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("AI", "ai", "au"))
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5w7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7639,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5w7() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7639);
        __CLR4_4_15vs5vslp17t653.R.inc(7640);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("a", "b", "b", "c", "c", "a"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7641);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15vs5vslp17t653.R.globalSliceStart(getClass().getName(),7642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85wa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15vs5vslp17t653.R.rethrow($CLV_t2$);}finally{__CLR4_4_15vs5vslp17t653.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SORTED_LIST_SUM.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7642,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85wa() throws java.lang.Exception{try{__CLR4_4_15vs5vslp17t653.R.inc(7642);
        __CLR4_4_15vs5vslp17t653.R.inc(7643);ArrayList<String> result = humaneval.correct.SORTED_LIST_SUM.sorted_list_sum(
            new ArrayList<String>(Arrays.asList("aaaa", "bbbb", "dd", "cc"))
        );
        __CLR4_4_15vs5vslp17t653.R.inc(7644);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("cc", "dd", "aaaa", "bbbb"))
        );
    }finally{__CLR4_4_15vs5vslp17t653.R.flushNeeded();}}
}
