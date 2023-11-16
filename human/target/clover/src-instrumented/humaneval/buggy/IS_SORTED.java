/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

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

public class IS_SORTED {public static class __CLR4_4_1ujujlp0zmh29{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1124,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_sorted(int[] lst) {try{__CLR4_4_1ujujlp0zmh29.R.inc(1099);
        __CLR4_4_1ujujlp0zmh29.R.inc(1100);HashMap<Integer, Integer> count_num = new HashMap<>();
        __CLR4_4_1ujujlp0zmh29.R.inc(1101);for(int i = 0; (((i < lst.length)&&(__CLR4_4_1ujujlp0zmh29.R.iget(1102)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1103)==0&false)); i++) {{
            __CLR4_4_1ujujlp0zmh29.R.inc(1104);count_num.put(lst[i], 0);
        }
        }__CLR4_4_1ujujlp0zmh29.R.inc(1105);for(int i = 0; (((i < lst.length)&&(__CLR4_4_1ujujlp0zmh29.R.iget(1106)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1107)==0&false)); i++) {{
            __CLR4_4_1ujujlp0zmh29.R.inc(1108);count_num.put(lst[i], count_num.get(lst[i]) + 1);
        }
        }__CLR4_4_1ujujlp0zmh29.R.inc(1109);for(int i = 0; (((i < lst.length)&&(__CLR4_4_1ujujlp0zmh29.R.iget(1110)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1111)==0&false)); i++) {{
            __CLR4_4_1ujujlp0zmh29.R.inc(1112);if((((count_num.get(lst[i]) > 2)&&(__CLR4_4_1ujujlp0zmh29.R.iget(1113)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1114)==0&false))) {__CLR4_4_1ujujlp0zmh29.R.inc(1115);return false;
        }}
        }__CLR4_4_1ujujlp0zmh29.R.inc(1116);for(int i = 0; (((i < lst.length - 1)&&(__CLR4_4_1ujujlp0zmh29.R.iget(1117)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1118)==0&false)); i++) {{
            __CLR4_4_1ujujlp0zmh29.R.inc(1119);if((((lst[i] <= lst[i + 1])&&(__CLR4_4_1ujujlp0zmh29.R.iget(1120)!=0|true))||(__CLR4_4_1ujujlp0zmh29.R.iget(1121)==0&false))) {__CLR4_4_1ujujlp0zmh29.R.inc(1122);return false;
        }}
        }__CLR4_4_1ujujlp0zmh29.R.inc(1123);return true;
    }finally{__CLR4_4_1ujujlp0zmh29.R.flushNeeded();}}
}
