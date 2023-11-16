/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval;

public class TEST_FILE_NAME_CHECK {static class __CLR4_4_14f74f7lp0zmif3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126840887L,8589935092L,5763,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1n53hp24f7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_0",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5731,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1n53hp24f7() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5731);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5732);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("example.txt");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5733);org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1jw3iwl4fa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_1",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5734,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1jw3iwl4fa() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5734);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5735);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("1example.dll");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5736);org.junit.Assert.assertEquals(
            result, "No"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1gn3k444fd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_2",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5737,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1gn3k444fd() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5737);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5738);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("s1sdf3.asd");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5739);org.junit.Assert.assertEquals(
            result, "No"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1de3lbn4fg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_3",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5740,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1de3lbn4fg() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5740);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5741);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("K.dll");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5742);org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1a53mj64fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_4",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5743,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1a53mj64fj() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5743);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5744);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("MY16FILE3.exe");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5745);org.junit.Assert.assertEquals(
            result, "Yes"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_16w3nqp4fm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_5",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5746,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_16w3nqp4fm() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5746);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5747);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("His12FILE94.exe");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5748);org.junit.Assert.assertEquals(
            result, "No"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_13n3oy84fp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_6",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5749,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_13n3oy84fp() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5749);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5750);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("_Y.txt");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5751);org.junit.Assert.assertEquals(
            result, "No"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_1e3q5r4fs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_7",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5752,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_1e3q5r4fs() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5752);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5753);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check("?aREYA.exe");
        __CLR4_4_14f74f7lp0zmif3.R.inc(5754);org.junit.Assert.assertEquals(
            result, "No"
        );
    }finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {__CLR4_4_14f74f7lp0zmif3.R.globalSliceStart(getClass().getName(),5755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_12uw8mq4fv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_14f74f7lp0zmif3.R.rethrow($CLV_t2$);}finally{__CLR4_4_14f74f7lp0zmif3.R.globalSliceEnd(getClass().getName(),"humaneval.TEST_FILE_NAME_CHECK.test_8",__CLR4_4_1_TEST_NAME_SNIFFER.getTestName(),5755,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_12uw8mq4fv() throws java.lang.Exception{try{__CLR4_4_14f74f7lp0zmif3.R.inc(5755);
        __CLR4_4_14f74f7lp0zmif3.R.inc(5756);String[] inputs = new String[] {
            "/this_is_valid.dll", "this_is_valid.wow", "this_is_valid.txt", "this_is_valid.txtexe", "#this2_i4s_5valid.ten", "@this1_is6_valid.exe",
            "this_is_12valid.6exe4.txt", "all.exe.txt", "I563_No.exe", "Is3youfault.txt", "no_one#knows.dll", "1I563_Yes3.exe",
            "I563_Yes3.txtt", "final..txt", "final132", "_f4indsartal132."
        };
        __CLR4_4_14f74f7lp0zmif3.R.inc(5757);String[] outputs = new String[] {
            "No", "No", "Yes", "No", "No", "No",
            "No", "No", "Yes", "Yes", "Yes", "No",
            "No", "No", "No", "No"
        };
        __CLR4_4_14f74f7lp0zmif3.R.inc(5758);for (int i = 0; (((i < inputs.length)&&(__CLR4_4_14f74f7lp0zmif3.R.iget(5759)!=0|true))||(__CLR4_4_14f74f7lp0zmif3.R.iget(5760)==0&false)); i += 1){{
            __CLR4_4_14f74f7lp0zmif3.R.inc(5761);String result = humaneval.correct.FILE_NAME_CHECK.file_name_check(inputs[i]);
            __CLR4_4_14f74f7lp0zmif3.R.inc(5762);org.junit.Assert.assertEquals(
                result, outputs[i]
            );
        }
    }}finally{__CLR4_4_14f74f7lp0zmif3.R.flushNeeded();}}
}
