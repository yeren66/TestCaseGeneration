/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * You are given an array arr of integers and you need to return
    sum of magnitudes of integers multiplied by product of all signs
    of each number in the array, represented by 1, -1 or 0.
    Note: return -10 for empty arr.

    Example:
    >>> prod_signs([1, 2, 2, -4]) == -9
    >>> prod_signs([0, 1]) == 0
    >>> prod_signs([]) == -10
 */

public class PROD_SIGNS {public static class __CLR4_4_118q18qlp0zmh79{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,1633,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int prod_signs(int[] arr) {try{__CLR4_4_118q18qlp0zmh79.R.inc(1610);
        __CLR4_4_118q18qlp0zmh79.R.inc(1611);if((((arr.length == 0)&&(__CLR4_4_118q18qlp0zmh79.R.iget(1612)!=0|true))||(__CLR4_4_118q18qlp0zmh79.R.iget(1613)==0&false))) {__CLR4_4_118q18qlp0zmh79.R.inc(1614);return -10;
        }__CLR4_4_118q18qlp0zmh79.R.inc(1615);int prod = 1;
        __CLR4_4_118q18qlp0zmh79.R.inc(1616);for(int i = 0; (((i < arr.length)&&(__CLR4_4_118q18qlp0zmh79.R.iget(1617)!=0|true))||(__CLR4_4_118q18qlp0zmh79.R.iget(1618)==0&false)); i++) {{
            __CLR4_4_118q18qlp0zmh79.R.inc(1619);if((((arr[i] == 0)&&(__CLR4_4_118q18qlp0zmh79.R.iget(1620)!=0|true))||(__CLR4_4_118q18qlp0zmh79.R.iget(1621)==0&false))) {__CLR4_4_118q18qlp0zmh79.R.inc(1622);prod = 0;
            }else {__CLR4_4_118q18qlp0zmh79.R.inc(1623);if((((arr[i] > 0)&&(__CLR4_4_118q18qlp0zmh79.R.iget(1624)!=0|true))||(__CLR4_4_118q18qlp0zmh79.R.iget(1625)==0&false))) {__CLR4_4_118q18qlp0zmh79.R.inc(1626);prod *= 1;
        }}}
        }__CLR4_4_118q18qlp0zmh79.R.inc(1627);int sum = 0;
        __CLR4_4_118q18qlp0zmh79.R.inc(1628);for(int i = 0; (((i < arr.length)&&(__CLR4_4_118q18qlp0zmh79.R.iget(1629)!=0|true))||(__CLR4_4_118q18qlp0zmh79.R.iget(1630)==0&false)); i++) {{
            __CLR4_4_118q18qlp0zmh79.R.inc(1631);sum += Math.abs(arr[i]);
        }
        }__CLR4_4_118q18qlp0zmh79.R.inc(1632);return prod * sum;
    }finally{__CLR4_4_118q18qlp0zmh79.R.flushNeeded();}}
}
