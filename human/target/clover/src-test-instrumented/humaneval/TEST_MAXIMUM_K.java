/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_MAXIMUM_K {static class __CLR4_4_154z54zlp0zmimw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6714,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp254z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6659,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp254z() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6659);
        __CLR4_4_154z54zlp0zmimw.R.inc(6660);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3, -4, 5));
        __CLR4_4_154z54zlp0zmimw.R.inc(6661);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 3);
        __CLR4_4_154z54zlp0zmimw.R.inc(6662);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4, -3, 5));
        __CLR4_4_154z54zlp0zmimw.R.inc(6663);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl554();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6664,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl554() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6664);
        __CLR4_4_154z54zlp0zmimw.R.inc(6665);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, -4, 4));
        __CLR4_4_154z54zlp0zmimw.R.inc(6666);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 2);
        __CLR4_4_154z54zlp0zmimw.R.inc(6667);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(4, 4));
        __CLR4_4_154z54zlp0zmimw.R.inc(6668);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44559();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6669,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44559() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6669);
        __CLR4_4_154z54zlp0zmimw.R.inc(6670);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-3, 2, 1, 2, -1, -2, 1));
        __CLR4_4_154z54zlp0zmimw.R.inc(6671);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 1);
        __CLR4_4_154z54zlp0zmimw.R.inc(6672);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2));
        __CLR4_4_154z54zlp0zmimw.R.inc(6673);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6674);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn55e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6674,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn55e() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6674);
        __CLR4_4_154z54zlp0zmimw.R.inc(6675);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(123, -123, 20, 0 , 1, 2, -3));
        __CLR4_4_154z54zlp0zmimw.R.inc(6676);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 3);
        __CLR4_4_154z54zlp0zmimw.R.inc(6677);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(2, 20, 123));
        __CLR4_4_154z54zlp0zmimw.R.inc(6678);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj655j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6679,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj655j() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6679);
        __CLR4_4_154z54zlp0zmimw.R.inc(6680);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-123, 20, 0 , 1, 2, -3));
        __CLR4_4_154z54zlp0zmimw.R.inc(6681);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 4);
        __CLR4_4_154z54zlp0zmimw.R.inc(6682);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(0, 1, 2, 20));
        __CLR4_4_154z54zlp0zmimw.R.inc(6683);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp55o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6684,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp55o() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6684);
        __CLR4_4_154z54zlp0zmimw.R.inc(6685);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(5, 15, 0, 3, -13, -8, 0));
        __CLR4_4_154z54zlp0zmimw.R.inc(6686);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 7);
        __CLR4_4_154z54zlp0zmimw.R.inc(6687);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-13, -8, 0, 0, 3, 5, 15));
        __CLR4_4_154z54zlp0zmimw.R.inc(6688);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy855t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6689,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy855t() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6689);
        __CLR4_4_154z54zlp0zmimw.R.inc(6690);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-1, 0, 2, 5, 3, -10));
        __CLR4_4_154z54zlp0zmimw.R.inc(6691);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 2);
        __CLR4_4_154z54zlp0zmimw.R.inc(6692);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(3, 5));
        __CLR4_4_154z54zlp0zmimw.R.inc(6693);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r55y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6694,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r55y() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6694);
        __CLR4_4_154z54zlp0zmimw.R.inc(6695);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 0, 5, -7));
        __CLR4_4_154z54zlp0zmimw.R.inc(6696);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 1);
        __CLR4_4_154z54zlp0zmimw.R.inc(6697);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(5));
        __CLR4_4_154z54zlp0zmimw.R.inc(6698);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq563();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6699,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq563() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6699);
        __CLR4_4_154z54zlp0zmimw.R.inc(6700);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(4, -4));
        __CLR4_4_154z54zlp0zmimw.R.inc(6701);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 2);
        __CLR4_4_154z54zlp0zmimw.R.inc(6702);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-4, 4));
        __CLR4_4_154z54zlp0zmimw.R.inc(6703);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7568();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6704,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7568() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6704);
        __CLR4_4_154z54zlp0zmimw.R.inc(6705);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(-10, 10));
        __CLR4_4_154z54zlp0zmimw.R.inc(6706);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 2);
        __CLR4_4_154z54zlp0zmimw.R.inc(6707);ArrayList<Integer> desired = new ArrayList<>(Arrays.asList(-10, 10));
        __CLR4_4_154z54zlp0zmimw.R.inc(6708);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_154z54zlp0zmimw.R.globalSliceStart(getClass().getName(),6709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x56d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_154z54zlp0zmimw.R.rethrow($CLV_t2$);}finally{__CLR4_4_154z54zlp0zmimw.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MAXIMUM_K.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6709,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x56d() throws java.lang.Exception{try{__CLR4_4_154z54zlp0zmimw.R.inc(6709);
        __CLR4_4_154z54zlp0zmimw.R.inc(6710);ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, -23, 243, -400, 0));
        __CLR4_4_154z54zlp0zmimw.R.inc(6711);ArrayList<Integer> result = humaneval.correct.MAXIMUM_K.maximum_k(input, 0);
        __CLR4_4_154z54zlp0zmimw.R.inc(6712);ArrayList<Integer> desired = new ArrayList<>();
        __CLR4_4_154z54zlp0zmimw.R.inc(6713);org.junit.Assert.assertEquals(desired, result);
    }finally{__CLR4_4_154z54zlp0zmimw.R.flushNeeded();}}
}
