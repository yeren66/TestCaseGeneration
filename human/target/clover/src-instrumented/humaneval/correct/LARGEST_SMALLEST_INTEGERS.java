/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/*
 * Create a function that returns a tuple (a, b), where 'a' is
    the largest of negative integers, and 'b' is the smallest
    of positive integers in a list.
    If there is no negative or positive integers, return them as 0.

    Examples:
    largest_smallest_integers([2, 4, 1, 3, 5, 7]) == (None, 1)
    largest_smallest_integers([]) == (None, None)
    largest_smallest_integers([0]) == (None, None)
 */

public class LARGEST_SMALLEST_INTEGERS {public static class __CLR4_4_12ql2qllp0zmhkq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] largest_smallest_integers(int[] lst) {try{__CLR4_4_12ql2qllp0zmhkq.R.inc(3549);
        __CLR4_4_12ql2qllp0zmhkq.R.inc(3550);boolean negative = false, positive = false;
        __CLR4_4_12ql2qllp0zmhkq.R.inc(3551);int max_negative = Integer.MIN_VALUE, min_positive = Integer.MAX_VALUE; 
        __CLR4_4_12ql2qllp0zmhkq.R.inc(3552);for(int i = 0; (((i < lst.length)&&(__CLR4_4_12ql2qllp0zmhkq.R.iget(3553)!=0|true))||(__CLR4_4_12ql2qllp0zmhkq.R.iget(3554)==0&false)); i++) {{
            __CLR4_4_12ql2qllp0zmhkq.R.inc(3555);if((((lst[i] < 0)&&(__CLR4_4_12ql2qllp0zmhkq.R.iget(3556)!=0|true))||(__CLR4_4_12ql2qllp0zmhkq.R.iget(3557)==0&false))) {{
                __CLR4_4_12ql2qllp0zmhkq.R.inc(3558);negative = true;
                __CLR4_4_12ql2qllp0zmhkq.R.inc(3559);max_negative = Math.max(max_negative, lst[i]);
            } }else {__CLR4_4_12ql2qllp0zmhkq.R.inc(3560);if((((lst[i] > 0)&&(__CLR4_4_12ql2qllp0zmhkq.R.iget(3561)!=0|true))||(__CLR4_4_12ql2qllp0zmhkq.R.iget(3562)==0&false))) {{
                __CLR4_4_12ql2qllp0zmhkq.R.inc(3563);positive = true;
                __CLR4_4_12ql2qllp0zmhkq.R.inc(3564);min_positive = Math.min(min_positive, lst[i]);
            }
        }}}
        }__CLR4_4_12ql2qllp0zmhkq.R.inc(3565);if((((!negative)&&(__CLR4_4_12ql2qllp0zmhkq.R.iget(3566)!=0|true))||(__CLR4_4_12ql2qllp0zmhkq.R.iget(3567)==0&false))) {__CLR4_4_12ql2qllp0zmhkq.R.inc(3568);max_negative = 0;
        }__CLR4_4_12ql2qllp0zmhkq.R.inc(3569);if((((!positive)&&(__CLR4_4_12ql2qllp0zmhkq.R.iget(3570)!=0|true))||(__CLR4_4_12ql2qllp0zmhkq.R.iget(3571)==0&false))) {__CLR4_4_12ql2qllp0zmhkq.R.inc(3572);min_positive = 0;
        }__CLR4_4_12ql2qllp0zmhkq.R.inc(3573);int[] result = {max_negative, min_positive};
        __CLR4_4_12ql2qllp0zmhkq.R.inc(3574);return result;
    }finally{__CLR4_4_12ql2qllp0zmhkq.R.flushNeeded();}}
}
