/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/* Given an array representing a branch of a tree that has non-negative integer nodes
your task is to pluck one of the nodes and return it.
The plucked node should be the node with the smallest even value.
If multiple nodes with the same smallest even value are found return the node that has smallest index.

The plucked node should be returned in a list, [ smalest_value, its index ],
If there are no even values or the given array is empty, return [].

Example 1:
    Input: [4,2,3]
    Output: [2, 1]
    Explanation: 2 has the smallest even value, and 2 has the smallest index.

Example 2:
    Input: [1,2,3]
    Output: [2, 1]
    Explanation: 2 has the smallest even value, and 2 has the smallest index. 

Example 3:
    Input: []
    Output: []

Example 4:
    Input: [5, 0, 3, 0, 4, 2]
    Output: [0, 1]
    Explanation: 0 is the smallest value, but  there are two zeros,
                    so we will choose the first zero, which has the smallest index.

Constraints:
    * 1 <= nodes.length <= 10000
    * 0 <= node.value */

public class PLUCK {public static class __CLR4_4_1320320lp0zmho2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3976,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] pluck(int[] arr) {try{__CLR4_4_1320320lp0zmho2.R.inc(3960);
        __CLR4_4_1320320lp0zmho2.R.inc(3961);int min_even = Integer.MAX_VALUE;
        __CLR4_4_1320320lp0zmho2.R.inc(3962);int index = -1;

        __CLR4_4_1320320lp0zmho2.R.inc(3963);for (int i = 0; (((i < arr.length)&&(__CLR4_4_1320320lp0zmho2.R.iget(3964)!=0|true))||(__CLR4_4_1320320lp0zmho2.R.iget(3965)==0&false)); i += 1) {{
            __CLR4_4_1320320lp0zmho2.R.inc(3966);if ((((arr[i] % 2 == 0 && arr[i] < min_even)&&(__CLR4_4_1320320lp0zmho2.R.iget(3967)!=0|true))||(__CLR4_4_1320320lp0zmho2.R.iget(3968)==0&false))) {{
                __CLR4_4_1320320lp0zmho2.R.inc(3969);min_even = arr[i];
                __CLR4_4_1320320lp0zmho2.R.inc(3970);index = i;
            }
        }}
        }__CLR4_4_1320320lp0zmho2.R.inc(3971);if ((((index == -1)&&(__CLR4_4_1320320lp0zmho2.R.iget(3972)!=0|true))||(__CLR4_4_1320320lp0zmho2.R.iget(3973)==0&false)))
            {__CLR4_4_1320320lp0zmho2.R.inc(3974);return new int[]{};
        }__CLR4_4_1320320lp0zmho2.R.inc(3975);return new int[] {min_even, index};
    }finally{__CLR4_4_1320320lp0zmho2.R.flushNeeded();}}
}
