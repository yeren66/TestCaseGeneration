/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_SPLIT_WORDS {static class __CLR4_4_15zz5zzlp17t66e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,7807,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp25zz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7775,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp25zz() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7775);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7776);String[] result = humaneval.correct.SPLIT_WORDS.split_words("Hello world!");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7777);String[] desired = {"Hello", "world!"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7778);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl603();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7779,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl603() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7779);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7780);String[] result = humaneval.correct.SPLIT_WORDS.split_words("Hello,world!");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7781);String[] desired = {"Hello", "world!"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7782);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44607();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7783,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44607() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7783);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7784);String[] result = humaneval.correct.SPLIT_WORDS.split_words("Hello world,!");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7785);String[] desired = {"Hello", "world,!"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7786);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn60b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7787,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn60b() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7787);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7788);String[] result = humaneval.correct.SPLIT_WORDS.split_words("Hello,Hello,world !");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7789);String[] desired = {"Hello,Hello,world", "!"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7790);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj660f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7791,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj660f() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7791);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7792);String[] result = humaneval.correct.SPLIT_WORDS.split_words("abcdef");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7793);String[] desired = {"3"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7794);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp60j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7795,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp60j() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7795);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7796);String[] result = humaneval.correct.SPLIT_WORDS.split_words("aaabb");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7797);String[] desired = {"2"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7798);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy860n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7799,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy860n() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7799);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7800);String[] result = humaneval.correct.SPLIT_WORDS.split_words("aaaBb");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7801);String[] desired = {"1"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7802);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_15zz5zzlp17t66e.R.globalSliceStart(getClass().getName(),7803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r60r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_15zz5zzlp17t66e.R.rethrow($CLV_t2$);}finally{__CLR4_4_15zz5zzlp17t66e.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_SPLIT_WORDS.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),7803,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r60r() throws java.lang.Exception{try{__CLR4_4_15zz5zzlp17t66e.R.inc(7803);
        __CLR4_4_15zz5zzlp17t66e.R.inc(7804);String[] result = humaneval.correct.SPLIT_WORDS.split_words("");
        __CLR4_4_15zz5zzlp17t66e.R.inc(7805);String[] desired = {"0"};
        __CLR4_4_15zz5zzlp17t66e.R.inc(7806);org.junit.Assert.assertArrayEquals(desired, result);
    }finally{__CLR4_4_15zz5zzlp17t66e.R.flushNeeded();}}
}
