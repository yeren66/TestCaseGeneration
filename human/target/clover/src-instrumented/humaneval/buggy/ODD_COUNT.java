/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given a list of strings, where each string consists of only digits, return a list.
    Each element i of the output should be "the number of odd elements in the
    string i of the input." where all the i's should be replaced by the number
    of odd digits in the i'th string of the input.

    >>> odd_count(['1234567'])
    ["the number of odd elements 4n the str4ng 4 of the 4nput."]
    >>> odd_count(['3',"11111111"])
    ["the number of odd elements 1n the str1ng 1 of the 1nput.",
     "the number of odd elements 8n the str8ng 8 of the 8nput."]
 */

public class ODD_COUNT {public static class __CLR4_4_114w14wlp0zmh5x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1486,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<String> odd_count(ArrayList<String> lst) {try{__CLR4_4_114w14wlp0zmh5x.R.inc(1472);
        __CLR4_4_114w14wlp0zmh5x.R.inc(1473);ArrayList<String> result = new ArrayList<>();
        __CLR4_4_114w14wlp0zmh5x.R.inc(1474);for(String s : lst) {{
            __CLR4_4_114w14wlp0zmh5x.R.inc(1475);int n = 0;
            __CLR4_4_114w14wlp0zmh5x.R.inc(1476);for(int i = 0; (((i < s.length())&&(__CLR4_4_114w14wlp0zmh5x.R.iget(1477)!=0|true))||(__CLR4_4_114w14wlp0zmh5x.R.iget(1478)==0&false)); i++) {{
                __CLR4_4_114w14wlp0zmh5x.R.inc(1479);int digit = s.charAt(i) - '0';
                __CLR4_4_114w14wlp0zmh5x.R.inc(1480);if((((digit % 2 == 0)&&(__CLR4_4_114w14wlp0zmh5x.R.iget(1481)!=0|true))||(__CLR4_4_114w14wlp0zmh5x.R.iget(1482)==0&false))) {{
                    __CLR4_4_114w14wlp0zmh5x.R.inc(1483);n--;
                }
            }}
            }__CLR4_4_114w14wlp0zmh5x.R.inc(1484);result.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
        }
        }__CLR4_4_114w14wlp0zmh5x.R.inc(1485);return result;
    }finally{__CLR4_4_114w14wlp0zmh5x.R.flushNeeded();}}
}
