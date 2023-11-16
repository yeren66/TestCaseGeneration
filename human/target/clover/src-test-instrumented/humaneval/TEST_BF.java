/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

import java.util.ArrayList;
import java.util.Arrays;

public class TEST_BF {static class __CLR4_4_13sm3smlp17t5dz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,4939,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23sm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4918,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23sm() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4918);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4919);ArrayList<String> result = humaneval.correct.BF.bf("Jupiter", "Neptune");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4920);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Saturn", "Uranus"
            ))
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4921,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3sp() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4921);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4922);ArrayList<String> result = humaneval.correct.BF.bf("Earth", "Mercury");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4923);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus"
            ))
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4924,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443ss() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4924);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4925);ArrayList<String> result = humaneval.correct.BF.bf("Mercury", "Uranus");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4926);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Venus", "Earth", "Mars", "Jupiter", "Saturn"
            ))
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3sv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4927,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3sv() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4927);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4928);ArrayList<String> result = humaneval.correct.BF.bf("Neptune", "Venus");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4929);org.junit.Assert.assertEquals(
            result, new ArrayList<String>(Arrays.asList(
                "Earth", "Mars", "Jupiter", "Saturn", "Uranus"
            ))
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63sy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63sy() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4930);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4931);ArrayList<String> result = humaneval.correct.BF.bf("Earth", "Earth");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4932);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3t1() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4933);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4934);ArrayList<String> result = humaneval.correct.BF.bf("Mars", "Earth");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4935);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13sm3smlp17t5dz.R.globalSliceStart(getClass().getName(),4936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13sm3smlp17t5dz.R.rethrow($CLV_t2$);}finally{__CLR4_4_13sm3smlp17t5dz.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_BF.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),4936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83t4() throws java.lang.Exception{try{__CLR4_4_13sm3smlp17t5dz.R.inc(4936);
        __CLR4_4_13sm3smlp17t5dz.R.inc(4937);ArrayList<String> result = humaneval.correct.BF.bf("Jupiter", "Makemake");
        __CLR4_4_13sm3smlp17t5dz.R.inc(4938);org.junit.Assert.assertEquals(
            result, new ArrayList<String>()
        );
    }finally{__CLR4_4_13sm3smlp17t5dz.R.flushNeeded();}}
}
