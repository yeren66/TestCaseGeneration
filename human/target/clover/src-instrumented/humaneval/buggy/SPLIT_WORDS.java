/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * Given a string of words, return a list of words split on whitespace, if no whitespaces exists in the text you
    should split on commas ',' if no commas exists you should return the number of lower-case letters with odd order in the
    alphabet, ord('a') = 0, ord('b') = 1, ... ord('z') = 25
    Examples
    split_words("Hello world!") \u279e ["Hello", "world!"]
    split_words("Hello,world!") \u279e ["Hello", "world!"]
    split_words("abcdef") == 3 
 */

public class SPLIT_WORDS {public static class __CLR4_4_11jy1jylp0zmhaj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2034,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String[] split_words(String txt) {try{__CLR4_4_11jy1jylp0zmhaj.R.inc(2014);
        __CLR4_4_11jy1jylp0zmhaj.R.inc(2015);if((((txt.contains(" "))&&(__CLR4_4_11jy1jylp0zmhaj.R.iget(2016)!=0|true))||(__CLR4_4_11jy1jylp0zmhaj.R.iget(2017)==0&false))) {{
            __CLR4_4_11jy1jylp0zmhaj.R.inc(2018);return txt.split(" ");
        } }else {__CLR4_4_11jy1jylp0zmhaj.R.inc(2019);if((((txt.contains(","))&&(__CLR4_4_11jy1jylp0zmhaj.R.iget(2020)!=0|true))||(__CLR4_4_11jy1jylp0zmhaj.R.iget(2021)==0&false))) {{
            __CLR4_4_11jy1jylp0zmhaj.R.inc(2022);return txt.split(",");
        } }else {{
            __CLR4_4_11jy1jylp0zmhaj.R.inc(2023);int count = 0;
            __CLR4_4_11jy1jylp0zmhaj.R.inc(2024);for(int i = 0; (((i < txt.length())&&(__CLR4_4_11jy1jylp0zmhaj.R.iget(2025)!=0|true))||(__CLR4_4_11jy1jylp0zmhaj.R.iget(2026)==0&false)); i++) {{
                __CLR4_4_11jy1jylp0zmhaj.R.inc(2027);char curr = txt.charAt(i);
                __CLR4_4_11jy1jylp0zmhaj.R.inc(2028);if((((Character.isUpperCase(curr) && ((curr - 'a') % 2) == 0)&&(__CLR4_4_11jy1jylp0zmhaj.R.iget(2029)!=0|true))||(__CLR4_4_11jy1jylp0zmhaj.R.iget(2030)==0&false))) {__CLR4_4_11jy1jylp0zmhaj.R.inc(2031);count++;
            }}
            }__CLR4_4_11jy1jylp0zmhaj.R.inc(2032);String[] result = {Integer.toString(count)};
            __CLR4_4_11jy1jylp0zmhaj.R.inc(2033);return result;
        }
    }}}finally{__CLR4_4_11jy1jylp0zmhaj.R.flushNeeded();}}
}
