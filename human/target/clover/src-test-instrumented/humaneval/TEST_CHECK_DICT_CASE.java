/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.HashMap;

public class TEST_CHECK_DICT_CASE {static class __CLR4_4_13ve3velp17t5f2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5060,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23ve() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5018);
        __CLR4_4_13ve3velp17t5f2.R.inc(5019);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5020);
                __CLR4_4_13ve3velp17t5f2.R.inc(5021);put("p", "pineapple");
                __CLR4_4_13ve3velp17t5f2.R.inc(5022);put("b", "banana");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5023);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3vk() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5024);
        __CLR4_4_13ve3velp17t5f2.R.inc(5025);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5026);
                __CLR4_4_13ve3velp17t5f2.R.inc(5027);put("p", "pineapple");
                __CLR4_4_13ve3velp17t5f2.R.inc(5028);put("A", "banana");
                __CLR4_4_13ve3velp17t5f2.R.inc(5029);put("B", "banana");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5030);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443vr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5031,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443vr() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5031);
        __CLR4_4_13ve3velp17t5f2.R.inc(5032);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5033);
                __CLR4_4_13ve3velp17t5f2.R.inc(5034);put("p", "pineapple");
                __CLR4_4_13ve3velp17t5f2.R.inc(5035);put(new Integer(5), "banana");
                __CLR4_4_13ve3velp17t5f2.R.inc(5036);put("a", "apple");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5037);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3vy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5038,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3vy() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5038);
        __CLR4_4_13ve3velp17t5f2.R.inc(5039);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5040);
                __CLR4_4_13ve3velp17t5f2.R.inc(5041);put("Name", "John");
                __CLR4_4_13ve3velp17t5f2.R.inc(5042);put("Age", "36");
                __CLR4_4_13ve3velp17t5f2.R.inc(5043);put("City", "Houston");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5044);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63w5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63w5() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5045);
        __CLR4_4_13ve3velp17t5f2.R.inc(5046);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5047);
                __CLR4_4_13ve3velp17t5f2.R.inc(5048);put("STATE", "NC");
                __CLR4_4_13ve3velp17t5f2.R.inc(5049);put("ZIP", "12345");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5050);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3wb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3wb() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5051);
        __CLR4_4_13ve3velp17t5f2.R.inc(5052);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>() {{try{__CLR4_4_13ve3velp17t5f2.R.inc(5053);
                __CLR4_4_13ve3velp17t5f2.R.inc(5054);put("fruit", "Orange");
                __CLR4_4_13ve3velp17t5f2.R.inc(5055);put("taste", "Sweet");
            }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}}
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5056);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13ve3velp17t5f2.R.globalSliceStart(getClass().getName(),5057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83wh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13ve3velp17t5f2.R.rethrow($CLV_t2$);}finally{__CLR4_4_13ve3velp17t5f2.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHECK_DICT_CASE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83wh() throws java.lang.Exception{try{__CLR4_4_13ve3velp17t5f2.R.inc(5057);
        __CLR4_4_13ve3velp17t5f2.R.inc(5058);boolean result = humaneval.correct.CHECK_DICT_CASE.check_dict_case(
            new HashMap<Object, Object>()
        );
        __CLR4_4_13ve3velp17t5f2.R.inc(5059);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_13ve3velp17t5f2.R.flushNeeded();}}
}
