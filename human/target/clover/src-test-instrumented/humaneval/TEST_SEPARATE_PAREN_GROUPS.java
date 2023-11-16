/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_SEPARATE_PAREN_GROUPS {static class __CLR4_4_15rc5rclp0zmis4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15rc5rclp0zmis4.R.globalSliceStart(getClass().getName(),7464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15rc5rclp0zmis4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15rc5rclp0zmis4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEPARATE_PAREN_GROUPS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7464,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25rc() throws java.lang.Exception{try{__CLR4_4_15rc5rclp0zmis4.R.inc(7464);
        __CLR4_4_15rc5rclp0zmis4.R.inc(7465);List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "(()()) ((())) () ((())()())"
        );
        __CLR4_4_15rc5rclp0zmis4.R.inc(7466);org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("(()())", "((()))", "()", "((())()())")).toArray()
        );
    }finally{__CLR4_4_15rc5rclp0zmis4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15rc5rclp0zmis4.R.globalSliceStart(getClass().getName(),7467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5rf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15rc5rclp0zmis4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15rc5rclp0zmis4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEPARATE_PAREN_GROUPS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7467,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5rf() throws java.lang.Exception{try{__CLR4_4_15rc5rclp0zmis4.R.inc(7467);
        __CLR4_4_15rc5rclp0zmis4.R.inc(7468);List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "() (()) ((())) (((())))"
        );
        __CLR4_4_15rc5rclp0zmis4.R.inc(7469);org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("()", "(())", "((()))", "(((())))")).toArray()
        );
    }finally{__CLR4_4_15rc5rclp0zmis4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15rc5rclp0zmis4.R.globalSliceStart(getClass().getName(),7470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445ri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15rc5rclp0zmis4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15rc5rclp0zmis4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEPARATE_PAREN_GROUPS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7470,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445ri() throws java.lang.Exception{try{__CLR4_4_15rc5rclp0zmis4.R.inc(7470);
        __CLR4_4_15rc5rclp0zmis4.R.inc(7471);List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "(()(())((())))"
        );
        __CLR4_4_15rc5rclp0zmis4.R.inc(7472);org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("(()(())((())))")).toArray()
        );
    }finally{__CLR4_4_15rc5rclp0zmis4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15rc5rclp0zmis4.R.globalSliceStart(getClass().getName(),7473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5rl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15rc5rclp0zmis4.R.rethrow($CLV_t2$);}finally{__CLR4_4_15rc5rclp0zmis4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEPARATE_PAREN_GROUPS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7473,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5rl() throws java.lang.Exception{try{__CLR4_4_15rc5rclp0zmis4.R.inc(7473);
        __CLR4_4_15rc5rclp0zmis4.R.inc(7474);List<String> result = humaneval.correct.SEPARATE_PAREN_GROUPS.separate_paren_groups(
            "( ) (( )) (( )( ))"
        );
        __CLR4_4_15rc5rclp0zmis4.R.inc(7475);org.junit.Assert.assertArrayEquals(
            result.toArray(), 
            new ArrayList<String>(Arrays.asList("()", "(())", "(()())")).toArray()
        );
    }finally{__CLR4_4_15rc5rclp0zmis4.R.flushNeeded();}}
}
