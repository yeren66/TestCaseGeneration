/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* Write a function which sorts the given list of integers
in ascending order according to the sum of their digits.
Note: if there are several items with similar sum of their digits,
order them based on their index in original list.

For example:
>>> order_by_points([1, 11, -1, -11, -12]) == [-1, -11, 1, -12, 11]
>>> order_by_points([]) == [] */

public class ORDER_BY_POINTS {public static class __CLR4_4_12zu2zulp0zmhnr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Integer[] order_by_points(Integer[] nums) {try{__CLR4_4_12zu2zulp0zmhnr.R.inc(3882);
        __CLR4_4_12zu2zulp0zmhnr.R.inc(3883);ArrayList<Integer> digits = new ArrayList<Integer>();
        __CLR4_4_12zu2zulp0zmhnr.R.inc(3884);HashMap<Integer, ArrayList<Integer>> digits_number = new HashMap<Integer, ArrayList<Integer>>();

        __CLR4_4_12zu2zulp0zmhnr.R.inc(3885);for (int i = 0; (((i < nums.length)&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3886)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3887)==0&false)); i += 1){{
            __CLR4_4_12zu2zulp0zmhnr.R.inc(3888);int neg = 1;
            __CLR4_4_12zu2zulp0zmhnr.R.inc(3889);int n = nums[i];
            __CLR4_4_12zu2zulp0zmhnr.R.inc(3890);if ((((n < 0)&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3891)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3892)==0&false))) {{
                __CLR4_4_12zu2zulp0zmhnr.R.inc(3893);n = -1 * n;
                __CLR4_4_12zu2zulp0zmhnr.R.inc(3894);neg = -1;
            }
            }__CLR4_4_12zu2zulp0zmhnr.R.inc(3895);int digit = 0;
            __CLR4_4_12zu2zulp0zmhnr.R.inc(3896);for (int j = 0; (((j < (n + "").toCharArray().length)&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3897)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3898)==0&false)); j += 1){{
                __CLR4_4_12zu2zulp0zmhnr.R.inc(3899);if ((((j == 0)&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3900)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3901)==0&false)))
                    {__CLR4_4_12zu2zulp0zmhnr.R.inc(3902);digit += ((n + "").toCharArray()[j] - '0') * neg;
                }else 
                    {__CLR4_4_12zu2zulp0zmhnr.R.inc(3903);digit += (n + "").toCharArray()[j] - '0';
            }}
            }__CLR4_4_12zu2zulp0zmhnr.R.inc(3904);if ((((! digits.contains(digit))&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3905)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3906)==0&false)))
                {__CLR4_4_12zu2zulp0zmhnr.R.inc(3907);digits.add(digit);
            }__CLR4_4_12zu2zulp0zmhnr.R.inc(3908);if ((((! digits_number.containsKey(digit))&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3909)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3910)==0&false)))
                {__CLR4_4_12zu2zulp0zmhnr.R.inc(3911);digits_number.put(digit, new ArrayList<Integer>());
            }__CLR4_4_12zu2zulp0zmhnr.R.inc(3912);digits_number.get(digit).add(nums[i]);
        }
        }__CLR4_4_12zu2zulp0zmhnr.R.inc(3913);Collections.sort(digits);
        
        __CLR4_4_12zu2zulp0zmhnr.R.inc(3914);ArrayList<Integer> result = new ArrayList<Integer>();
        __CLR4_4_12zu2zulp0zmhnr.R.inc(3915);for (int i = 0; (((i < digits.size())&&(__CLR4_4_12zu2zulp0zmhnr.R.iget(3916)!=0|true))||(__CLR4_4_12zu2zulp0zmhnr.R.iget(3917)==0&false)); i += 1) {{
            __CLR4_4_12zu2zulp0zmhnr.R.inc(3918);result.addAll(digits_number.get(digits.get(i)));
        }
        }__CLR4_4_12zu2zulp0zmhnr.R.inc(3919);return result.toArray(new Integer[] {});
    }finally{__CLR4_4_12zu2zulp0zmhnr.R.flushNeeded();}}
}
