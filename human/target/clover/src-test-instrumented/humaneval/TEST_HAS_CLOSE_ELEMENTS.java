/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_HAS_CLOSE_ELEMENTS {static class __CLR4_4_14nr4nrlp0zmij4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6060,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6039);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24nr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6039,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24nr() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6039);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6040);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.3
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6041);org.junit.Assert.assertEquals(result, true);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4nu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6042,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4nu() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6042);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6043);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.9, 4.0, 5.0, 2.2)), 0.05
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6044);org.junit.Assert.assertEquals(result, false);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6045);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444nx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6045,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444nx() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6045);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6046);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.95
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6047);org.junit.Assert.assertEquals(result, true);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4o0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6048,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4o0() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6048);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6049);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 5.9, 4.0, 5.0)), 0.8
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6050);org.junit.Assert.assertEquals(result, false);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64o3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6051,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64o3() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6051);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6052);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 2.0)), 0.1
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6053);org.junit.Assert.assertEquals(result, true);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6054,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4o6() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6054);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6055);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 1.0
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6056);org.junit.Assert.assertEquals(result, true);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14nr4nrlp0zmij4.R.globalSliceStart(getClass().getName(),6057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84o9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14nr4nrlp0zmij4.R.rethrow($CLV_t2$);}finally{__CLR4_4_14nr4nrlp0zmij4.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_HAS_CLOSE_ELEMENTS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6057,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84o9() throws java.lang.Exception{try{__CLR4_4_14nr4nrlp0zmij4.R.inc(6057);
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6058);boolean result = humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(
            new ArrayList<Double>(Arrays.asList(1.1, 2.2, 3.1, 4.1, 5.1)), 0.5
        );
        __CLR4_4_14nr4nrlp0zmij4.R.inc(6059);org.junit.Assert.assertEquals(result, false);
    }finally{__CLR4_4_14nr4nrlp0zmij4.R.flushNeeded();}}
}
