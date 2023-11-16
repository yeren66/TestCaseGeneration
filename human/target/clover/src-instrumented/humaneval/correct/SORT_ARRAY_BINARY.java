/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

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

public class SORT_ARRAY_BINARY {public static class __CLR4_4_13cd3cdlp17t4wm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,4371,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
   public static int number_ones(int n) {try{__CLR4_4_13cd3cdlp17t4wm.R.inc(4333);
      __CLR4_4_13cd3cdlp17t4wm.R.inc(4334);if((((n < 0)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4335)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4336)==0&false))) {__CLR4_4_13cd3cdlp17t4wm.R.inc(4337);n *= -1;
      }__CLR4_4_13cd3cdlp17t4wm.R.inc(4338);int count = 0;
      __CLR4_4_13cd3cdlp17t4wm.R.inc(4339);while((((n > 0)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4340)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4341)==0&false))) {{
         __CLR4_4_13cd3cdlp17t4wm.R.inc(4342);count += n & 1;
         __CLR4_4_13cd3cdlp17t4wm.R.inc(4343);n >>= 1;
      }
      }__CLR4_4_13cd3cdlp17t4wm.R.inc(4344);return count;
   }finally{__CLR4_4_13cd3cdlp17t4wm.R.flushNeeded();}}

   public static ArrayList<Integer> sort_array_binary(ArrayList<Integer> arr) {try{__CLR4_4_13cd3cdlp17t4wm.R.inc(4345);
      __CLR4_4_13cd3cdlp17t4wm.R.inc(4346);Collections.sort(arr, new Comparator<Integer>() {
         @Override
         public int compare(Integer o1, Integer o2) {try{__CLR4_4_13cd3cdlp17t4wm.R.inc(4347);
            __CLR4_4_13cd3cdlp17t4wm.R.inc(4348);int num_ones_o1 = number_ones(o1);
            __CLR4_4_13cd3cdlp17t4wm.R.inc(4349);int num_ones_o2 = number_ones(o2);
            __CLR4_4_13cd3cdlp17t4wm.R.inc(4350);if((((num_ones_o1 == num_ones_o2)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4351)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4352)==0&false))) {{
               __CLR4_4_13cd3cdlp17t4wm.R.inc(4353);if((((o1 == o2)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4354)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4355)==0&false))) {__CLR4_4_13cd3cdlp17t4wm.R.inc(4356);return 0;
               }__CLR4_4_13cd3cdlp17t4wm.R.inc(4357);if((((o1 < o2)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4358)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4359)==0&false))) {__CLR4_4_13cd3cdlp17t4wm.R.inc(4360);return -1;
               }__CLR4_4_13cd3cdlp17t4wm.R.inc(4361);if((((o1 > o2)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4362)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4363)==0&false))) {__CLR4_4_13cd3cdlp17t4wm.R.inc(4364);return 1;
            }}
            }__CLR4_4_13cd3cdlp17t4wm.R.inc(4365);if((((num_ones_o1 < num_ones_o2)&&(__CLR4_4_13cd3cdlp17t4wm.R.iget(4366)!=0|true))||(__CLR4_4_13cd3cdlp17t4wm.R.iget(4367)==0&false))) {__CLR4_4_13cd3cdlp17t4wm.R.inc(4368);return -1;
            }else {__CLR4_4_13cd3cdlp17t4wm.R.inc(4369);return 1;
         }}finally{__CLR4_4_13cd3cdlp17t4wm.R.flushNeeded();}}
      });
      __CLR4_4_13cd3cdlp17t4wm.R.inc(4370);return arr;
   }finally{__CLR4_4_13cd3cdlp17t4wm.R.flushNeeded();}}
}
