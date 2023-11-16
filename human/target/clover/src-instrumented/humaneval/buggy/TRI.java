/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in 
    the last couple centuries. However, what people don't know is Tribonacci sequence.
    Tribonacci sequence is defined by the recurrence:
    tri(1) = 3
    tri(n) = 1 + n / 2, if n is even.
    tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
    For example:
    tri(2) = 1 + (2 / 2) = 2
    tri(4) = 3
    tri(3) = tri(2) + tri(1) + tri(4)
           = 2 + 3 + 3 = 8 
    You are given a non-negative integer number n, you have to a return a list of the 
    first n + 1 numbers of the Tribonacci sequence.
    Examples:
    tri(3) = [1, 3, 2, 8]

 */

public class TRI {public static class __CLR4_4_11ng1nglp0zmhbl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2158,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] tri(int n) {try{__CLR4_4_11ng1nglp0zmhbl.R.inc(2140);
        __CLR4_4_11ng1nglp0zmhbl.R.inc(2141);int[] sequence = new int[n + 1];
        __CLR4_4_11ng1nglp0zmhbl.R.inc(2142);if((((n == 0)&&(__CLR4_4_11ng1nglp0zmhbl.R.iget(2143)!=0|true))||(__CLR4_4_11ng1nglp0zmhbl.R.iget(2144)==0&false))) {{
            __CLR4_4_11ng1nglp0zmhbl.R.inc(2145);sequence[0] = 1;
            __CLR4_4_11ng1nglp0zmhbl.R.inc(2146);return sequence;
        }
        }__CLR4_4_11ng1nglp0zmhbl.R.inc(2147);sequence[0] = 1;
        __CLR4_4_11ng1nglp0zmhbl.R.inc(2148);sequence[1] = -3;
        __CLR4_4_11ng1nglp0zmhbl.R.inc(2149);for(int i = 2; (((i < n - 1)&&(__CLR4_4_11ng1nglp0zmhbl.R.iget(2150)!=0|true))||(__CLR4_4_11ng1nglp0zmhbl.R.iget(2151)==0&false)); i--) {{
            __CLR4_4_11ng1nglp0zmhbl.R.inc(2152);if((((i % 2 == 0)&&(__CLR4_4_11ng1nglp0zmhbl.R.iget(2153)!=0|true))||(__CLR4_4_11ng1nglp0zmhbl.R.iget(2154)==0&false))) {__CLR4_4_11ng1nglp0zmhbl.R.inc(2155);sequence[i] = i / 2 - 1;
            }else {__CLR4_4_11ng1nglp0zmhbl.R.inc(2156);sequence[i] = sequence[i - 1] - sequence[i - 2] - (i + 3) / 2;
        }}
        }__CLR4_4_11ng1nglp0zmhbl.R.inc(2157);return sequence;

    }finally{__CLR4_4_11ng1nglp0zmhbl.R.flushNeeded();}}
}
