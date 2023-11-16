/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_ENCRYPT {static class __CLR4_4_148y48ylp17t5kj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140587840L,8589935092L,5530,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp248y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5506,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp248y() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5506);
        __CLR4_4_148y48ylp17t5kj.R.inc(5507);String result = humaneval.correct.ENCRYPT.encrypt("hi");
        __CLR4_4_148y48ylp17t5kj.R.inc(5508);org.junit.Assert.assertEquals(
            result, "lm"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl491();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5509,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl491() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5509);
        __CLR4_4_148y48ylp17t5kj.R.inc(5510);String result = humaneval.correct.ENCRYPT.encrypt("asdfghjkl");
        __CLR4_4_148y48ylp17t5kj.R.inc(5511);org.junit.Assert.assertEquals(
            result, "ewhjklnop"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k44494();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5512,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k44494() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5512);
        __CLR4_4_148y48ylp17t5kj.R.inc(5513);String result = humaneval.correct.ENCRYPT.encrypt("gf");
        __CLR4_4_148y48ylp17t5kj.R.inc(5514);org.junit.Assert.assertEquals(
            result, "kj"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn497();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5515,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn497() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5515);
        __CLR4_4_148y48ylp17t5kj.R.inc(5516);String result = humaneval.correct.ENCRYPT.encrypt("et");
        __CLR4_4_148y48ylp17t5kj.R.inc(5517);org.junit.Assert.assertEquals(
            result, "ix"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj649a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5518,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj649a() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5518);
        __CLR4_4_148y48ylp17t5kj.R.inc(5519);String result = humaneval.correct.ENCRYPT.encrypt("faewfawefaewg");
        __CLR4_4_148y48ylp17t5kj.R.inc(5520);org.junit.Assert.assertEquals(
            result, "jeiajeaijeiak"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp49d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5521,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp49d() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5521);
        __CLR4_4_148y48ylp17t5kj.R.inc(5522);String result = humaneval.correct.ENCRYPT.encrypt("hellomyfriend");
        __CLR4_4_148y48ylp17t5kj.R.inc(5523);org.junit.Assert.assertEquals(
            result, "lippsqcjvmirh"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy849g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5524,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy849g() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5524);
        __CLR4_4_148y48ylp17t5kj.R.inc(5525);String result = humaneval.correct.ENCRYPT.encrypt("dxzdlmnilfuhmilufhlihufnmlimnufhlimnufhfucufh");
        __CLR4_4_148y48ylp17t5kj.R.inc(5526);org.junit.Assert.assertEquals(
            result, "hbdhpqrmpjylqmpyjlpmlyjrqpmqryjlpmqryjljygyjl"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_148y48ylp17t5kj.R.globalSliceStart(getClass().getName(),5527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r49j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_148y48ylp17t5kj.R.rethrow($CLV_t2$);}finally{__CLR4_4_148y48ylp17t5kj.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_ENCRYPT.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5527,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r49j() throws java.lang.Exception{try{__CLR4_4_148y48ylp17t5kj.R.inc(5527);
        __CLR4_4_148y48ylp17t5kj.R.inc(5528);String result = humaneval.correct.ENCRYPT.encrypt("a");
        __CLR4_4_148y48ylp17t5kj.R.inc(5529);org.junit.Assert.assertEquals(
            result, "e"
        );
    }finally{__CLR4_4_148y48ylp17t5kj.R.flushNeeded();}}
}
