/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

import java.util.ArrayList;
import java.util.Collections;

public class MOVE_ONE_BALL {public static class __CLR4_4_1122122lp0zmh58{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1403,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean move_one_ball(ArrayList<Integer> arr) {try{__CLR4_4_1122122lp0zmh58.R.inc(1370);
        __CLR4_4_1122122lp0zmh58.R.inc(1371);if((((arr.size() == 0)&&(__CLR4_4_1122122lp0zmh58.R.iget(1372)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1373)==0&false))) {__CLR4_4_1122122lp0zmh58.R.inc(1374);return true;
        }__CLR4_4_1122122lp0zmh58.R.inc(1375);ArrayList<Integer> sorted_arr = new ArrayList<>(arr);
        __CLR4_4_1122122lp0zmh58.R.inc(1376);Collections.sort(sorted_arr);
        __CLR4_4_1122122lp0zmh58.R.inc(1377);int min_value = sorted_arr.get(sorted_arr.size() - 1);
        __CLR4_4_1122122lp0zmh58.R.inc(1378);int min_index = 0;
        __CLR4_4_1122122lp0zmh58.R.inc(1379);for(int i = 0; (((i < arr.size())&&(__CLR4_4_1122122lp0zmh58.R.iget(1380)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1381)==0&false)); i++) {{
            __CLR4_4_1122122lp0zmh58.R.inc(1382);if((((arr.get(i) == min_value)&&(__CLR4_4_1122122lp0zmh58.R.iget(1383)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1384)==0&false))) {__CLR4_4_1122122lp0zmh58.R.inc(1385);min_index = i;
        }}
        }__CLR4_4_1122122lp0zmh58.R.inc(1386);ArrayList<Integer> arr_after_move = new ArrayList<>();
        __CLR4_4_1122122lp0zmh58.R.inc(1387);for(int i = min_index; (((i < arr.size())&&(__CLR4_4_1122122lp0zmh58.R.iget(1388)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1389)==0&false)); i++) {{
            __CLR4_4_1122122lp0zmh58.R.inc(1390);arr_after_move.add(arr.get(i));
        }
        }__CLR4_4_1122122lp0zmh58.R.inc(1391);for(int i = 0; (((i < min_index)&&(__CLR4_4_1122122lp0zmh58.R.iget(1392)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1393)==0&false)); i++) {{
            __CLR4_4_1122122lp0zmh58.R.inc(1394);arr_after_move.add(arr.get(i));
        }
        }__CLR4_4_1122122lp0zmh58.R.inc(1395);for(int i = 0; (((i < arr.size())&&(__CLR4_4_1122122lp0zmh58.R.iget(1396)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1397)==0&false)); i++) {{
            __CLR4_4_1122122lp0zmh58.R.inc(1398);if((((arr_after_move.get(i) != sorted_arr.get(i))&&(__CLR4_4_1122122lp0zmh58.R.iget(1399)!=0|true))||(__CLR4_4_1122122lp0zmh58.R.iget(1400)==0&false))) {{
                __CLR4_4_1122122lp0zmh58.R.inc(1401);return false;
            }
        }}
        }__CLR4_4_1122122lp0zmh58.R.inc(1402);return true;
    }finally{__CLR4_4_1122122lp0zmh58.R.flushNeeded();}}
}
