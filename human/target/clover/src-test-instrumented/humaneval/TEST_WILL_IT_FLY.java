/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_WILL_IT_FLY {static class __CLR4_4_16cl6cllp0zmiyp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,8247,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8229);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp26cl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8229,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp26cl() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8229);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8230);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 9);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8231);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl6co();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8232,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl6co() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8232);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8233);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {1, 2}, 5);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8234);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k446cr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8235,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k446cr() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8235);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8236);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {3}, 5);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8237);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8238);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn6cu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8238,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn6cu() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8238);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8239);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 1);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8240);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj66cx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8241,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj66cx() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8241);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8242);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {1, 2, 3}, 6);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8243);org.junit.Assert.assertEquals(
            result, false
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_16cl6cllp0zmiyp.R.globalSliceStart(getClass().getName(),8244);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp6d0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_16cl6cllp0zmiyp.R.rethrow($CLV_t2$);}finally{__CLR4_4_16cl6cllp0zmiyp.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_WILL_IT_FLY.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),8244,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp6d0() throws java.lang.Exception{try{__CLR4_4_16cl6cllp0zmiyp.R.inc(8244);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8245);boolean result = humaneval.correct.WILL_IT_FLY.will_it_fly(new int[] {5}, 5);
        __CLR4_4_16cl6cllp0zmiyp.R.inc(8246);org.junit.Assert.assertEquals(
            result, true
        );
    }finally{__CLR4_4_16cl6cllp0zmiyp.R.flushNeeded();}}
}
