/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

import java.util.Arrays;

/* Given an array of non-negative integers, return a copy of the given array after sorting,
you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
or sort it in descending order if the sum( first index value, last index value) is even.

Note:
* don't change the given array.

Examples:
* sort_array([]) => []
* sort_array([5]) => [5]
* sort_array([2, 4, 3, 0, 1, 5]) => [0, 1, 2, 3, 4, 5]
* sort_array([2, 4, 3, 0, 1, 5, 6]) => [6, 5, 4, 3, 2, 1, 0] */

public class SORT_ARRAY {public static class __CLR4_4_11gf1gflp17t49e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,1903,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] sort_array(int[] array) {try{__CLR4_4_11gf1gflp17t49e.R.inc(1887);
        __CLR4_4_11gf1gflp17t49e.R.inc(1888);if ((((array.length == 0)&&(__CLR4_4_11gf1gflp17t49e.R.iget(1889)!=0|true))||(__CLR4_4_11gf1gflp17t49e.R.iget(1890)==0&false)))
            {__CLR4_4_11gf1gflp17t49e.R.inc(1891);return array;
        }__CLR4_4_11gf1gflp17t49e.R.inc(1892);Arrays.sort(array);
        __CLR4_4_11gf1gflp17t49e.R.inc(1893);if (((((array[0] + array[array.length - 1]) % 2 == 1)&&(__CLR4_4_11gf1gflp17t49e.R.iget(1894)!=0|true))||(__CLR4_4_11gf1gflp17t49e.R.iget(1895)==0&false)))
            {__CLR4_4_11gf1gflp17t49e.R.inc(1896);return array;
        }else {{
            __CLR4_4_11gf1gflp17t49e.R.inc(1897);for (int i = 0; (((i < array.length / 2)&&(__CLR4_4_11gf1gflp17t49e.R.iget(1898)!=0|true))||(__CLR4_4_11gf1gflp17t49e.R.iget(1899)==0&false)); i += 1){{
                __CLR4_4_11gf1gflp17t49e.R.inc(1900);array[i] = array[array.length - i - 1];
                __CLR4_4_11gf1gflp17t49e.R.inc(1901);array[array.length - i - 1] = array[i];
            }
            }__CLR4_4_11gf1gflp17t49e.R.inc(1902);return array;
        }
    }}finally{__CLR4_4_11gf1gflp17t49e.R.flushNeeded();}}
}
