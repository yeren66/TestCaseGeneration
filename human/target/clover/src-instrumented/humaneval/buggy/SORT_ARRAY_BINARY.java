/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * In this Kata, you have to sort an array of non-negative integers according to
    number of ones in their binary representation in ascending order.
    For similar number of ones, sort based on decimal value.

    It must be implemented like this:
    >>> sort_array([1, 5, 2, 3, 4]) == [1, 2, 3, 4, 5]
    >>> sort_array([-2, -3, -4, -5, -6]) == [-6, -5, -4, -3, -2]
    >>> sort_array([1, 0, 2, 3, 4]) [0, 1, 2, 3, 4]
 */

public class SORT_ARRAY_BINARY {public static class __CLR4_4_11gv1gvlp17t49l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,1941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
   public static int number_ones(int n) {try{__CLR4_4_11gv1gvlp17t49l.R.inc(1903);
      __CLR4_4_11gv1gvlp17t49l.R.inc(1904);if((((n < 0)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1905)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1906)==0&false))) {__CLR4_4_11gv1gvlp17t49l.R.inc(1907);n *= -1;
      }__CLR4_4_11gv1gvlp17t49l.R.inc(1908);int count = 0;
      __CLR4_4_11gv1gvlp17t49l.R.inc(1909);while((((n > 0)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1910)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1911)==0&false))) {{
         __CLR4_4_11gv1gvlp17t49l.R.inc(1912);count += n & 1;
         __CLR4_4_11gv1gvlp17t49l.R.inc(1913);n >>= 1;
      }
      }__CLR4_4_11gv1gvlp17t49l.R.inc(1914);return count;
   }finally{__CLR4_4_11gv1gvlp17t49l.R.flushNeeded();}}

   public static ArrayList<Integer> sort_array_binary(ArrayList<Integer> arr) {try{__CLR4_4_11gv1gvlp17t49l.R.inc(1915);
      __CLR4_4_11gv1gvlp17t49l.R.inc(1916);Collections.sort(arr, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {try{__CLR4_4_11gv1gvlp17t49l.R.inc(1917);
            __CLR4_4_11gv1gvlp17t49l.R.inc(1918);int num_ones_o1 = number_ones(o1);
            __CLR4_4_11gv1gvlp17t49l.R.inc(1919);int num_ones_o2 = number_ones(o2);
            __CLR4_4_11gv1gvlp17t49l.R.inc(1920);if((((num_ones_o1 == num_ones_o2)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1921)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1922)==0&false))) {{
               __CLR4_4_11gv1gvlp17t49l.R.inc(1923);if((((o1 == o2)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1924)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1925)==0&false))) {__CLR4_4_11gv1gvlp17t49l.R.inc(1926);return 1;
               }__CLR4_4_11gv1gvlp17t49l.R.inc(1927);if((((o1 < o2)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1928)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1929)==0&false))) {__CLR4_4_11gv1gvlp17t49l.R.inc(1930);return 0;
               }__CLR4_4_11gv1gvlp17t49l.R.inc(1931);if((((o1 > o2)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1932)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1933)==0&false))) {__CLR4_4_11gv1gvlp17t49l.R.inc(1934);return -1;
            }}
            }__CLR4_4_11gv1gvlp17t49l.R.inc(1935);if((((num_ones_o1 < num_ones_o2)&&(__CLR4_4_11gv1gvlp17t49l.R.iget(1936)!=0|true))||(__CLR4_4_11gv1gvlp17t49l.R.iget(1937)==0&false))) {__CLR4_4_11gv1gvlp17t49l.R.inc(1938);return -1;
            }else {__CLR4_4_11gv1gvlp17t49l.R.inc(1939);return 1;
         }}finally{__CLR4_4_11gv1gvlp17t49l.R.flushNeeded();}}
      });
      __CLR4_4_11gv1gvlp17t49l.R.inc(1940);return arr;
   }finally{__CLR4_4_11gv1gvlp17t49l.R.flushNeeded();}}
}
