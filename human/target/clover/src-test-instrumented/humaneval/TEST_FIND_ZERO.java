/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TEST_FIND_ZERO {static class __CLR4_4_14i34i3lp0zmigp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24i3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5835,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24i3() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5835);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5836);List<Double> xs = new ArrayList<Double>(Arrays.asList(1., 2., 3., 4.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5837);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5838);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4i7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5839,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4i7() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5839);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5840);List<Double> xs = new ArrayList<Double>(Arrays.asList(1., -2., 3., -4.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5841);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5842);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444ib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5843,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444ib() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5843);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5844);List<Double> xs = new ArrayList<Double>(Arrays.asList(-5., 6.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5845);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5846);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4if();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5847,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4if() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5847);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5848);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 5., 8., 6., 7., 7.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5849);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5850);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64ij();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5851,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64ij() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5851);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5852);List<Double> xs = new ArrayList<Double>(Arrays.asList(-1., 4., -2., 3., -3., 2., -4., 1.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5853);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5854);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4in();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5855,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4in() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5855);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5856);List<Double> xs = new ArrayList<Double>(Arrays.asList(2., 2., 2., 2., 3., 3.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5857);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5858);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84ir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5859,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84ir() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5859);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5860);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 0., 0., 1.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5861);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5862);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14i34i3lp0zmigp.R.globalSliceStart(getClass().getName(),5863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4iv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14i34i3lp0zmigp.R.rethrow($CLV_t2$);}finally{__CLR4_4_14i34i3lp0zmigp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_ZERO.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5863,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4iv() throws java.lang.Exception{try{__CLR4_4_14i34i3lp0zmigp.R.inc(5863);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5864);List<Double> xs = new ArrayList<Double>(Arrays.asList(9., 3.));
        __CLR4_4_14i34i3lp0zmigp.R.inc(5865);double result = humaneval.correct.FIND_ZERO.find_zero(xs);
        __CLR4_4_14i34i3lp0zmigp.R.inc(5866);org.junit.Assert.assertTrue(
            Math.abs(humaneval.correct.FIND_ZERO.poly(xs, result)) < 1.e-4
        );
    }finally{__CLR4_4_14i34i3lp0zmigp.R.flushNeeded();}}
}
