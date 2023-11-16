/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_CHANGE_BASE {static class __CLR4_4_13v83v8lp0zmi8g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp23v8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5012,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp23v8() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5012);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5013);String result = humaneval.correct.CHANGE_BASE.change_base(8, 3);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5014);org.junit.Assert.assertEquals(
            result, "22"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl3vb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5015,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl3vb() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5015);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5016);String result = humaneval.correct.CHANGE_BASE.change_base(9, 3);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5017);org.junit.Assert.assertEquals(
            result, "100"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k443ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5018,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k443ve() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5018);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5019);String result = humaneval.correct.CHANGE_BASE.change_base(234, 2);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5020);org.junit.Assert.assertEquals(
            result, "11101010"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn3vh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5021,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn3vh() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5021);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5022);String result = humaneval.correct.CHANGE_BASE.change_base(16, 2);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5023);org.junit.Assert.assertEquals(
            result, "10000"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj63vk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5024,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj63vk() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5024);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5025);String result = humaneval.correct.CHANGE_BASE.change_base(8, 2);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5026);org.junit.Assert.assertEquals(
            result, "1000"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp3vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5027,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp3vn() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5027);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5028);String result = humaneval.correct.CHANGE_BASE.change_base(7, 2);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5029);org.junit.Assert.assertEquals(
            result, "111"
        );
    }finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_13v83v8lp0zmi8g.R.globalSliceStart(getClass().getName(),5030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy83vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_13v83v8lp0zmi8g.R.rethrow($CLV_t2$);}finally{__CLR4_4_13v83v8lp0zmi8g.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_CHANGE_BASE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5030,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy83vq() throws java.lang.Exception{try{__CLR4_4_13v83v8lp0zmi8g.R.inc(5030);
        __CLR4_4_13v83v8lp0zmi8g.R.inc(5031);for (int x = 2; (((x < 8)&&(__CLR4_4_13v83v8lp0zmi8g.R.iget(5032)!=0|true))||(__CLR4_4_13v83v8lp0zmi8g.R.iget(5033)==0&false)); x += 1){{
            __CLR4_4_13v83v8lp0zmi8g.R.inc(5034);String result = humaneval.correct.CHANGE_BASE.change_base(x, x + 1);
            __CLR4_4_13v83v8lp0zmi8g.R.inc(5035);org.junit.Assert.assertEquals(
                result, x + ""
            );
        }
    }}finally{__CLR4_4_13v83v8lp0zmi8g.R.flushNeeded();}}
}
