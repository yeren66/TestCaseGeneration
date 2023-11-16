/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_RIGHT_ANGLE_TRIANGLE {static class __CLR4_4_15m85m8lp0zmiqs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7313,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25m8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7280,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25m8() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7280);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7281);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 4, 5);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7282);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7283,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5mb() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7283);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7284);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 2, 3);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7285);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7286);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7286,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445me() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7286);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7287);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(10, 6, 8);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7288);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7289,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5mh() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7289);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7290);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(2, 2, 2);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7291);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65mk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7292,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65mk() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7292);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7293);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(7, 24, 25);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7294);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7295,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5mn() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7295);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7296);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(5, 12, 13);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7297);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85mq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7298,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85mq() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7298);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7299);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(15, 8, 17);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7300);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5mt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7301,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5mt() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7301);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7302);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(48, 55, 73);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7303);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5mw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7304,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5mw() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7304);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7305);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(10, 5, 7);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7306);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75mz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7307,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75mz() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7307);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7308);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 1, 1);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7309);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_15m85m8lp0zmiqs.R.globalSliceStart(getClass().getName(),7310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x5n2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15m85m8lp0zmiqs.R.rethrow($CLV_t2$);}finally{__CLR4_4_15m85m8lp0zmiqs.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_RIGHT_ANGLE_TRIANGLE.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7310,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x5n2() throws java.lang.Exception{try{__CLR4_4_15m85m8lp0zmiqs.R.inc(7310);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7311);boolean result = humaneval.correct.RIGHT_ANGLE_TRIANGLE.right_angle_triangle(2, 2, 10);
        __CLR4_4_15m85m8lp0zmiqs.R.inc(7312);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_15m85m8lp0zmiqs.R.flushNeeded();}}
}
