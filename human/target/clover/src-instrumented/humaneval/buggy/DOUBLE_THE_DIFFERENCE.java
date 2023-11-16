/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/* Given a list of numbers, return the sum of squares of the numbers
in the list that are odd. Ignore numbers that are negative or not integers.

double_the_difference([1, 3, 2, 0]) == 1 + 9 + 0 + 0 = 10
double_the_difference([-1, -2, 0]) == 0
double_the_difference([9, -2]) == 81
double_the_difference([0]) == 0  

If the input list is empty, return 0. */

public class DOUBLE_THE_DIFFERENCE {public static class __CLR4_4_1c4c4lp0zmgvg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,448,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int double_the_difference(double[] lst) {try{__CLR4_4_1c4c4lp0zmgvg.R.inc(436);
        __CLR4_4_1c4c4lp0zmgvg.R.inc(437);int result = 0;
        __CLR4_4_1c4c4lp0zmgvg.R.inc(438);for (Double d : lst) {{
            __CLR4_4_1c4c4lp0zmgvg.R.inc(439);if (((((int) d.doubleValue() == d)&&(__CLR4_4_1c4c4lp0zmgvg.R.iget(440)!=0|true))||(__CLR4_4_1c4c4lp0zmgvg.R.iget(441)==0&false))) {{
                __CLR4_4_1c4c4lp0zmgvg.R.inc(442);int d_int = (int) d.doubleValue();
                __CLR4_4_1c4c4lp0zmgvg.R.inc(443);if ((((d_int % 2 == 1 && d_int >= 0)&&(__CLR4_4_1c4c4lp0zmgvg.R.iget(444)!=0|true))||(__CLR4_4_1c4c4lp0zmgvg.R.iget(445)==0&false))) {{
                    __CLR4_4_1c4c4lp0zmgvg.R.inc(446);result += d_int;
                }
            }}
        }}
        }__CLR4_4_1c4c4lp0zmgvg.R.inc(447);return result;
    }finally{__CLR4_4_1c4c4lp0zmgvg.R.flushNeeded();}}
}
