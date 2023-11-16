/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_FIND_ZERO {static class __CLR4_4_14hl4hllp17t5np{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24hl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24hl() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5817);
        __CLR4_4_14hl4hllp17t5np.R.inc(5818);List<Double> xs = new ArrayList<Double>(Arrays.asList(1., 2., 3., 4.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5819);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5820);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4hp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5821,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4hp() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5821);
        __CLR4_4_14hl4hllp17t5np.R.inc(5822);List<Double> xs = new ArrayList<Double>(Arrays.asList(1., -2., 3., -4.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5823);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5824);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5825,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444ht() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5825);
        __CLR4_4_14hl4hllp17t5np.R.inc(5826);List<Double> xs = new ArrayList<Double>(Arrays.asList(-5., 6.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5827);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5828);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4hx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5829,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4hx() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5829);
        __CLR4_4_14hl4hllp17t5np.R.inc(5830);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 5., 8., 6., 7., 7.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5831);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5832);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64i1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5833,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64i1() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5833);
        __CLR4_4_14hl4hllp17t5np.R.inc(5834);List<Double> xs = new ArrayList<Double>(Arrays.asList(-1., 4., -2., 3., -3., 2., -4., 1.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5835);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5836);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4i5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5837,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4i5() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5837);
        __CLR4_4_14hl4hllp17t5np.R.inc(5838);List<Double> xs = new ArrayList<Double>(Arrays.asList(2., 2., 2., 2., 3., 3.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5839);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5840);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84i9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5841,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84i9() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5841);
        __CLR4_4_14hl4hllp17t5np.R.inc(5842);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 0., 0., 1.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5843);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5844);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14hl4hllp17t5np.R.globalSliceStart(getClass().getName(),5845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4id();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14hl4hllp17t5np.R.rethrow($CLV_t2$);}finally{__CLR4_4_14hl4hllp17t5np.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5845,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4id() throws java.lang.Exception{try{__CLR4_4_14hl4hllp17t5np.R.inc(5845);
        __CLR4_4_14hl4hllp17t5np.R.inc(5846);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 3.));
        __CLR4_4_14hl4hllp17t5np.R.inc(5847);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14hl4hllp17t5np.R.inc(5848);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14hl4hllp17t5np.R.flushNeeded();}}
}
