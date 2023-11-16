/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.HashMap;

/*
 * Given a string representing a space separated lowercase letters, return a dictionary
    of the letter with the most repetition and containing the corresponding count.
    If several letters have the same occurrence, return all of them.
    
    Example:
    histogram('a b c') == {'a': 1, 'b': 1, 'c': 1}
    histogram('a b b a') == {'a': 2, 'b': 2}
    histogram('a b c a b') == {'a': 2, 'b': 2}
    histogram('b b b b a') == {'b': 4}
    histogram('') == {}
 */

public class HISTOGRAM {public static class __CLR4_4_12it2itlp17t4mv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,3301,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static HashMap<Character, Integer> histogram(String s) {try{__CLR4_4_12it2itlp17t4mv.R.inc(3269);
        __CLR4_4_12it2itlp17t4mv.R.inc(3270);HashMap<Character, Integer> res = new HashMap<Character, Integer>();
        __CLR4_4_12it2itlp17t4mv.R.inc(3271);if((((s.isEmpty())&&(__CLR4_4_12it2itlp17t4mv.R.iget(3272)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3273)==0&false))) {__CLR4_4_12it2itlp17t4mv.R.inc(3274);return res;
        }__CLR4_4_12it2itlp17t4mv.R.inc(3275);String[] list_letters = s.split(" ");
        __CLR4_4_12it2itlp17t4mv.R.inc(3276);int[] count_letter = new int[26];
        __CLR4_4_12it2itlp17t4mv.R.inc(3277);for(int i = 0; (((i < list_letters.length)&&(__CLR4_4_12it2itlp17t4mv.R.iget(3278)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3279)==0&false)); i++) {{
            __CLR4_4_12it2itlp17t4mv.R.inc(3280);char c = list_letters[i].charAt(0);
            __CLR4_4_12it2itlp17t4mv.R.inc(3281);count_letter[c - 'a']++;
        }
        }__CLR4_4_12it2itlp17t4mv.R.inc(3282);int most_count = 0;
        __CLR4_4_12it2itlp17t4mv.R.inc(3283);for(int i = 0; (((i < 26)&&(__CLR4_4_12it2itlp17t4mv.R.iget(3284)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3285)==0&false)); i++) {{
            __CLR4_4_12it2itlp17t4mv.R.inc(3286);if((((count_letter[i] > most_count)&&(__CLR4_4_12it2itlp17t4mv.R.iget(3287)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3288)==0&false))) {{
                __CLR4_4_12it2itlp17t4mv.R.inc(3289);most_count = count_letter[i];
                __CLR4_4_12it2itlp17t4mv.R.inc(3290);res.clear();
                __CLR4_4_12it2itlp17t4mv.R.inc(3291);res.put((char) ('a' + i), most_count);
            } }else {__CLR4_4_12it2itlp17t4mv.R.inc(3292);if((((count_letter[i] == most_count)&&(__CLR4_4_12it2itlp17t4mv.R.iget(3293)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3294)==0&false))) {{
                __CLR4_4_12it2itlp17t4mv.R.inc(3295);res.put((char) ('a' + i), most_count);
            }
        }}}
        }__CLR4_4_12it2itlp17t4mv.R.inc(3296);if((((most_count == 0)&&(__CLR4_4_12it2itlp17t4mv.R.iget(3297)!=0|true))||(__CLR4_4_12it2itlp17t4mv.R.iget(3298)==0&false))) {__CLR4_4_12it2itlp17t4mv.R.inc(3299);res.clear();
        }__CLR4_4_12it2itlp17t4mv.R.inc(3300);return res;
    }finally{__CLR4_4_12it2itlp17t4mv.R.flushNeeded();}}
}
