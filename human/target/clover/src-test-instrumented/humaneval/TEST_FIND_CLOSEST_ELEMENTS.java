/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FIND_CLOSEST_ELEMENTS {static class __CLR4_4_14gc4gclp17t5n5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14gc4gclp17t5n5.R.globalSliceStart(getClass().getName(),5772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24gc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14gc4gclp17t5n5.R.rethrow($CLV_t2$);}finally{__CLR4_4_14gc4gclp17t5n5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_CLOSEST_ELEMENTS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5772,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24gc() throws java.lang.Exception{try{__CLR4_4_14gc4gclp17t5n5.R.inc(5772);
        __CLR4_4_14gc4gclp17t5n5.R.inc(5773);double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.9, 4.0, 5.0, 2.2});
        __CLR4_4_14gc4gclp17t5n5.R.inc(5774);org.junit.Assert.assertArrayEquals(
            result, new double[] {3.9, 4.0}, 1e-6
        );
    }finally{__CLR4_4_14gc4gclp17t5n5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14gc4gclp17t5n5.R.globalSliceStart(getClass().getName(),5775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4gf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14gc4gclp17t5n5.R.rethrow($CLV_t2$);}finally{__CLR4_4_14gc4gclp17t5n5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_CLOSEST_ELEMENTS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4gf() throws java.lang.Exception{try{__CLR4_4_14gc4gclp17t5n5.R.inc(5775);
        __CLR4_4_14gc4gclp17t5n5.R.inc(5776);double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 5.9, 4.0, 5.0});
        __CLR4_4_14gc4gclp17t5n5.R.inc(5777);org.junit.Assert.assertArrayEquals(
            result, new double[] {5.0, 5.9}, 1e-6
        );
    }finally{__CLR4_4_14gc4gclp17t5n5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14gc4gclp17t5n5.R.globalSliceStart(getClass().getName(),5778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444gi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14gc4gclp17t5n5.R.rethrow($CLV_t2$);}finally{__CLR4_4_14gc4gclp17t5n5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_CLOSEST_ELEMENTS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5778,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444gi() throws java.lang.Exception{try{__CLR4_4_14gc4gclp17t5n5.R.inc(5778);
        __CLR4_4_14gc4gclp17t5n5.R.inc(5779);double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 2.2});
        __CLR4_4_14gc4gclp17t5n5.R.inc(5780);org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0, 2.2}, 1e-6
        );
    }finally{__CLR4_4_14gc4gclp17t5n5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14gc4gclp17t5n5.R.globalSliceStart(getClass().getName(),5781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4gl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14gc4gclp17t5n5.R.rethrow($CLV_t2$);}finally{__CLR4_4_14gc4gclp17t5n5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_CLOSEST_ELEMENTS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5781,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4gl() throws java.lang.Exception{try{__CLR4_4_14gc4gclp17t5n5.R.inc(5781);
        __CLR4_4_14gc4gclp17t5n5.R.inc(5782);double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.0, 2.0, 3.0, 4.0, 5.0, 2.0});
        __CLR4_4_14gc4gclp17t5n5.R.inc(5783);org.junit.Assert.assertArrayEquals(
            result, new double[] {2.0, 2.0}, 1e-6
        );
    }finally{__CLR4_4_14gc4gclp17t5n5.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14gc4gclp17t5n5.R.globalSliceStart(getClass().getName(),5784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64go();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14gc4gclp17t5n5.R.rethrow($CLV_t2$);}finally{__CLR4_4_14gc4gclp17t5n5.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FIND_CLOSEST_ELEMENTS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5784,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64go() throws java.lang.Exception{try{__CLR4_4_14gc4gclp17t5n5.R.inc(5784);
        __CLR4_4_14gc4gclp17t5n5.R.inc(5785);double[] result = humaneval.correct.FIND_CLOSEST_ELEMENTS.find_closest_elements(new double[] {1.1, 2.2, 3.1, 4.1, 5.1});
        __CLR4_4_14gc4gclp17t5n5.R.inc(5786);org.junit.Assert.assertArrayEquals(
            result, new double[] {2.2, 3.1}, 1e-6
        );
    }finally{__CLR4_4_14gc4gclp17t5n5.R.flushNeeded();}}
}
