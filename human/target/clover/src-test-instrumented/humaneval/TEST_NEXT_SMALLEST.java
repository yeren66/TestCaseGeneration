/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_NEXT_SMALLEST {static class __CLR4_4_15db5dblp17t5yy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,6977,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25db();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6959,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25db() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6959);
        __CLR4_4_15db5dblp17t5yy.R.inc(6960);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {1, 2, 3, 4, 5});
        __CLR4_4_15db5dblp17t5yy.R.inc(6961);org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5de();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6962,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5de() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6962);
        __CLR4_4_15db5dblp17t5yy.R.inc(6963);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {5, 1, 4, 3, 2});
        __CLR4_4_15db5dblp17t5yy.R.inc(6964);org.junit.Assert.assertEquals(
            result, new Integer(2)
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6965,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445dh() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6965);
        __CLR4_4_15db5dblp17t5yy.R.inc(6966);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {});
        __CLR4_4_15db5dblp17t5yy.R.inc(6967);org.junit.Assert.assertEquals(
            result, null
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6968,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5dk() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6968);
        __CLR4_4_15db5dblp17t5yy.R.inc(6969);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {1, 1});
        __CLR4_4_15db5dblp17t5yy.R.inc(6970);org.junit.Assert.assertEquals(
            result, null
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65dn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6971,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65dn() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6971);
        __CLR4_4_15db5dblp17t5yy.R.inc(6972);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {1, 1, 1, 1, 0});
        __CLR4_4_15db5dblp17t5yy.R.inc(6973);org.junit.Assert.assertEquals(
            result, new Integer(1)
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15db5dblp17t5yy.R.globalSliceStart(getClass().getName(),6974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5dq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15db5dblp17t5yy.R.rethrow($CLV_t2$);}finally{__CLR4_4_15db5dblp17t5yy.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_NEXT_SMALLEST.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),6974,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5dq() throws java.lang.Exception{try{__CLR4_4_15db5dblp17t5yy.R.inc(6974);
        __CLR4_4_15db5dblp17t5yy.R.inc(6975);Integer result = humaneval.correct.NEXT_SMALLEST.next_smallest(new int[] {-35, 34, 12, -45});
        __CLR4_4_15db5dblp17t5yy.R.inc(6976);org.junit.Assert.assertEquals(
            result, new Integer(-35)
        );
    }finally{__CLR4_4_15db5dblp17t5yy.R.flushNeeded();}}
}
