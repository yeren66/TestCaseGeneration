/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_COUNT_NUMS {static class __CLR4_4_141e41elp17t5hp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp241e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5234,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp241e() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5234);
        __CLR4_4_141e41elp17t5hp.R.inc(5235);ArrayList<Integer> input = new ArrayList<>();
        __CLR4_4_141e41elp17t5hp.R.inc(5236);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5237);org.junit.Assert.assertEquals(result, 0);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl41i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl41i() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5238);
        __CLR4_4_141e41elp17t5hp.R.inc(5239);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, -2, 0));
        __CLR4_4_141e41elp17t5hp.R.inc(5240);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5241);org.junit.Assert.assertEquals(result, 0);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4441m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5242,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4441m() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5242);
        __CLR4_4_141e41elp17t5hp.R.inc(5243);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 2, -2, 3, 4, 5));
        __CLR4_4_141e41elp17t5hp.R.inc(5244);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5245);org.junit.Assert.assertEquals(result, 6);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn41q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5246,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn41q() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5246);
        __CLR4_4_141e41elp17t5hp.R.inc(5247);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 6, 9, -6, 0, 1, 5));
        __CLR4_4_141e41elp17t5hp.R.inc(5248);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5249);org.junit.Assert.assertEquals(result, 5);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5250);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj641u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5250,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj641u() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5250);
        __CLR4_4_141e41elp17t5hp.R.inc(5251);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 100, 98, -7, 1, -1));
        __CLR4_4_141e41elp17t5hp.R.inc(5252);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5253);org.junit.Assert.assertEquals(result, 4);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp41y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5254,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp41y() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5254);
        __CLR4_4_141e41elp17t5hp.R.inc(5255);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(12, 23, 34, -45, -56, 0));
        __CLR4_4_141e41elp17t5hp.R.inc(5256);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5257);org.junit.Assert.assertEquals(result, 5);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy8422();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5258,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy8422() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5258);
        __CLR4_4_141e41elp17t5hp.R.inc(5259);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-0, 1^0));
        __CLR4_4_141e41elp17t5hp.R.inc(5260);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5261);org.junit.Assert.assertEquals(result, 1);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {__CLR4_4_141e41elp17t5hp.R.globalSliceStart(getClass().getName(),5262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r426();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_141e41elp17t5hp.R.rethrow($CLV_t2$);}finally{__CLR4_4_141e41elp17t5hp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_COUNT_NUMS.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5262,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r426() throws java.lang.Exception{try{__CLR4_4_141e41elp17t5hp.R.inc(5262);
        __CLR4_4_141e41elp17t5hp.R.inc(5263);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1));
        __CLR4_4_141e41elp17t5hp.R.inc(5264);int result = humaneval.correct.COUNT_NUMS.count_nums(input);
        __CLR4_4_141e41elp17t5hp.R.inc(5265);org.junit.Assert.assertEquals(result, 1);
    }finally{__CLR4_4_141e41elp17t5hp.R.flushNeeded();}}
}