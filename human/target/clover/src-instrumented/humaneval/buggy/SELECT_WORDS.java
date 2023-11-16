/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

import java.util.ArrayList;

/*
 * Given a string s and a natural number n, you have been tasked to implement 
    a function that returns a list of all words from string s that contain exactly 
    n consonants, in order these words appear in the string s.
    If the string s is empty then the function should return an empty list.
    Note: you may assume the input string contains only letters and spaces.
    Examples:
    select_words("Mary had a little lamb", 4) ==> ["little"]
    select_words("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
    select_words("simple white space", 2) ==> []
    select_words("Hello world", 4) ==> ["world"]
    select_words("Uncle sam", 3) ==> ["Uncle"]
 */

public class SELECT_WORDS {public static class __CLR4_4_11ck1cklp17t47j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,1777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<String> select_words(String s, int n) {try{__CLR4_4_11ck1cklp17t47j.R.inc(1748);
        __CLR4_4_11ck1cklp17t47j.R.inc(1749);ArrayList<String> result = new ArrayList<>();
        __CLR4_4_11ck1cklp17t47j.R.inc(1750);String[] words = s.split(" ");
        __CLR4_4_11ck1cklp17t47j.R.inc(1751);for(int i = 0; (((i < words.length)&&(__CLR4_4_11ck1cklp17t47j.R.iget(1752)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1753)==0&false)); i++) {{
            __CLR4_4_11ck1cklp17t47j.R.inc(1754);int num_consonants = 0;
            __CLR4_4_11ck1cklp17t47j.R.inc(1755);char[] vowels = {'a', 'e', 'i', 'o', 'u'};
            __CLR4_4_11ck1cklp17t47j.R.inc(1756);for(int j = 0; (((j < words[i].length())&&(__CLR4_4_11ck1cklp17t47j.R.iget(1757)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1758)==0&false)); j++) {{
                __CLR4_4_11ck1cklp17t47j.R.inc(1759);boolean consonant = true;
                __CLR4_4_11ck1cklp17t47j.R.inc(1760);for(int k = 0; (((k < vowels.length)&&(__CLR4_4_11ck1cklp17t47j.R.iget(1761)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1762)==0&false)); k++) {{
                    __CLR4_4_11ck1cklp17t47j.R.inc(1763);if((((vowels[k] == words[i].charAt(j))&&(__CLR4_4_11ck1cklp17t47j.R.iget(1764)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1765)==0&false))) {{
                        __CLR4_4_11ck1cklp17t47j.R.inc(1766);consonant = false;
                        __CLR4_4_11ck1cklp17t47j.R.inc(1767);break;
                    }
                }}
                }__CLR4_4_11ck1cklp17t47j.R.inc(1768);if((((consonant)&&(__CLR4_4_11ck1cklp17t47j.R.iget(1769)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1770)==0&false))) {__CLR4_4_11ck1cklp17t47j.R.inc(1771);num_consonants++;
            }}
            }__CLR4_4_11ck1cklp17t47j.R.inc(1772);if((((num_consonants == n)&&(__CLR4_4_11ck1cklp17t47j.R.iget(1773)!=0|true))||(__CLR4_4_11ck1cklp17t47j.R.iget(1774)==0&false))) {__CLR4_4_11ck1cklp17t47j.R.inc(1775);result.add(words[i]);
        }}
        }__CLR4_4_11ck1cklp17t47j.R.inc(1776);return result;
    }finally{__CLR4_4_11ck1cklp17t47j.R.flushNeeded();}}
}
