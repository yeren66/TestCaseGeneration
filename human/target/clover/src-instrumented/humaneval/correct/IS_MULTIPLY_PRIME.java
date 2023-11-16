/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

// Write a function that returns true if the given number is the multiplication of 3 prime numbers
// and false otherwise.
// Knowing that (a) is less then 100. 
// Example:
// is_multiply_prime(30) == True
// 30 = 2 * 3 * 5

public class IS_MULTIPLY_PRIME {public static class __CLR4_4_12mj2mjlp17t4ol{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,3439,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_prime(int n) {try{__CLR4_4_12mj2mjlp17t4ol.R.inc(3403);
        __CLR4_4_12mj2mjlp17t4ol.R.inc(3404);for (int i = 2; (((i < n)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3405)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3406)==0&false)); i += 1) {{
            __CLR4_4_12mj2mjlp17t4ol.R.inc(3407);if ((((n % i == 0)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3408)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3409)==0&false)))
                {__CLR4_4_12mj2mjlp17t4ol.R.inc(3410);return false;
        }}
        }__CLR4_4_12mj2mjlp17t4ol.R.inc(3411);return true;
    }finally{__CLR4_4_12mj2mjlp17t4ol.R.flushNeeded();}}

    public static boolean is_multiply_prime(int a) {try{__CLR4_4_12mj2mjlp17t4ol.R.inc(3412);
        __CLR4_4_12mj2mjlp17t4ol.R.inc(3413);for (int i = 2; (((i < a)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3414)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3415)==0&false)); i += 1){{
            __CLR4_4_12mj2mjlp17t4ol.R.inc(3416);if ((((! is_prime(i))&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3417)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3418)==0&false))) {__CLR4_4_12mj2mjlp17t4ol.R.inc(3419);continue;
            }__CLR4_4_12mj2mjlp17t4ol.R.inc(3420);for (int j = i; (((j < a)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3421)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3422)==0&false)); j += 1) {{
                __CLR4_4_12mj2mjlp17t4ol.R.inc(3423);if ((((! is_prime(j))&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3424)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3425)==0&false))) {__CLR4_4_12mj2mjlp17t4ol.R.inc(3426);continue;
                }__CLR4_4_12mj2mjlp17t4ol.R.inc(3427);for (int k = j; (((k < a)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3428)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3429)==0&false)); k += 1) {{
                    __CLR4_4_12mj2mjlp17t4ol.R.inc(3430);if ((((! is_prime(k))&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3431)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3432)==0&false))) {__CLR4_4_12mj2mjlp17t4ol.R.inc(3433);continue;
                    }__CLR4_4_12mj2mjlp17t4ol.R.inc(3434);if ((((i * j * k == a)&&(__CLR4_4_12mj2mjlp17t4ol.R.iget(3435)!=0|true))||(__CLR4_4_12mj2mjlp17t4ol.R.iget(3436)==0&false)))
                        {__CLR4_4_12mj2mjlp17t4ol.R.inc(3437);return true;
                }}
            }}
        }}
        }__CLR4_4_12mj2mjlp17t4ol.R.inc(3438);return false;
    }finally{__CLR4_4_12mj2mjlp17t4ol.R.flushNeeded();}}
}
