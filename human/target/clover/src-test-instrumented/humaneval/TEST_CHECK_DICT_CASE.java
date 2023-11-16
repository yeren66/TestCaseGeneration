/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.HashMap;

public class TEST_CHECK_DICT_CASE {static class __CLR4_4_13vw3vwlp0zmi8q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23vw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5036,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23vw() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5036);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5037);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5038);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5039);put("p", "pineapple");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5040);put("b", "banana");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5041);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3w2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3w2() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5042);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5043);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5044);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5045);put("p", "pineapple");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5046);put("A", "banana");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5047);put("B", "banana");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5048);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443w9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5049,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443w9() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5049);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5050);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5051);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5052);put("p", "pineapple");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5053);put(new Integer(5), "banana");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5054);put("a", "apple");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5055);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3wg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5056,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3wg() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5056);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5057);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5058);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5059);put("Name", "John");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5060);put("Age", "36");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5061);put("City", "Houston");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5062);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63wn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5063,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63wn() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5063);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5064);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5065);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5066);put("STATE", "NC");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5067);put("ZIP", "12345");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5068);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3wt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5069,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3wt() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5069);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5070);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5071);
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5072);put("fruit", "Orange");
                __CLR4_4_13vw3vwlp0zmi8q.R.inc(5073);put("taste", "Sweet");
            }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}}
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5074);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceStart(getClass().getName(),5075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83wz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13vw3vwlp0zmi8q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13vw3vwlp0zmi8q.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5075,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83wz() throws java.lang.Exception{try{__CLR4_4_13vw3vwlp0zmi8q.R.inc(5075);
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5076);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>()
        );
        __CLR4_4_13vw3vwlp0zmi8q.R.inc(5077);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13vw3vwlp0zmi8q.R.flushNeeded();}}
}
