/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * You are given two intervals,
    where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    The given intervals are closed which means that the interval (start, end)
    includes both start and end.
    For each given interval, it is assumed that its start is less or equal its end.
    Your task is to determine whether the length of intersection of these two 
    intervals is a prime number.
    Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    which its length is 1, which not a prime number.
    If the length of the intersection is a prime number, return "YES",
    otherwise, return "NO".
    If the two intervals don't intersect, return "NO".


    [input/output] samples:
    intersection((1, 2), (2, 3)) ==> "NO"
    intersection((-1, 1), (0, 4)) ==> "NO"
    intersection((-3, -1), (-5, 5)) ==> "YES"
 */

public class INTERSECTION {public static class __CLR4_4_1q2q2lp17t3x3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_prime(int num) {try{__CLR4_4_1q2q2lp17t3x3.R.inc(938);
        __CLR4_4_1q2q2lp17t3x3.R.inc(939);if((((num == 0 || num == 1)&&(__CLR4_4_1q2q2lp17t3x3.R.iget(940)!=0|true))||(__CLR4_4_1q2q2lp17t3x3.R.iget(941)==0&false))) {__CLR4_4_1q2q2lp17t3x3.R.inc(942);return false;
        }__CLR4_4_1q2q2lp17t3x3.R.inc(943);if((((num == 2)&&(__CLR4_4_1q2q2lp17t3x3.R.iget(944)!=0|true))||(__CLR4_4_1q2q2lp17t3x3.R.iget(945)==0&false))) {__CLR4_4_1q2q2lp17t3x3.R.inc(946);return true;
        }__CLR4_4_1q2q2lp17t3x3.R.inc(947);for(int i = 2; (((i <= num)&&(__CLR4_4_1q2q2lp17t3x3.R.iget(948)!=0|true))||(__CLR4_4_1q2q2lp17t3x3.R.iget(949)==0&false)); i++) {{
            __CLR4_4_1q2q2lp17t3x3.R.inc(950);if(((((num % i) == 0)&&(__CLR4_4_1q2q2lp17t3x3.R.iget(951)!=0|true))||(__CLR4_4_1q2q2lp17t3x3.R.iget(952)==0&false))) {__CLR4_4_1q2q2lp17t3x3.R.inc(953);return false;
        }}
        }__CLR4_4_1q2q2lp17t3x3.R.inc(954);return true;
    }finally{__CLR4_4_1q2q2lp17t3x3.R.flushNeeded();}}
    public static String intersection(int[] interval1, int[] interval2) {try{__CLR4_4_1q2q2lp17t3x3.R.inc(955);
        __CLR4_4_1q2q2lp17t3x3.R.inc(956);int l = Math.min(interval1[0], interval2[0]);
        __CLR4_4_1q2q2lp17t3x3.R.inc(957);int r = Math.max(interval1[1], interval2[1]);
        __CLR4_4_1q2q2lp17t3x3.R.inc(958);int length = r - l;
        __CLR4_4_1q2q2lp17t3x3.R.inc(959);if((((length > 0 && is_prime(length))&&(__CLR4_4_1q2q2lp17t3x3.R.iget(960)!=0|true))||(__CLR4_4_1q2q2lp17t3x3.R.iget(961)==0&false))) {__CLR4_4_1q2q2lp17t3x3.R.inc(962);return "YES";
        }__CLR4_4_1q2q2lp17t3x3.R.inc(963);return "NO";
    }finally{__CLR4_4_1q2q2lp17t3x3.R.flushNeeded();}}
}
