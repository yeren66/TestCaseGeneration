/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_EXCHANGE {static class __CLR4_4_14bs4bslp0zmie1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5608);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24bs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5608,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24bs() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5608);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5609);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5610);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5611);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5612);org.junit.Assert.assertEquals(result, "YES");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5613,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4bx() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5613);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5614);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5615);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(1, 5, 3, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5616);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5617);org.junit.Assert.assertEquals(result, "NO");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444c2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5618,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444c2() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5618);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5619);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5620);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 1, 4, 3));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5621);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5622);org.junit.Assert.assertEquals(result, "YES");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5623,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4c7() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5623);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5624);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(5, 7, 3));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5625);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 6, 4));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5626);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5627);org.junit.Assert.assertEquals(result, "YES");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64cc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5628,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64cc() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5628);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5629);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(5, 7, 3));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5630);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(2, 6, 3));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5631);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5632);org.junit.Assert.assertEquals(result, "NO");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4ch();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5633,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4ch() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5633);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5634);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(3, 2, 6, 1, 8, 9));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5635);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(3, 5, 5, 1, 1, 1));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5636);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5637);org.junit.Assert.assertEquals(result, "NO");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14bs4bslp0zmie1.R.globalSliceStart(getClass().getName(),5638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14bs4bslp0zmie1.R.rethrow($CLV_t2$);}finally{__CLR4_4_14bs4bslp0zmie1.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_EXCHANGE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5638,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84cm() throws java.lang.Exception{try{__CLR4_4_14bs4bslp0zmie1.R.inc(5638);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5639);ArrayList<Integer> lst1 = new ArrayList<>(Arrays.asList(100, 200));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5640);ArrayList<Integer> lst2 = new ArrayList<>(Arrays.asList(200, 200));
        __CLR4_4_14bs4bslp0zmie1.R.inc(5641);String result = humaneval.correct.EXCHANGE.exchange(lst1, lst2);
        __CLR4_4_14bs4bslp0zmie1.R.inc(5642);org.junit.Assert.assertEquals(result, "YES");
    }finally{__CLR4_4_14bs4bslp0zmie1.R.flushNeeded();}}
}
