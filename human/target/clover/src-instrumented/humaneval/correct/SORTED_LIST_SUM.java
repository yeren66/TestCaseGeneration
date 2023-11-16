/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;

/* Write a function that accepts a list of strings as a parameter,
deletes the strings that have odd lengths from it,
and returns the resulted list with a sorted order,
The list is always a list of strings and never an array of numbers,
and it may contain duplicates.
The order of the list should be ascending by length of each word, and you
should return the list sorted by that rule.
If two words have the same length, sort the list alphabetically.
The function should return a list of strings in sorted order.
You may assume that all words will have the same length.
For example:
assert list_sort(["aa", "a", "aaa"]) => ["aa"]
assert list_sort(["ab", "a", "aaa", "cd"]) => ["ab", "cd"] */

public class SORTED_LIST_SUM {public static class __CLR4_4_13bh3bhlp0zmhpi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<String> sorted_list_sum(ArrayList<String> lst) {try{__CLR4_4_13bh3bhlp0zmhpi.R.inc(4301);
        __CLR4_4_13bh3bhlp0zmhpi.R.inc(4302);ArrayList<String> result = new ArrayList<String>();
        __CLR4_4_13bh3bhlp0zmhpi.R.inc(4303);for (String str : lst) {{
            __CLR4_4_13bh3bhlp0zmhpi.R.inc(4304);if ((((str.length() % 2 == 1)&&(__CLR4_4_13bh3bhlp0zmhpi.R.iget(4305)!=0|true))||(__CLR4_4_13bh3bhlp0zmhpi.R.iget(4306)==0&false))) {__CLR4_4_13bh3bhlp0zmhpi.R.inc(4307);continue;
            }__CLR4_4_13bh3bhlp0zmhpi.R.inc(4308);result.add(str);
        }

        }__CLR4_4_13bh3bhlp0zmhpi.R.inc(4309);Collections.sort(
            result,
            (s1, s2) -> {
                __CLR4_4_13bh3bhlp0zmhpi.R.inc(4310);if ((((s1.length() == s2.length())&&(__CLR4_4_13bh3bhlp0zmhpi.R.iget(4311)!=0|true))||(__CLR4_4_13bh3bhlp0zmhpi.R.iget(4312)==0&false))) {__CLR4_4_13bh3bhlp0zmhpi.R.inc(4313);return s1.compareTo(s2);
                }__CLR4_4_13bh3bhlp0zmhpi.R.inc(4314);return s1.length() - s2.length();
            }
        );

        __CLR4_4_13bh3bhlp0zmhpi.R.inc(4315);return result;
    }finally{__CLR4_4_13bh3bhlp0zmhpi.R.flushNeeded();}}
}
