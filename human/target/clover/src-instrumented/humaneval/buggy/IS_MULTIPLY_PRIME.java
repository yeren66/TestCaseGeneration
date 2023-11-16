/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

// Write a function that returns true if the given number is the multiplication of 3 prime numbers
// and false otherwise.
// Knowing that (a) is less then 100. 
// Example:
// is_multiply_prime(30) == True
// 30 = 2 * 3 * 5

public class IS_MULTIPLY_PRIME {public static class __CLR4_4_1sasalp0zmh14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1050,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_prime(int n) {try{__CLR4_4_1sasalp0zmh14.R.inc(1018);
        __CLR4_4_1sasalp0zmh14.R.inc(1019);for (int i = 2; (((i < n)&&(__CLR4_4_1sasalp0zmh14.R.iget(1020)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1021)==0&false)); i += 1) {{
            __CLR4_4_1sasalp0zmh14.R.inc(1022);if ((((n % i == 0)&&(__CLR4_4_1sasalp0zmh14.R.iget(1023)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1024)==0&false)))
                {__CLR4_4_1sasalp0zmh14.R.inc(1025);return false;
        }}
        }__CLR4_4_1sasalp0zmh14.R.inc(1026);return true;
    }finally{__CLR4_4_1sasalp0zmh14.R.flushNeeded();}}

    public static boolean is_multiply_prime(int a) {try{__CLR4_4_1sasalp0zmh14.R.inc(1027);
        __CLR4_4_1sasalp0zmh14.R.inc(1028);for (int i = 2; (((i < a)&&(__CLR4_4_1sasalp0zmh14.R.iget(1029)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1030)==0&false)); i += 1){{
            __CLR4_4_1sasalp0zmh14.R.inc(1031);if ((((! is_prime(i))&&(__CLR4_4_1sasalp0zmh14.R.iget(1032)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1033)==0&false))) {__CLR4_4_1sasalp0zmh14.R.inc(1034);continue;
            }__CLR4_4_1sasalp0zmh14.R.inc(1035);for (int j = i; (((j < a)&&(__CLR4_4_1sasalp0zmh14.R.iget(1036)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1037)==0&false)); j += 1) {{
                __CLR4_4_1sasalp0zmh14.R.inc(1038);for (int k = j; (((k < a)&&(__CLR4_4_1sasalp0zmh14.R.iget(1039)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1040)==0&false)); j += 1) {{
                    __CLR4_4_1sasalp0zmh14.R.inc(1041);if ((((! is_prime(k))&&(__CLR4_4_1sasalp0zmh14.R.iget(1042)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1043)==0&false))) {__CLR4_4_1sasalp0zmh14.R.inc(1044);continue;
                    }__CLR4_4_1sasalp0zmh14.R.inc(1045);if ((((i * j * k == a)&&(__CLR4_4_1sasalp0zmh14.R.iget(1046)!=0|true))||(__CLR4_4_1sasalp0zmh14.R.iget(1047)==0&false)))
                        {__CLR4_4_1sasalp0zmh14.R.inc(1048);return true;
                }}
            }}
        }}
        }__CLR4_4_1sasalp0zmh14.R.inc(1049);return false;
    }finally{__CLR4_4_1sasalp0zmh14.R.flushNeeded();}}
}
