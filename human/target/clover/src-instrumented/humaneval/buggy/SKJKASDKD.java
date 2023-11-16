/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

// You are given a list of integers.
// You need to find the largest prime value and return the sum of its digits.

// Examples:
// For lst = [0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3] the output should be 10
// For lst = [1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1] the output should be 25
// For lst = [1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3] the output should be 13
// For lst = [0,724,32,71,99,32,6,0,5,91,83,0,5,6] the output should be 11
// For lst = [0,81,12,3,1,21] the output should be 3
// For lst = [0,8,1,2,1,7] the output should be 7

public class SKJKASDKD {public static class __CLR4_4_11e71e7lp0zmh8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1831,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_prime(int n) {try{__CLR4_4_11e71e7lp0zmh8m.R.inc(1807);
        __CLR4_4_11e71e7lp0zmh8m.R.inc(1808);for (int i = 2; (((i < (int)Math.pow(n, 0.5) + 1)&&(__CLR4_4_11e71e7lp0zmh8m.R.iget(1809)!=0|true))||(__CLR4_4_11e71e7lp0zmh8m.R.iget(1810)==0&false)); i += 1) {{
            __CLR4_4_11e71e7lp0zmh8m.R.inc(1811);if ((((n % i == 0)&&(__CLR4_4_11e71e7lp0zmh8m.R.iget(1812)!=0|true))||(__CLR4_4_11e71e7lp0zmh8m.R.iget(1813)==0&false))) {__CLR4_4_11e71e7lp0zmh8m.R.inc(1814);return false;
        }}
        }__CLR4_4_11e71e7lp0zmh8m.R.inc(1815);return true;
    }finally{__CLR4_4_11e71e7lp0zmh8m.R.flushNeeded();}}

    public static int skjkasdkd(int[] lst) {try{__CLR4_4_11e71e7lp0zmh8m.R.inc(1816);
        __CLR4_4_11e71e7lp0zmh8m.R.inc(1817);int max = 0;
        __CLR4_4_11e71e7lp0zmh8m.R.inc(1818);int i = 0;
        __CLR4_4_11e71e7lp0zmh8m.R.inc(1819);while((((i < lst.length)&&(__CLR4_4_11e71e7lp0zmh8m.R.iget(1820)!=0|true))||(__CLR4_4_11e71e7lp0zmh8m.R.iget(1821)==0&false))) {{
            __CLR4_4_11e71e7lp0zmh8m.R.inc(1822);if ((((lst[i] > max && is_prime(lst[i]))&&(__CLR4_4_11e71e7lp0zmh8m.R.iget(1823)!=0|true))||(__CLR4_4_11e71e7lp0zmh8m.R.iget(1824)==0&false)))
                {__CLR4_4_11e71e7lp0zmh8m.R.inc(1825);max = lst[i];
            }__CLR4_4_11e71e7lp0zmh8m.R.inc(1826);i += 1;
        }
        }__CLR4_4_11e71e7lp0zmh8m.R.inc(1827);int result = 0;
        __CLR4_4_11e71e7lp0zmh8m.R.inc(1828);for (char c : (max + "").toCharArray()) {{
            __CLR4_4_11e71e7lp0zmh8m.R.inc(1829);result += (int) c;
        }
        }__CLR4_4_11e71e7lp0zmh8m.R.inc(1830);return result;
    }finally{__CLR4_4_11e71e7lp0zmh8m.R.flushNeeded();}}
}
