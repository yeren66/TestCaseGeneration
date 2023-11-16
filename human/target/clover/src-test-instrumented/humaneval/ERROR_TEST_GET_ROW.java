/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class ERROR_TEST_GET_ROW {static class __CLR4_4_13oq3oqlp0zmi5q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,4796,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23oq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23oq() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4778);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4779);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1))
                )
            ), 1
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4780);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.correct.GET_ROW().new Tuple(0, 0),
                new humaneval.correct.GET_ROW().new Tuple(1, 4),
                new humaneval.correct.GET_ROW().new Tuple(1, 0),
                new humaneval.correct.GET_ROW().new Tuple(2, 5),
                new humaneval.correct.GET_ROW().new Tuple(2, 0)
            ))
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3ot();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3ot() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4781);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4782);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6))
                )
            ), 2
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4783);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.correct.GET_ROW().new Tuple(0, 1),
                new humaneval.correct.GET_ROW().new Tuple(1, 1),
                new humaneval.correct.GET_ROW().new Tuple(2, 1),
                new humaneval.correct.GET_ROW().new Tuple(3, 1),
                new humaneval.correct.GET_ROW().new Tuple(4, 1),
                new humaneval.correct.GET_ROW().new Tuple(5, 1)
            ))
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443ow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443ow() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4784);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4785);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 1, 3, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 1, 4, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 1, 5, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 1, 6)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 1))
                )
            ), 1
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4786);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.correct.GET_ROW().new Tuple(0, 0),
                new humaneval.correct.GET_ROW().new Tuple(1, 0),
                new humaneval.correct.GET_ROW().new Tuple(2, 1),
                new humaneval.correct.GET_ROW().new Tuple(2, 0),
                new humaneval.correct.GET_ROW().new Tuple(3, 2),
                new humaneval.correct.GET_ROW().new Tuple(3, 0),
                new humaneval.correct.GET_ROW().new Tuple(4, 3),
                new humaneval.correct.GET_ROW().new Tuple(4, 0),
                new humaneval.correct.GET_ROW().new Tuple(5, 4),
                new humaneval.correct.GET_ROW().new Tuple(5, 0),
                new humaneval.correct.GET_ROW().new Tuple(6, 5),
                new humaneval.correct.GET_ROW().new Tuple(6, 0)
            ))
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3oz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3oz() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4787);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4788);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(), 1
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4789);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>()
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4790);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63p2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4790,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63p2() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4790);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4791);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(Arrays.asList(1))
                )
            ), 2
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4792);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>()
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceStart(getClass().getName(),4793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3p5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13oq3oqlp0zmi5q.R.rethrow($CLV_t2$);}finally{__CLR4_4_13oq3oqlp0zmi5q.R.globalSliceEnd(getClass().getName(),"humaneval.ERROR_TEST_GET_ROW.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4793,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3p5() throws java.lang.Exception{try{__CLR4_4_13oq3oqlp0zmi5q.R.inc(4793);
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4794);ArrayList<humaneval.correct.GET_ROW.Tuple> result = humaneval.correct.GET_ROW.get_row(
            new ArrayList<ArrayList<Integer>>(
                Arrays.asList(
                    new ArrayList<Integer>(),
                    new ArrayList<Integer>(Arrays.asList(1)),
                    new ArrayList<Integer>(Arrays.asList(1, 2, 3))
                )
            ), 3
        );
        __CLR4_4_13oq3oqlp0zmi5q.R.inc(4795);org.junit.Assert.assertEquals(
            result, new ArrayList<humaneval.correct.GET_ROW.Tuple>(Arrays.asList(
                new humaneval.correct.GET_ROW().new Tuple(2, 2)
            ))
        );
    }finally{__CLR4_4_13oq3oqlp0zmi5q.R.flushNeeded();}}
}
