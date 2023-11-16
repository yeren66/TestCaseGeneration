/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_MIN_PATH {static class __CLR4_4_157z57zlp0zminf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,6822,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp257z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6767,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp257z() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6767);
        __CLR4_4_157z57zlp0zminf.R.inc(6768);int[][] input = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        __CLR4_4_157z57zlp0zminf.R.inc(6769);int[] result = humaneval.correct.MIN_PATH.min_path(input, 3);
        __CLR4_4_157z57zlp0zminf.R.inc(6770);int[] desired = {1, 2, 1};
        __CLR4_4_157z57zlp0zminf.R.inc(6771);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl584();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl584() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6772);
        __CLR4_4_157z57zlp0zminf.R.inc(6773);int[][] input = {{5, 9, 3}, {4, 1, 6}, {7, 8, 2}};
        __CLR4_4_157z57zlp0zminf.R.inc(6774);int[] result = humaneval.correct.MIN_PATH.min_path(input, 1);
        __CLR4_4_157z57zlp0zminf.R.inc(6775);int[] desired = {1};
        __CLR4_4_157z57zlp0zminf.R.inc(6776);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44589();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6777,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44589() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6777);
        __CLR4_4_157z57zlp0zminf.R.inc(6778);int[][] input = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        __CLR4_4_157z57zlp0zminf.R.inc(6779);int[] result = humaneval.correct.MIN_PATH.min_path(input, 4);
        __CLR4_4_157z57zlp0zminf.R.inc(6780);int[] desired = {1, 2, 1, 2};
        __CLR4_4_157z57zlp0zminf.R.inc(6781);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn58e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6782,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn58e() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6782);
        __CLR4_4_157z57zlp0zminf.R.inc(6783);int[][] input = {{6, 4, 13, 10}, {5, 7, 12, 1}, {3, 16, 11, 15}, {8, 14, 9, 2}};
        __CLR4_4_157z57zlp0zminf.R.inc(6784);int[] result = humaneval.correct.MIN_PATH.min_path(input, 7);
        __CLR4_4_157z57zlp0zminf.R.inc(6785);int[] desired = {1, 10, 1, 10, 1, 10, 1};
        __CLR4_4_157z57zlp0zminf.R.inc(6786);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj658j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj658j() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6787);
        __CLR4_4_157z57zlp0zminf.R.inc(6788);int[][] input = {{8, 14, 9, 2}, {6, 4, 13, 15}, {5, 7, 1, 12}, {3, 10, 11, 16}};
        __CLR4_4_157z57zlp0zminf.R.inc(6789);int[] result = humaneval.correct.MIN_PATH.min_path(input, 5);
        __CLR4_4_157z57zlp0zminf.R.inc(6790);int[] desired = {1, 7, 1, 7, 1};
        __CLR4_4_157z57zlp0zminf.R.inc(6791);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp58o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6792,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp58o() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6792);
        __CLR4_4_157z57zlp0zminf.R.inc(6793);int[][] input = {{11, 8, 7, 2}, {5, 16, 14, 4}, {9, 3, 15, 6}, {12, 13, 10, 1}};
        __CLR4_4_157z57zlp0zminf.R.inc(6794);int[] result = humaneval.correct.MIN_PATH.min_path(input, 9);
        __CLR4_4_157z57zlp0zminf.R.inc(6795);int[] desired = {1, 6, 1, 6, 1, 6, 1, 6, 1};
        __CLR4_4_157z57zlp0zminf.R.inc(6796);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy858t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6797,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy858t() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6797);
        __CLR4_4_157z57zlp0zminf.R.inc(6798);int[][] input = {{12, 13, 10, 1}, {9, 3, 15, 6}, {5, 16, 14, 4}, {11, 8, 7, 2}};
        __CLR4_4_157z57zlp0zminf.R.inc(6799);int[] result = humaneval.correct.MIN_PATH.min_path(input, 12);
        __CLR4_4_157z57zlp0zminf.R.inc(6800);int[] desired = {1, 6, 1, 6, 1, 6, 1, 6, 1, 6, 1, 6};
        __CLR4_4_157z57zlp0zminf.R.inc(6801);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r58y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6802,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r58y() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6802);
        __CLR4_4_157z57zlp0zminf.R.inc(6803);int[][] input = {{2, 7, 4}, {3, 1, 5}, {6, 8, 9}};
        __CLR4_4_157z57zlp0zminf.R.inc(6804);int[] result = humaneval.correct.MIN_PATH.min_path(input, 8);
        __CLR4_4_157z57zlp0zminf.R.inc(6805);int[] desired = {1, 3, 1, 3, 1, 3, 1, 3};
        __CLR4_4_157z57zlp0zminf.R.inc(6806);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq593();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6807,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq593() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6807);
        __CLR4_4_157z57zlp0zminf.R.inc(6808);int[][] input = {{6, 1, 5}, {3, 8, 9}, {2, 7, 4}};
        __CLR4_4_157z57zlp0zminf.R.inc(6809);int[] result = humaneval.correct.MIN_PATH.min_path(input, 8);
        __CLR4_4_157z57zlp0zminf.R.inc(6810);int[] desired = {1, 5, 1, 5, 1, 5, 1, 5};
        __CLR4_4_157z57zlp0zminf.R.inc(6811);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f7598();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6812,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f7598() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6812);
        __CLR4_4_157z57zlp0zminf.R.inc(6813);int[][] input = {{1, 2}, {3, 4}};
        __CLR4_4_157z57zlp0zminf.R.inc(6814);int[] result = humaneval.correct.MIN_PATH.min_path(input, 10);
        __CLR4_4_157z57zlp0zminf.R.inc(6815);int[] desired = {1, 2, 1, 2, 1, 2, 1, 2, 1, 2};
        __CLR4_4_157z57zlp0zminf.R.inc(6816);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {__CLR4_4_157z57zlp0zminf.R.globalSliceStart(getClass().getName(),6817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1c3oj7x59d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_157z57zlp0zminf.R.rethrow($CLV_t2$);}finally{__CLR4_4_157z57zlp0zminf.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_MIN_PATH.test_10",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6817,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1c3oj7x59d() throws java.lang.Exception{try{__CLR4_4_157z57zlp0zminf.R.inc(6817);
        __CLR4_4_157z57zlp0zminf.R.inc(6818);int[][] input = {{1, 3}, {3, 2}};
        __CLR4_4_157z57zlp0zminf.R.inc(6819);int[] result = humaneval.correct.MIN_PATH.min_path(input, 10);
        __CLR4_4_157z57zlp0zminf.R.inc(6820);int[] desired = {1, 3, 1, 3, 1, 3, 1, 3, 1, 3};
        __CLR4_4_157z57zlp0zminf.R.inc(6821);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_157z57zlp0zminf.R.flushNeeded();}}
}
