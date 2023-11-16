/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_GET_POSITIVE {static class __CLR4_4_14n34n3lp0zmiin{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6027,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14n34n3lp0zmiin.R.globalSliceStart(getClass().getName(),6015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24n3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n34n3lp0zmiin.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n34n3lp0zmiin.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_GET_POSITIVE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24n3() throws java.lang.Exception{try{__CLR4_4_14n34n3lp0zmiin.R.inc(6015);
        __CLR4_4_14n34n3lp0zmiin.R.inc(6016);List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1, -2, 4, 5, 6))
        );
        __CLR4_4_14n34n3lp0zmiin.R.inc(6017);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(4, 5, 6).toArray()
        );
    }finally{__CLR4_4_14n34n3lp0zmiin.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14n34n3lp0zmiin.R.globalSliceStart(getClass().getName(),6018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4n6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n34n3lp0zmiin.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n34n3lp0zmiin.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_GET_POSITIVE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4n6() throws java.lang.Exception{try{__CLR4_4_14n34n3lp0zmiin.R.inc(6018);
        __CLR4_4_14n34n3lp0zmiin.R.inc(6019);List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10))
        );
        __CLR4_4_14n34n3lp0zmiin.R.inc(6020);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(5, 3, 2, 3, 3, 9, 123, 1).toArray()
        );
    }finally{__CLR4_4_14n34n3lp0zmiin.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14n34n3lp0zmiin.R.globalSliceStart(getClass().getName(),6021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n34n3lp0zmiin.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n34n3lp0zmiin.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_GET_POSITIVE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444n9() throws java.lang.Exception{try{__CLR4_4_14n34n3lp0zmiin.R.inc(6021);
        __CLR4_4_14n34n3lp0zmiin.R.inc(6022);List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(
            new ArrayList<Integer>(Arrays.asList(-1, -2))
        );
        __CLR4_4_14n34n3lp0zmiin.R.inc(6023);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }finally{__CLR4_4_14n34n3lp0zmiin.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14n34n3lp0zmiin.R.globalSliceStart(getClass().getName(),6024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4nc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14n34n3lp0zmiin.R.rethrow($CLV_t2$);}finally{__CLR4_4_14n34n3lp0zmiin.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_GET_POSITIVE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4nc() throws java.lang.Exception{try{__CLR4_4_14n34n3lp0zmiin.R.inc(6024);
        __CLR4_4_14n34n3lp0zmiin.R.inc(6025);List<Integer> result = humaneval.correct.GET_POSITIVE.get_positive(
            new ArrayList<Integer>()
        );
        __CLR4_4_14n34n3lp0zmiin.R.inc(6026);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList().toArray()
        );
    }finally{__CLR4_4_14n34n3lp0zmiin.R.flushNeeded();}}
}
