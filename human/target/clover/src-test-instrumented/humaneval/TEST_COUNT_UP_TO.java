/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_COUNT_UP_TO {static class __CLR4_4_142v42vlp17t5if{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5317,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp242v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5287,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp242v() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5287);
        __CLR4_4_142v42vlp17t5if.R.inc(5288);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(5);
        __CLR4_4_142v42vlp17t5if.R.inc(5289);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl42y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5290,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl42y() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5290);
        __CLR4_4_142v42vlp17t5if.R.inc(5291);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(6);
        __CLR4_4_142v42vlp17t5if.R.inc(5292);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44431();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5293,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44431() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5293);
        __CLR4_4_142v42vlp17t5if.R.inc(5294);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(7);
        __CLR4_4_142v42vlp17t5if.R.inc(5295);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn434();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5296,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn434() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5296);
        __CLR4_4_142v42vlp17t5if.R.inc(5297);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(10);
        __CLR4_4_142v42vlp17t5if.R.inc(5298);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj6437();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5299,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj6437() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5299);
        __CLR4_4_142v42vlp17t5if.R.inc(5300);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(0);
        __CLR4_4_142v42vlp17t5if.R.inc(5301);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp43a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5302,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp43a() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5302);
        __CLR4_4_142v42vlp17t5if.R.inc(5303);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(22);
        __CLR4_4_142v42vlp17t5if.R.inc(5304);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy843d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5305,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy843d() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5305);
        __CLR4_4_142v42vlp17t5if.R.inc(5306);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(1);
        __CLR4_4_142v42vlp17t5if.R.inc(5307);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>()
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r43g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5308,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r43g() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5308);
        __CLR4_4_142v42vlp17t5if.R.inc(5309);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(18);
        __CLR4_4_142v42vlp17t5if.R.inc(5310);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq43j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5311,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq43j() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5311);
        __CLR4_4_142v42vlp17t5if.R.inc(5312);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(47);
        __CLR4_4_142v42vlp17t5if.R.inc(5313);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_142v42vlp17t5if.R.globalSliceStart(getClass().getName(),5314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f743m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_142v42vlp17t5if.R.rethrow($CLV_t2$);}finally{__CLR4_4_142v42vlp17t5if.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_UP_TO.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5314,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f743m() throws java.lang.Exception{try{__CLR4_4_142v42vlp17t5if.R.inc(5314);
        __CLR4_4_142v42vlp17t5if.R.inc(5315);List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(101);
        __CLR4_4_142v42vlp17t5if.R.inc(5316);org.junit.Assert.assertEquals(
            result, new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97))
        );
    }finally{__CLR4_4_142v42vlp17t5if.R.flushNeeded();}}
}
