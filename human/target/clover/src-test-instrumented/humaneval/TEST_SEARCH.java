/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SEARCH {static class __CLR4_4_15pe5pelp0zmirn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,7436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25pe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7394,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25pe() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7394);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7395);int result = humaneval.correct.SEARCH.search(
            new int[] {5, 5, 5, 5, 1}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7396);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5ph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7397,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5ph() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7397);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7398);int result = humaneval.correct.SEARCH.search(
            new int[] {4, 1, 4, 1, 4, 4}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7399);org.junit.Assert.assertEquals(
            result, 4
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5pk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7400,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5pk() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7400);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7401);int result = humaneval.correct.SEARCH.search(
            new int[] {3, 3}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7402);org.junit.Assert.assertEquals(
            result, -1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65pn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7403,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65pn() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7403);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7404);int result = humaneval.correct.SEARCH.search(
            new int[] {8, 8, 8, 8, 8, 8, 8, 8}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7405);org.junit.Assert.assertEquals(
            result, 8
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5pq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7406,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5pq() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7406);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7407);int result = humaneval.correct.SEARCH.search(
            new int[] {2, 3, 3, 2, 2}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7408);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85pt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7409,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85pt() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7409);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7410);int result = humaneval.correct.SEARCH.search(
            new int[] {2, 7, 8, 8, 4, 8, 7, 3, 9, 6, 5, 10, 4, 3, 6, 7, 1, 7, 4, 10, 8, 1}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7411);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5pw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7412,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5pw() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7412);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7413);int result = humaneval.correct.SEARCH.search(
            new int[] {3, 2, 8, 2}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7414);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5pz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7415,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5pz() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7415);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7416);int result = humaneval.correct.SEARCH.search(
            new int[] {6, 7, 1, 8, 8, 10, 5, 8, 5, 3, 10}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7417);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7418,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75q2() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7418);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7419);int result = humaneval.correct.SEARCH.search(
            new int[] {8, 8, 3, 6, 5, 6, 4}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7420);org.junit.Assert.assertEquals(
            result, -1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x5q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7421,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x5q5() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7421);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7422);int result = humaneval.correct.SEARCH.search(
            new int[] {6, 9, 6, 7, 1, 4, 7, 1, 8, 8, 9, 8, 10, 10, 8, 4, 10, 4, 10, 1, 2, 9, 5, 7, 9}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7423);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_18uokfg5q8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_11",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7424,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_18uokfg5q8() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7424);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7425);int result = humaneval.correct.SEARCH.search(
            new int[] {1, 9, 10, 1, 3}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7426);org.junit.Assert.assertEquals(
            result, 1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_15lolmz5qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_12",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7427,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_15lolmz5qb() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7427);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7428);int result = humaneval.correct.SEARCH.search(
            new int[] {6, 9, 7, 5, 8, 7, 5, 3, 7, 5, 10, 10, 3, 6, 10, 2, 8, 6, 5, 4, 9, 5, 3, 10}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7429);org.junit.Assert.assertEquals(
            result, 5
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7430);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12comui5qe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_13",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7430,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12comui5qe() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7430);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7431);int result = humaneval.correct.SEARCH.search(
            new int[] {9, 2, 4, 1, 5, 1, 5, 2, 5, 7, 7, 7, 3, 10, 1, 5, 4, 2, 8, 4, 1, 9, 10, 7, 10, 2, 8, 10, 9, 4}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7432);org.junit.Assert.assertEquals(
            result, 4
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {__CLR4_4_15pe5pelp0zmirn.R.globalSliceStart(getClass().getName(),7433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1wbbxz5qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15pe5pelp0zmirn.R.rethrow($CLV_t2$);}finally{__CLR4_4_15pe5pelp0zmirn.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SEARCH.test_14",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7433,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1wbbxz5qh() throws java.lang.Exception{try{__CLR4_4_15pe5pelp0zmirn.R.inc(7433);
        __CLR4_4_15pe5pelp0zmirn.R.inc(7434);int result = humaneval.correct.SEARCH.search(
            new int[] {10}
        );
        __CLR4_4_15pe5pelp0zmirn.R.inc(7435);org.junit.Assert.assertEquals(
            result, -1
        );
    }finally{__CLR4_4_15pe5pelp0zmirn.R.flushNeeded();}}
}
