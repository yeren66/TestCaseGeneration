/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.HashMap;

/*
 * Given a list of numbers, return whether or not they are sorted
    in ascending order. If list has more than 1 duplicate of the same
    number, return False. Assume no negative numbers and only integers.

    Examples
    is_sorted([5]) \u279e True
    is_sorted([1, 2, 3, 4, 5]) \u279e True
    is_sorted([1, 3, 2, 4, 5]) \u279e False
    is_sorted([1, 2, 3, 4, 5, 6]) \u279e True
    is_sorted([1, 2, 3, 4, 5, 6, 7]) \u279e True
    is_sorted([1, 3, 2, 4, 5, 6, 7]) \u279e False
    is_sorted([1, 2, 2, 3, 3, 4]) \u279e True
    is_sorted([1, 2, 2, 2, 3, 4]) \u279e False
 */

public class IS_SORTED {public static class __CLR4_4_12p02p0lp0zmhki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_sorted(int[] lst) {try{__CLR4_4_12p02p0lp0zmhki.R.inc(3492);
        __CLR4_4_12p02p0lp0zmhki.R.inc(3493);HashMap<Integer, Integer> count_num = new HashMap<>();
        __CLR4_4_12p02p0lp0zmhki.R.inc(3494);for(int i = 0; (((i < lst.length)&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3495)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3496)==0&false)); i++) {{
            __CLR4_4_12p02p0lp0zmhki.R.inc(3497);count_num.put(lst[i], 0);
        }
        }__CLR4_4_12p02p0lp0zmhki.R.inc(3498);for(int i = 0; (((i < lst.length)&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3499)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3500)==0&false)); i++) {{
            __CLR4_4_12p02p0lp0zmhki.R.inc(3501);count_num.put(lst[i], count_num.get(lst[i]) + 1);
        }
        }__CLR4_4_12p02p0lp0zmhki.R.inc(3502);for(int i = 0; (((i < lst.length)&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3503)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3504)==0&false)); i++) {{
            __CLR4_4_12p02p0lp0zmhki.R.inc(3505);if((((count_num.get(lst[i]) > 2)&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3506)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3507)==0&false))) {__CLR4_4_12p02p0lp0zmhki.R.inc(3508);return false;
        }}
        }__CLR4_4_12p02p0lp0zmhki.R.inc(3509);for(int i = 0; (((i < lst.length - 1)&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3510)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3511)==0&false)); i++) {{
            __CLR4_4_12p02p0lp0zmhki.R.inc(3512);if((((lst[i] > lst[i + 1])&&(__CLR4_4_12p02p0lp0zmhki.R.iget(3513)!=0|true))||(__CLR4_4_12p02p0lp0zmhki.R.iget(3514)==0&false))) {__CLR4_4_12p02p0lp0zmhki.R.inc(3515);return false;
        }}
        }__CLR4_4_12p02p0lp0zmhki.R.inc(3516);return true;
    }finally{__CLR4_4_12p02p0lp0zmhki.R.flushNeeded();}}
}
