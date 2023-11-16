/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SUM_SQUARES {static class __CLR4_4_165a65alp17t67m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7996,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7966);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp265a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7966,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp265a() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7966);
        __CLR4_4_165a65alp17t67m.R.inc(7967);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {1, 2, 3});
        __CLR4_4_165a65alp17t67m.R.inc(7968);org.junit.Assert.assertEquals(
            result, 6
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl65d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7969,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl65d() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7969);
        __CLR4_4_165a65alp17t67m.R.inc(7970);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {1, 4, 9});
        __CLR4_4_165a65alp17t67m.R.inc(7971);org.junit.Assert.assertEquals(
            result, 14
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7972);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k4465g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7972,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k4465g() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7972);
        __CLR4_4_165a65alp17t67m.R.inc(7973);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {});
        __CLR4_4_165a65alp17t67m.R.inc(7974);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn65j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7975,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn65j() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7975);
        __CLR4_4_165a65alp17t67m.R.inc(7976);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1});
        __CLR4_4_165a65alp17t67m.R.inc(7977);org.junit.Assert.assertEquals(
            result, 9
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7978);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj665m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7978,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj665m() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7978);
        __CLR4_4_165a65alp17t67m.R.inc(7979);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {0});
        __CLR4_4_165a65alp17t67m.R.inc(7980);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp65p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7981,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp65p() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7981);
        __CLR4_4_165a65alp17t67m.R.inc(7982);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {-1, -5, 2, -1, -5});
        __CLR4_4_165a65alp17t67m.R.inc(7983);org.junit.Assert.assertEquals(
            result, -126
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy865s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7984,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy865s() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7984);
        __CLR4_4_165a65alp17t67m.R.inc(7985);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {-56, -99, 1, 0, -2});
        __CLR4_4_165a65alp17t67m.R.inc(7986);org.junit.Assert.assertEquals(
            result, 3030
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r65v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7987,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r65v() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7987);
        __CLR4_4_165a65alp17t67m.R.inc(7988);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {-1, 0, 0, 0, 0, 0, 0, 0, -1});
        __CLR4_4_165a65alp17t67m.R.inc(7989);org.junit.Assert.assertEquals(
            result, 0
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq65y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7990,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq65y() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7990);
        __CLR4_4_165a65alp17t67m.R.inc(7991);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37});
        __CLR4_4_165a65alp17t67m.R.inc(7992);org.junit.Assert.assertEquals(
            result, -14196
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_165a65alp17t67m.R.globalSliceStart(getClass().getName(),7993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7661();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_165a65alp17t67m.R.rethrow($CLV_t2$);}finally{__CLR4_4_165a65alp17t67m.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SUM_SQUARES.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7993,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7661() throws java.lang.Exception{try{__CLR4_4_165a65alp17t67m.R.inc(7993);
        __CLR4_4_165a65alp17t67m.R.inc(7994);int result = humaneval.correct.SUM_SQUARES.sum_squares(new int[] {-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10});
        __CLR4_4_165a65alp17t67m.R.inc(7995);org.junit.Assert.assertEquals(
            result, -1448
        );
    }finally{__CLR4_4_165a65alp17t67m.R.flushNeeded();}}
}
