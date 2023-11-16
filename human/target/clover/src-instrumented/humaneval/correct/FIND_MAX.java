/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

// Write a function that accepts a list of strings.
// The list contains different words. Return the word with maximum number
// of unique characters. If multiple strings have maximum number of unique
// characters, return the one which comes first in lexicographical order.

// find_max(["name", "of", "string"]) == "string"
// find_max(["name", "enam", "game"]) == "enam"
// find_max(["aaaaaaa", "bb" ,"cc"]) == "aaaaaaa"

public class FIND_MAX {public static class __CLR4_4_12c22c2lp17t4k7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,3039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String find_max(String[] words) {try{__CLR4_4_12c22c2lp17t4k7.R.inc(3026);
        __CLR4_4_12c22c2lp17t4k7.R.inc(3027);ArrayList<String> words_list = new ArrayList<String>(Arrays.asList(words));
        __CLR4_4_12c22c2lp17t4k7.R.inc(3028);Collections.sort(
            words_list,
            (w1, w2) -> {
                __CLR4_4_12c22c2lp17t4k7.R.inc(3029);Character[] c1 = ((String) w1).chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                __CLR4_4_12c22c2lp17t4k7.R.inc(3030);HashSet<Character> s1 = new HashSet<Character>(Arrays.asList(c1));
                __CLR4_4_12c22c2lp17t4k7.R.inc(3031);Character[] c2 = ((String) w2).chars().mapToObj(c -> (char)c).toArray(Character[]::new);
                __CLR4_4_12c22c2lp17t4k7.R.inc(3032);HashSet<Character> s2 = new HashSet<Character>(Arrays.asList(c2));
                __CLR4_4_12c22c2lp17t4k7.R.inc(3033);if ((((s2.size() != s1.size())&&(__CLR4_4_12c22c2lp17t4k7.R.iget(3034)!=0|true))||(__CLR4_4_12c22c2lp17t4k7.R.iget(3035)==0&false))) {__CLR4_4_12c22c2lp17t4k7.R.inc(3036);return s2.size() - s1.size();
                }else {__CLR4_4_12c22c2lp17t4k7.R.inc(3037);return w1.compareTo(w2);
            }}
        );
        __CLR4_4_12c22c2lp17t4k7.R.inc(3038);return words_list.get(0);
    }finally{__CLR4_4_12c22c2lp17t4k7.R.flushNeeded();}}
}
