/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_BF {static class __CLR4_4_13t43t4lp0zmi7t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,4957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23t4() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4936);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4937);ArrayList<String> result = humaneval.correct.BF.bf("Jupiter", "Neptune");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4938);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Saturn", "Uranus"
            ))
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3t7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3t7() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4939);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4940);ArrayList<String> result = humaneval.correct.BF.bf("Earth", "Mercury");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4941);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus"
            ))
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443ta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443ta() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4942);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4943);ArrayList<String> result = humaneval.correct.BF.bf("Mercury", "Uranus");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4944);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus", "Earth", "Mars", "Jupiter", "Saturn"
            ))
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3td();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3td() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4945);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4946);ArrayList<String> result = humaneval.correct.BF.bf("Neptune", "Venus");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4947);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth", "Mars", "Jupiter", "Saturn", "Uranus"
            ))
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63tg() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4948);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4949);ArrayList<String> result = humaneval.correct.BF.bf("Earth", "Earth");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4950);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3tj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3tj() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4951);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4952);ArrayList<String> result = humaneval.correct.BF.bf("Mars", "Earth");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4953);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13t43t4lp0zmi7t.R.globalSliceStart(getClass().getName(),4954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83tm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13t43t4lp0zmi7t.R.rethrow($CLV_t2$);}finally{__CLR4_4_13t43t4lp0zmi7t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83tm() throws java.lang.Exception{try{__CLR4_4_13t43t4lp0zmi7t.R.inc(4954);
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4955);ArrayList<String> result = humaneval.correct.BF.bf("Jupiter", "Makemake");
        __CLR4_4_13t43t4lp0zmi7t.R.inc(4956);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13t43t4lp0zmi7t.R.flushNeeded();}}
}
