/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/*
 * You are given two positive integers n and m, and your task is to compute the
    average of the integers from n through m (including n and m). 
    Round the answer to the nearest integer (if the number ends in 0.5 round down)
    and convert that to binary.
    If n is greater than m, return -1.
    Example:
    rounded_avg(1, 5) => "11"
    rounded_avg(7, 5) => -1
 */

public class ROUNDED_AVG {public static class __CLR4_4_136d36dlp17t4up{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,4136,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String rounded_avg(int n, int m) {try{__CLR4_4_136d36dlp17t4up.R.inc(4117);
        __CLR4_4_136d36dlp17t4up.R.inc(4118);if((((m < n)&&(__CLR4_4_136d36dlp17t4up.R.iget(4119)!=0|true))||(__CLR4_4_136d36dlp17t4up.R.iget(4120)==0&false))) {__CLR4_4_136d36dlp17t4up.R.inc(4121);return "-1";
        }__CLR4_4_136d36dlp17t4up.R.inc(4122);int summation = 0;
        __CLR4_4_136d36dlp17t4up.R.inc(4123);for(int i = n; (((i < m + 1)&&(__CLR4_4_136d36dlp17t4up.R.iget(4124)!=0|true))||(__CLR4_4_136d36dlp17t4up.R.iget(4125)==0&false)); i++) {{
            __CLR4_4_136d36dlp17t4up.R.inc(4126);summation += i;
        }
        }__CLR4_4_136d36dlp17t4up.R.inc(4127);double avg = ((double) summation)/((double) (m - n + 1));
        __CLR4_4_136d36dlp17t4up.R.inc(4128);double rem = avg - Math.floor(avg);
        __CLR4_4_136d36dlp17t4up.R.inc(4129);int avg_rounded = 0;
        __CLR4_4_136d36dlp17t4up.R.inc(4130);if((((rem <= 0.5)&&(__CLR4_4_136d36dlp17t4up.R.iget(4131)!=0|true))||(__CLR4_4_136d36dlp17t4up.R.iget(4132)==0&false))) {{
            __CLR4_4_136d36dlp17t4up.R.inc(4133);avg_rounded = (int) Math.floor(avg);
        } }else {{
            __CLR4_4_136d36dlp17t4up.R.inc(4134);avg_rounded = (int) Math.ceil(avg);
        }
        }__CLR4_4_136d36dlp17t4up.R.inc(4135);return Integer.toBinaryString(avg_rounded);
    }finally{__CLR4_4_136d36dlp17t4up.R.flushNeeded();}}
}
