/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_UNIQUE {static class __CLR4_4_16ae6aelp17t68t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,8156,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_16ae6aelp17t68t.R.globalSliceStart(getClass().getName(),8150);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp26ae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ae6aelp17t68t.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ae6aelp17t68t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_UNIQUE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8150,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp26ae() throws java.lang.Exception{try{__CLR4_4_16ae6aelp17t68t.R.inc(8150);
        __CLR4_4_16ae6aelp17t68t.R.inc(8151);List<Integer> result = humaneval.correct.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5, 3, 5, 2, 3, 3, 9, 0, 123))
        );
        __CLR4_4_16ae6aelp17t68t.R.inc(8152);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(0, 2, 3, 5, 9, 123).toArray()
        );
    }finally{__CLR4_4_16ae6aelp17t68t.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_16ae6aelp17t68t.R.globalSliceStart(getClass().getName(),8153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl6ah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16ae6aelp17t68t.R.rethrow($CLV_t2$);}finally{__CLR4_4_16ae6aelp17t68t.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_UNIQUE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8153,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl6ah() throws java.lang.Exception{try{__CLR4_4_16ae6aelp17t68t.R.inc(8153);
        __CLR4_4_16ae6aelp17t68t.R.inc(8154);List<Integer> result = humaneval.correct.UNIQUE.unique(
            new ArrayList<Integer>(Arrays.asList(5, 2, 2, 8, 12, 43, 43, 12, 7, 1))
        );
        __CLR4_4_16ae6aelp17t68t.R.inc(8155);org.junit.Assert.assertArrayEquals(
            result.toArray(), Arrays.asList(1, 2, 5, 7, 8, 12, 43).toArray()
        );
    }finally{__CLR4_4_16ae6aelp17t68t.R.flushNeeded();}}
}