/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_PRIME_FIB {static class __CLR4_4_15hb5hblp17t60j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7133,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7103,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25hb() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7103);
        __CLR4_4_15hb5hblp17t60j.R.inc(7104);int result = humaneval.correct.PRIME_FIB.prime_fib(1);
        __CLR4_4_15hb5hblp17t60j.R.inc(7105);org.junit.Assert.assertEquals(
            result, 2
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl5he();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7106,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl5he() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7106);
        __CLR4_4_15hb5hblp17t60j.R.inc(7107);int result = humaneval.correct.PRIME_FIB.prime_fib(2);
        __CLR4_4_15hb5hblp17t60j.R.inc(7108);org.junit.Assert.assertEquals(
            result, 3
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k445hh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7109,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k445hh() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7109);
        __CLR4_4_15hb5hblp17t60j.R.inc(7110);int result = humaneval.correct.PRIME_FIB.prime_fib(3);
        __CLR4_4_15hb5hblp17t60j.R.inc(7111);org.junit.Assert.assertEquals(
            result, 5
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn5hk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7112,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn5hk() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7112);
        __CLR4_4_15hb5hblp17t60j.R.inc(7113);int result = humaneval.correct.PRIME_FIB.prime_fib(4);
        __CLR4_4_15hb5hblp17t60j.R.inc(7114);org.junit.Assert.assertEquals(
            result, 13
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj65hn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7115,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj65hn() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7115);
        __CLR4_4_15hb5hblp17t60j.R.inc(7116);int result = humaneval.correct.PRIME_FIB.prime_fib(5);
        __CLR4_4_15hb5hblp17t60j.R.inc(7117);org.junit.Assert.assertEquals(
            result, 89
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp5hq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7118,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp5hq() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7118);
        __CLR4_4_15hb5hblp17t60j.R.inc(7119);int result = humaneval.correct.PRIME_FIB.prime_fib(6);
        __CLR4_4_15hb5hblp17t60j.R.inc(7120);org.junit.Assert.assertEquals(
            result, 233
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy85ht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7121,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy85ht() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7121);
        __CLR4_4_15hb5hblp17t60j.R.inc(7122);int result = humaneval.correct.PRIME_FIB.prime_fib(7);
        __CLR4_4_15hb5hblp17t60j.R.inc(7123);org.junit.Assert.assertEquals(
            result, 1597
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r5hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7124,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r5hw() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7124);
        __CLR4_4_15hb5hblp17t60j.R.inc(7125);int result = humaneval.correct.PRIME_FIB.prime_fib(8);
        __CLR4_4_15hb5hblp17t60j.R.inc(7126);org.junit.Assert.assertEquals(
            result, 28657
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq5hz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7127,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq5hz() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7127);
        __CLR4_4_15hb5hblp17t60j.R.inc(7128);int result = humaneval.correct.PRIME_FIB.prime_fib(9);
        __CLR4_4_15hb5hblp17t60j.R.inc(7129);org.junit.Assert.assertEquals(
            result, 514229
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {__CLR4_4_15hb5hblp17t60j.R.globalSliceStart(getClass().getName(),7130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_163w7f75i2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15hb5hblp17t60j.R.rethrow($CLV_t2$);}finally{__CLR4_4_15hb5hblp17t60j.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_PRIME_FIB.test_9",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7130,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_163w7f75i2() throws java.lang.Exception{try{__CLR4_4_15hb5hblp17t60j.R.inc(7130);
        __CLR4_4_15hb5hblp17t60j.R.inc(7131);int result = humaneval.correct.PRIME_FIB.prime_fib(10);
        __CLR4_4_15hb5hblp17t60j.R.inc(7132);org.junit.Assert.assertEquals(
            result, 433494437
        );
    }finally{__CLR4_4_15hb5hblp17t60j.R.flushNeeded();}}
}
