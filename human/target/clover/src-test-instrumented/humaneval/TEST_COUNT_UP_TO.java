/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_COUNT_UP_TO {static class __CLR4_4_143d43dlp0zmibo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5335,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp243d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp243d() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5305);
        __CLR4_4_143d43dlp0zmibo.R.inc(5306);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(5);
        __CLR4_4_143d43dlp0zmibo.R.inc(5307);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl43g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl43g() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5308);
        __CLR4_4_143d43dlp0zmibo.R.inc(5309);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(6);
        __CLR4_4_143d43dlp0zmibo.R.inc(5310);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4443j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4443j() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5311);
        __CLR4_4_143d43dlp0zmibo.R.inc(5312);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(7);
        __CLR4_4_143d43dlp0zmibo.R.inc(5313);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn43m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn43m() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5314);
        __CLR4_4_143d43dlp0zmibo.R.inc(5315);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(10);
        __CLR4_4_143d43dlp0zmibo.R.inc(5316);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj643p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5317,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj643p() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5317);
        __CLR4_4_143d43dlp0zmibo.R.inc(5318);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(0);
        __CLR4_4_143d43dlp0zmibo.R.inc(5319);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp43s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5320,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp43s() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5320);
        __CLR4_4_143d43dlp0zmibo.R.inc(5321);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(22);
        __CLR4_4_143d43dlp0zmibo.R.inc(5322);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5323);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy843v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5323,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy843v() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5323);
        __CLR4_4_143d43dlp0zmibo.R.inc(5324);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(1);
        __CLR4_4_143d43dlp0zmibo.R.inc(5325);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r43y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5326,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r43y() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5326);
        __CLR4_4_143d43dlp0zmibo.R.inc(5327);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(18);
        __CLR4_4_143d43dlp0zmibo.R.inc(5328);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq441();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5329,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq441() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5329);
        __CLR4_4_143d43dlp0zmibo.R.inc(5330);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(47);
        __CLR4_4_143d43dlp0zmibo.R.inc(5331);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_143d43dlp0zmibo.R.globalSliceStart(getClass().getName(),5332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7444();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_143d43dlp0zmibo.R.rethrow($CLV_t2$);}finally{__CLR4_4_143d43dlp0zmibo.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5332,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7444() throws java.lang.Exception{try{__CLR4_4_143d43dlp0zmibo.R.inc(5332);
        __CLR4_4_143d43dlp0zmibo.R.inc(5333);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(101);
        __CLR4_4_143d43dlp0zmibo.R.inc(5334);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
        );
    }finally{__CLR4_4_143d43dlp0zmibo.R.flushNeeded();}}
}
