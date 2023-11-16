/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_TOTAL_MATCH {static class __CLR4_4_166j66jlp17t67w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,8038,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp266j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8011,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp266j() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8011);
        __CLR4_4_166j66jlp17t67w.R.inc(8012);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(), new ArrayList<String>()
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8013);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl66m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8014,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl66m() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8014);
        __CLR4_4_166j66jlp17t67w.R.inc(8015);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hi", "hi"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8016);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "hi"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4466p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8017,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4466p() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8017);
        __CLR4_4_166j66jlp17t67w.R.inc(8018);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hi", "hi", "admin", "project"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8019);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "admin"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn66s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8020,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn66s() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8020);
        __CLR4_4_166j66jlp17t67w.R.inc(8021);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("4")), 
            new ArrayList<String>(Arrays.asList("1", "2", "3", "4", "5"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8022);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("4"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj666v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8023,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj666v() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8023);
        __CLR4_4_166j66jlp17t67w.R.inc(8024);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "Hi"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8025);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hI", "Hi"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp66y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8026,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp66y() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8026);
        __CLR4_4_166j66jlp17t67w.R.inc(8027);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "hi", "hi"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8028);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hI", "hi", "hi"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy8671();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8029,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy8671() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8029);
        __CLR4_4_166j66jlp17t67w.R.inc(8030);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("hi", "admin")), 
            new ArrayList<String>(Arrays.asList("hI", "hi", "hii"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8031);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList("hi", "admin"))
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r674();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8032,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r674() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8032);
        __CLR4_4_166j66jlp17t67w.R.inc(8033);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(), 
            new ArrayList<String>(Arrays.asList("this"))
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8034);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_166j66jlp17t67w.R.globalSliceStart(getClass().getName(),8035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq677();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_166j66jlp17t67w.R.rethrow($CLV_t2$);}finally{__CLR4_4_166j66jlp17t67w.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_TOTAL_MATCH.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8035,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq677() throws java.lang.Exception{try{__CLR4_4_166j66jlp17t67w.R.inc(8035);
        __CLR4_4_166j66jlp17t67w.R.inc(8036);List<String> result = humaneval.correct.TOTAL_MATCH.total_match(
            new ArrayList<String>(Arrays.asList("this")),
            new ArrayList<String>()
        );
        __CLR4_4_166j66jlp17t67w.R.inc(8037);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_166j66jlp17t67w.R.flushNeeded();}}
}
