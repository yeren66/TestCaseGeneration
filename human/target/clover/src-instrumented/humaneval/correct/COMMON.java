/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.*;

// Return sorted unique common elements for two lists.
// >>> common([1, 4, 3, 34, 653, 2, 5], [5, 7, 1, 5, 9, 653, 121])
// [1, 5, 653]
// >>> common([5, 3, 2, 8], [3, 2])
// [2, 3]

public class COMMON {public static class __CLR4_4_11yp1yplp0zmheb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2564,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] common(int[] l1, int[] l2) {try{__CLR4_4_11yp1yplp0zmheb.R.inc(2545);
        __CLR4_4_11yp1yplp0zmheb.R.inc(2546);HashSet<Integer> common = new HashSet<Integer>();
        
        __CLR4_4_11yp1yplp0zmheb.R.inc(2547);for (int i = 0; (((i < l1.length)&&(__CLR4_4_11yp1yplp0zmheb.R.iget(2548)!=0|true))||(__CLR4_4_11yp1yplp0zmheb.R.iget(2549)==0&false)); i += 1){{
            __CLR4_4_11yp1yplp0zmheb.R.inc(2550);for (int j = 0; (((j < l2.length)&&(__CLR4_4_11yp1yplp0zmheb.R.iget(2551)!=0|true))||(__CLR4_4_11yp1yplp0zmheb.R.iget(2552)==0&false)); j += 1){{
                __CLR4_4_11yp1yplp0zmheb.R.inc(2553);if ((((l1[i] == l2[j])&&(__CLR4_4_11yp1yplp0zmheb.R.iget(2554)!=0|true))||(__CLR4_4_11yp1yplp0zmheb.R.iget(2555)==0&false)))
                    {__CLR4_4_11yp1yplp0zmheb.R.inc(2556);common.add(l1[i]);
            }}
        }}
        }__CLR4_4_11yp1yplp0zmheb.R.inc(2557);int[] result = new int[common.size()];
        __CLR4_4_11yp1yplp0zmheb.R.inc(2558);int index = 0;
        __CLR4_4_11yp1yplp0zmheb.R.inc(2559);for (Integer c : common) {{
            __CLR4_4_11yp1yplp0zmheb.R.inc(2560);result[index] = c;
            __CLR4_4_11yp1yplp0zmheb.R.inc(2561);index += 1;
        }
        }__CLR4_4_11yp1yplp0zmheb.R.inc(2562);Arrays.sort(result);
        __CLR4_4_11yp1yplp0zmheb.R.inc(2563);return result;
    }finally{__CLR4_4_11yp1yplp0zmheb.R.flushNeeded();}}
}
