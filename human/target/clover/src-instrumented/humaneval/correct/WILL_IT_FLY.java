/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/* Write a function that returns True if the object q will fly, and False otherwise.
The object q will fly if it's balanced (it is a palindromic list) and the sum of its elements is less than or equal the maximum possible weight w.

Example:
will_it_fly([1, 2], 5) \u279e False 
# 1+2 is less than the maximum possible weight, but it's unbalanced.

will_it_fly([3, 2, 3], 1) \u279e False
# it's balanced, but 3+2+3 is more than the maximum possible weight.

will_it_fly([3, 2, 3], 9) \u279e True
# 3+2+3 is less than the maximum possible weight, and it's balanced.

will_it_fly([3], 5) \u279e True
# 3 is less than the maximum possible weight, and it's balanced. */

public class WILL_IT_FLY {public static class __CLR4_4_13mq3mqlp0zmhse{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4728,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean will_it_fly(int[] q, int w) {try{__CLR4_4_13mq3mqlp0zmhse.R.inc(4706);
        __CLR4_4_13mq3mqlp0zmhse.R.inc(4707);int sum = 0;
        __CLR4_4_13mq3mqlp0zmhse.R.inc(4708);for (int i = 0; (((i < q.length)&&(__CLR4_4_13mq3mqlp0zmhse.R.iget(4709)!=0|true))||(__CLR4_4_13mq3mqlp0zmhse.R.iget(4710)==0&false)); i += 1)
            {__CLR4_4_13mq3mqlp0zmhse.R.inc(4711);sum += q[i];
        
        }__CLR4_4_13mq3mqlp0zmhse.R.inc(4712);if ((((sum > w)&&(__CLR4_4_13mq3mqlp0zmhse.R.iget(4713)!=0|true))||(__CLR4_4_13mq3mqlp0zmhse.R.iget(4714)==0&false)))
            {__CLR4_4_13mq3mqlp0zmhse.R.inc(4715);return false;
        
        }__CLR4_4_13mq3mqlp0zmhse.R.inc(4716);int i = 0;
        __CLR4_4_13mq3mqlp0zmhse.R.inc(4717);int j = q.length - 1;
        __CLR4_4_13mq3mqlp0zmhse.R.inc(4718);while ((((i < j)&&(__CLR4_4_13mq3mqlp0zmhse.R.iget(4719)!=0|true))||(__CLR4_4_13mq3mqlp0zmhse.R.iget(4720)==0&false))) {{
            __CLR4_4_13mq3mqlp0zmhse.R.inc(4721);if ((((q[i] != q[j])&&(__CLR4_4_13mq3mqlp0zmhse.R.iget(4722)!=0|true))||(__CLR4_4_13mq3mqlp0zmhse.R.iget(4723)==0&false)))   {__CLR4_4_13mq3mqlp0zmhse.R.inc(4724);return false;
            }__CLR4_4_13mq3mqlp0zmhse.R.inc(4725);i += 1;
            __CLR4_4_13mq3mqlp0zmhse.R.inc(4726);j -= 1;
        }
        }__CLR4_4_13mq3mqlp0zmhse.R.inc(4727);return true;
    }finally{__CLR4_4_13mq3mqlp0zmhse.R.flushNeeded();}}
}
