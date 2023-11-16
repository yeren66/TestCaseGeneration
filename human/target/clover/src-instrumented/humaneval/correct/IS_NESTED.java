/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Create a function that takes a string as input which contains only square brackets.
    The function should return True if and only if there is a valid subsequence of brackets 
    where at least one bracket in the subsequence is nested.

    is_nested('[[]]') \u279e True
    is_nested('[]]]]]]][[[[[]') \u279e False
    is_nested('[][]') \u279e False
    is_nested('[]') \u279e False
    is_nested('[[][]]') \u279e True
    is_nested('[[]][[') \u279e True

 */

public class IS_NESTED {public static class __CLR4_4_12nj2njlp17t4os{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,3459,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_nested(String brackets) {try{__CLR4_4_12nj2njlp17t4os.R.inc(3439);
        __CLR4_4_12nj2njlp17t4os.R.inc(3440);ArrayList<Integer> opening_brackets = new ArrayList<>();
        __CLR4_4_12nj2njlp17t4os.R.inc(3441);ArrayList<Integer> closing_brackets = new ArrayList<>();
        __CLR4_4_12nj2njlp17t4os.R.inc(3442);for(int i = 0; (((i < brackets.length())&&(__CLR4_4_12nj2njlp17t4os.R.iget(3443)!=0|true))||(__CLR4_4_12nj2njlp17t4os.R.iget(3444)==0&false)); i++) {{
            __CLR4_4_12nj2njlp17t4os.R.inc(3445);if((((brackets.charAt(i) == '[')&&(__CLR4_4_12nj2njlp17t4os.R.iget(3446)!=0|true))||(__CLR4_4_12nj2njlp17t4os.R.iget(3447)==0&false))) {__CLR4_4_12nj2njlp17t4os.R.inc(3448);opening_brackets.add(i);
            }else {__CLR4_4_12nj2njlp17t4os.R.inc(3449);closing_brackets.add(i);
        }}
        }__CLR4_4_12nj2njlp17t4os.R.inc(3450);Collections.reverse(closing_brackets);
        __CLR4_4_12nj2njlp17t4os.R.inc(3451);int cnt = 0, i = 0, l = closing_brackets.size();
        __CLR4_4_12nj2njlp17t4os.R.inc(3452);for(int idx : opening_brackets) {{
            __CLR4_4_12nj2njlp17t4os.R.inc(3453);if((((i < l && idx < closing_brackets.get(i))&&(__CLR4_4_12nj2njlp17t4os.R.iget(3454)!=0|true))||(__CLR4_4_12nj2njlp17t4os.R.iget(3455)==0&false))) {{
                __CLR4_4_12nj2njlp17t4os.R.inc(3456);i++;
                __CLR4_4_12nj2njlp17t4os.R.inc(3457);cnt++;
            }
        }}
        }__CLR4_4_12nj2njlp17t4os.R.inc(3458);return cnt >= 2;
    }finally{__CLR4_4_12nj2njlp17t4os.R.flushNeeded();}}
}