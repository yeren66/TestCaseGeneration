/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SUM_SQUARED_NUMS {static class __CLR4_4_164a64alp17t67f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7930);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp264a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7930,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp264a() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7930);
        __CLR4_4_164a64alp17t67f.R.inc(7931);double[] input = {1,2,3};
        __CLR4_4_164a64alp17t67f.R.inc(7932);org.junit.Assert.assertEquals(14, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl64d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7933,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl64d() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7933);
        __CLR4_4_164a64alp17t67f.R.inc(7934);double[] input = {1.0, 2, 3};
        __CLR4_4_164a64alp17t67f.R.inc(7935);org.junit.Assert.assertEquals(14, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4464g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7936,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4464g() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7936);
        __CLR4_4_164a64alp17t67f.R.inc(7937);double[] input = {1, 3, 5, 7};
        __CLR4_4_164a64alp17t67f.R.inc(7938);org.junit.Assert.assertEquals(84, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn64j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7939,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn64j() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7939);
        __CLR4_4_164a64alp17t67f.R.inc(7940);double[] input = {1.4, 4.2, 0};
        __CLR4_4_164a64alp17t67f.R.inc(7941);org.junit.Assert.assertEquals(29, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj664m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7942,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj664m() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7942);
        __CLR4_4_164a64alp17t67f.R.inc(7943);double[] input = {-2.4,1,1};
        __CLR4_4_164a64alp17t67f.R.inc(7944);org.junit.Assert.assertEquals(6, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp64p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7945,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp64p() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7945);
        __CLR4_4_164a64alp17t67f.R.inc(7946);double[] input = {100,1,15,2};
        __CLR4_4_164a64alp17t67f.R.inc(7947);org.junit.Assert.assertEquals(10230, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7948);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy864s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7948,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy864s() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7948);
        __CLR4_4_164a64alp17t67f.R.inc(7949);double[] input = {10000,10000};
        __CLR4_4_164a64alp17t67f.R.inc(7950);org.junit.Assert.assertEquals(200000000, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r64v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7951,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r64v() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7951);
        __CLR4_4_164a64alp17t67f.R.inc(7952);double[] input = {-1.4,4.6,6.3};
        __CLR4_4_164a64alp17t67f.R.inc(7953);org.junit.Assert.assertEquals(75, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq64y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7954,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq64y() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7954);
        __CLR4_4_164a64alp17t67f.R.inc(7955);double[] input = {-1.4,17.9,18.9,19.9};
        __CLR4_4_164a64alp17t67f.R.inc(7956);org.junit.Assert.assertEquals(1086, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7651();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7957,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7651() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7957);
        __CLR4_4_164a64alp17t67f.R.inc(7958);double[] input = {0};
        __CLR4_4_164a64alp17t67f.R.inc(7959);org.junit.Assert.assertEquals(0, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x654();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7960,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x654() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7960);
        __CLR4_4_164a64alp17t67f.R.inc(7961);double[] input = {-1};
        __CLR4_4_164a64alp17t67f.R.inc(7962);org.junit.Assert.assertEquals(1, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_164a64alp17t67f.R.globalSliceStart(getClass().getName(),7963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg657();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_164a64alp17t67f.R.rethrow($CLV_t2$);}finally{__CLR4_4_164a64alp17t67f.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARED_NUMS.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7963,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg657() throws java.lang.Exception{try{__CLR4_4_164a64alp17t67f.R.inc(7963);
        __CLR4_4_164a64alp17t67f.R.inc(7964);double[] input = {-1,1,0};
        __CLR4_4_164a64alp17t67f.R.inc(7965);org.junit.Assert.assertEquals(2, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(input));
    }finally{__CLR4_4_164a64alp17t67f.R.flushNeeded();}}
}