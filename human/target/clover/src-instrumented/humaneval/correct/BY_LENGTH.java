/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

/*
 * Given an array of integers, sort the integers that are between 1 and 9 inclusive,
    reverse the resulting array, and then replace each digit by its corresponding name from
    "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".

    For example:
      arr = [2, 1, 1, 4, 5, 8, 2, 3]   
            -> sort arr -> [1, 1, 2, 2, 3, 4, 5, 8] 
            -> reverse arr -> [8, 5, 4, 3, 2, 2, 1, 1]
      return ["Eight", "Five", "Four", "Three", "Two", "Two", "One", "One"]
    
      If the array is empty, return an empty array:
      arr = []
      return []
    
      If the array has any strange number ignore it:
      arr = [1, -1 , 55] 
            -> sort arr -> [-1, 1, 55]
            -> reverse arr -> [55, 1, -1]
      return = ['One']
 */

public class BY_LENGTH {public static class __CLR4_4_11uy1uylp17t4e6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,2429,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<String> by_length(ArrayList<Integer> a) {try{__CLR4_4_11uy1uylp17t4e6.R.inc(2410);
        __CLR4_4_11uy1uylp17t4e6.R.inc(2411);Map<Integer, String> digit_map = new HashMap<>();
        __CLR4_4_11uy1uylp17t4e6.R.inc(2412);digit_map.put(1, "One");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2413);digit_map.put(2, "Two");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2414);digit_map.put(3, "Three");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2415);digit_map.put(4, "Four");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2416);digit_map.put(5, "Five");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2417);digit_map.put(6, "Six");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2418);digit_map.put(7, "Seven");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2419);digit_map.put(8, "Eight");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2420);digit_map.put(9, "Nine");
        __CLR4_4_11uy1uylp17t4e6.R.inc(2421);Collections.sort(a, Collections.reverseOrder());
        __CLR4_4_11uy1uylp17t4e6.R.inc(2422);ArrayList<String> result = new ArrayList<>();
        __CLR4_4_11uy1uylp17t4e6.R.inc(2423);for(int num : a) {{
            __CLR4_4_11uy1uylp17t4e6.R.inc(2424);if((((digit_map.get(num) != null)&&(__CLR4_4_11uy1uylp17t4e6.R.iget(2425)!=0|true))||(__CLR4_4_11uy1uylp17t4e6.R.iget(2426)==0&false))) {{
                __CLR4_4_11uy1uylp17t4e6.R.inc(2427);result.add(digit_map.get(num));
            }
        }}
        }__CLR4_4_11uy1uylp17t4e6.R.inc(2428);return result;
    }finally{__CLR4_4_11uy1uylp17t4e6.R.flushNeeded();}}
}