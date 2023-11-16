/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/* You are given a positive integer n. You have to create an integer array a of length n.
    For each i (1 \u2264 i \u2264 n), the value of a[i] = i * i - i + 1.
    Return the number of triples (a[i], a[j], a[k]) of a where i < j < k, 
and a[i] + a[j] + a[k] is a multiple of 3.

Example :
    Input: n = 5
    Output: 1
    Explanation: 
    a = [1, 3, 7, 13, 21]
    The only valid triple is (1, 7, 13). */

public class GET_MAX_TRIPLES {public static class __CLR4_4_12g12g1lp17t4lj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,3190,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int get_max_triples(int n) {try{__CLR4_4_12g12g1lp17t4lj.R.inc(3169);
        __CLR4_4_12g12g1lp17t4lj.R.inc(3170);int[] A = new int[n];
        __CLR4_4_12g12g1lp17t4lj.R.inc(3171);for (int i = 1; (((i <= n)&&(__CLR4_4_12g12g1lp17t4lj.R.iget(3172)!=0|true))||(__CLR4_4_12g12g1lp17t4lj.R.iget(3173)==0&false)); i += 1)
            {__CLR4_4_12g12g1lp17t4lj.R.inc(3174);A[i - 1] = i * i - i + 1;
        
        }__CLR4_4_12g12g1lp17t4lj.R.inc(3175);int result = 0;
        __CLR4_4_12g12g1lp17t4lj.R.inc(3176);for (int i = 0; (((i < n-2)&&(__CLR4_4_12g12g1lp17t4lj.R.iget(3177)!=0|true))||(__CLR4_4_12g12g1lp17t4lj.R.iget(3178)==0&false)); i += 1) {{
            __CLR4_4_12g12g1lp17t4lj.R.inc(3179);for (int j = i + 1; (((j < n-1)&&(__CLR4_4_12g12g1lp17t4lj.R.iget(3180)!=0|true))||(__CLR4_4_12g12g1lp17t4lj.R.iget(3181)==0&false)); j += 1) {{
                __CLR4_4_12g12g1lp17t4lj.R.inc(3182);for (int k = j + 1; (((k < n)&&(__CLR4_4_12g12g1lp17t4lj.R.iget(3183)!=0|true))||(__CLR4_4_12g12g1lp17t4lj.R.iget(3184)==0&false)); k += 1) {{
                    __CLR4_4_12g12g1lp17t4lj.R.inc(3185);if (((((A[i] + A[j] + A[k]) % 3 == 0)&&(__CLR4_4_12g12g1lp17t4lj.R.iget(3186)!=0|true))||(__CLR4_4_12g12g1lp17t4lj.R.iget(3187)==0&false))) {__CLR4_4_12g12g1lp17t4lj.R.inc(3188);result += 1;
                }}
            }}
        }}
        }__CLR4_4_12g12g1lp17t4lj.R.inc(3189);return result;
    }finally{__CLR4_4_12g12g1lp17t4lj.R.flushNeeded();}}
}
