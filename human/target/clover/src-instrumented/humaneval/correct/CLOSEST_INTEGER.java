/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

// Create a function that takes a value (string) representing a number
// and returns the closest integer to it. If the number is equidistant
// from two integers, round it away from zero.

// Examples
// >>> closest_integer("10")
// 10
// >>> closest_integer("15.3")
// 15

// Note:
// Rounding away from zero means that if the given number is equidistant
// from two integers, the one you should return is the one that is the
// farthest from zero. For example closest_integer("14.5") should
// return 15 and closest_integer("-14.5") should return -15.

public class CLOSEST_INTEGER {public static class __CLR4_4_11y41y4lp0zmhe7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int closest_integer(String value) {try{__CLR4_4_11y41y4lp0zmhe7.R.inc(2524);
        __CLR4_4_11y41y4lp0zmhe7.R.inc(2525);if ((((value.indexOf('.') >= 0)&&(__CLR4_4_11y41y4lp0zmhe7.R.iget(2526)!=0|true))||(__CLR4_4_11y41y4lp0zmhe7.R.iget(2527)==0&false))) {{
            __CLR4_4_11y41y4lp0zmhe7.R.inc(2528);while ((((value.charAt(value.length() - 1) == '0')&&(__CLR4_4_11y41y4lp0zmhe7.R.iget(2529)!=0|true))||(__CLR4_4_11y41y4lp0zmhe7.R.iget(2530)==0&false)))
                {__CLR4_4_11y41y4lp0zmhe7.R.inc(2531);value = value.substring(0, value.length() - 1);
        }}

        }__CLR4_4_11y41y4lp0zmhe7.R.inc(2532);double num = Double.parseDouble(value);
        __CLR4_4_11y41y4lp0zmhe7.R.inc(2533);int result = 0;
        __CLR4_4_11y41y4lp0zmhe7.R.inc(2534);if ((((value.length() >= 2 && value.substring(value.length() - 2).equals(".5"))&&(__CLR4_4_11y41y4lp0zmhe7.R.iget(2535)!=0|true))||(__CLR4_4_11y41y4lp0zmhe7.R.iget(2536)==0&false))) {{
            __CLR4_4_11y41y4lp0zmhe7.R.inc(2537);result = (((num > 0 )&&(__CLR4_4_11y41y4lp0zmhe7.R.iget(2538)!=0|true))||(__CLR4_4_11y41y4lp0zmhe7.R.iget(2539)==0&false))? (int)Math.ceil(num) : (int)Math.floor(num);
        } }else {__CLR4_4_11y41y4lp0zmhe7.R.inc(2540);if ((((value.length() > 0)&&(__CLR4_4_11y41y4lp0zmhe7.R.iget(2541)!=0|true))||(__CLR4_4_11y41y4lp0zmhe7.R.iget(2542)==0&false))){{
            __CLR4_4_11y41y4lp0zmhe7.R.inc(2543);result = (int)Math.round(num);
        }

        }}__CLR4_4_11y41y4lp0zmhe7.R.inc(2544);return result;
    }finally{__CLR4_4_11y41y4lp0zmhe7.R.flushNeeded();}}
}
