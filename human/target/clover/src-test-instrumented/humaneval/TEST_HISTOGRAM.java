/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.HashMap;

public class TEST_HISTOGRAM {static class __CLR4_4_14ox4oxlp17t5s2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6130,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	@org.junit.Test(timeout = 3000)
	public void test_0() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24ox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6081,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24ox() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6081);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6082);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("a b b a");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6083);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6084);desired.put('a', 2);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6085);desired.put('b', 2);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6086);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_1() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4p3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6087,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4p3() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6087);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6088);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("a b c a b");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6089);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6090);desired.put('a', 2);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6091);desired.put('b', 2);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6092);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_2() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444p9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6093,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444p9() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6093);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6094);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("a b c d g");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6095);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6096);desired.put('a', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6097);desired.put('b', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6098);desired.put('c', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6099);desired.put('d', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6100);desired.put('g', 1);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6101);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_3() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4pi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6102,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4pi() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6102);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6103);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("r t g");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6104);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6105);desired.put('r', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6106);desired.put('t', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6107);desired.put('g', 1);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6108);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_4() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64pp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64pp() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6109);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6110);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("b b b b a");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6111);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6112);desired.put('b', 4);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6113);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_5() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4pu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6114,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4pu() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6114);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6115);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("r t g");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6116);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6117);desired.put('r', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6118);desired.put('t', 1);
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6119);desired.put('g', 1);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6120);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_6() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84q1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84q1() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6121);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6122);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6123);HashMap<Character, Integer> desired = new HashMap<>();
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6124);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
	@org.junit.Test(timeout = 3000)
	public void test_7() throws java.lang.Exception {__CLR4_4_14ox4oxlp17t5s2.R.globalSliceStart(getClass().getName(),6125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14ox4oxlp17t5s2.R.rethrow($CLV_t2$);}finally{__CLR4_4_14ox4oxlp17t5s2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HISTOGRAM.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6125,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4q5() throws java.lang.Exception{try{__CLR4_4_14ox4oxlp17t5s2.R.inc(6125);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6126);HashMap<Character, Integer> result = humaneval.correct.HISTOGRAM.histogram("a");
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6127);HashMap<Character, Integer> desired = new HashMap<>();
        __CLR4_4_14ox4oxlp17t5s2.R.inc(6128);desired.put('a', 1);
		__CLR4_4_14ox4oxlp17t5s2.R.inc(6129);org.junit.Assert.assertEquals(result, desired);
	}finally{__CLR4_4_14ox4oxlp17t5s2.R.flushNeeded();}}
}
