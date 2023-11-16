/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Arrays;

/* Write a function that takes an array of numbers as input and returns 
the number of elements in the array that are greater than 10 and both 
first and last digits of a number are odd (1, 3, 5, 7, 9).
For example:
specialFilter([15, -73, 14, -15]) => 1 
specialFilter([33, -2, -3, 45, 21, 109]) => 2 */

public class SPECIAL_FILTER {public static class __CLR4_4_13f53f5lp17t4xf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,4446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int special_filter(int[] nums) {try{__CLR4_4_13f53f5lp17t4xf.R.inc(4433);
        __CLR4_4_13f53f5lp17t4xf.R.inc(4434);int count = 0;
        __CLR4_4_13f53f5lp17t4xf.R.inc(4435);ArrayList<Integer> odd_digits = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
        __CLR4_4_13f53f5lp17t4xf.R.inc(4436);for (Integer num : nums) {{
            __CLR4_4_13f53f5lp17t4xf.R.inc(4437);if ((((num > 10)&&(__CLR4_4_13f53f5lp17t4xf.R.iget(4438)!=0|true))||(__CLR4_4_13f53f5lp17t4xf.R.iget(4439)==0&false))) {{
                __CLR4_4_13f53f5lp17t4xf.R.inc(4440);String number_as_string = num + "";
                __CLR4_4_13f53f5lp17t4xf.R.inc(4441);if ((((odd_digits.contains(number_as_string.charAt(0) - '0')
                        && odd_digits.contains(number_as_string.charAt(number_as_string.length() - 1) - '0'))&&(__CLR4_4_13f53f5lp17t4xf.R.iget(4442)!=0|true))||(__CLR4_4_13f53f5lp17t4xf.R.iget(4443)==0&false)))
                    {__CLR4_4_13f53f5lp17t4xf.R.inc(4444);count += 1;
            }}
        }}
        }__CLR4_4_13f53f5lp17t4xf.R.inc(4445);return count;
    }finally{__CLR4_4_13f53f5lp17t4xf.R.flushNeeded();}}
}
