/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/* 
triples_sum_to_zero takes a list of integers as an input.
it returns True if there are three distinct elements in the list that
sum to zero, and False otherwise.

>>> triples_sum_to_zero([1, 3, 5, 0])
False
>>> triples_sum_to_zero([1, 3, -2, 1])
True
>>> triples_sum_to_zero([1, 2, 3, 7])
False
>>> triples_sum_to_zero([2, 4, -5, 3, 9, 7])
True
>>> triples_sum_to_zero([1])
False
*/

public class TRIPLES_SUM_TO_ZERO {public static class __CLR4_4_13k03k0lp17t4zy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,4623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean triples_sum_to_zero(int[] numbers) {try{__CLR4_4_13k03k0lp17t4zy.R.inc(4608);
        __CLR4_4_13k03k0lp17t4zy.R.inc(4609);for (int i = 0; (((i < numbers.length)&&(__CLR4_4_13k03k0lp17t4zy.R.iget(4610)!=0|true))||(__CLR4_4_13k03k0lp17t4zy.R.iget(4611)==0&false)); i += 1) {{
            __CLR4_4_13k03k0lp17t4zy.R.inc(4612);for (int j = i + 1; (((j < numbers.length)&&(__CLR4_4_13k03k0lp17t4zy.R.iget(4613)!=0|true))||(__CLR4_4_13k03k0lp17t4zy.R.iget(4614)==0&false)); j += 1) {{
                __CLR4_4_13k03k0lp17t4zy.R.inc(4615);for (int k = j + 1; (((k < numbers.length)&&(__CLR4_4_13k03k0lp17t4zy.R.iget(4616)!=0|true))||(__CLR4_4_13k03k0lp17t4zy.R.iget(4617)==0&false)); k += 1) {{
                    __CLR4_4_13k03k0lp17t4zy.R.inc(4618);if ((((numbers[i] + numbers[j] + numbers[k] == 0)&&(__CLR4_4_13k03k0lp17t4zy.R.iget(4619)!=0|true))||(__CLR4_4_13k03k0lp17t4zy.R.iget(4620)==0&false)))
                        {__CLR4_4_13k03k0lp17t4zy.R.inc(4621);return true;
                }}
            }}
        }}
        }__CLR4_4_13k03k0lp17t4zy.R.inc(4622);return false;
    }finally{__CLR4_4_13k03k0lp17t4zy.R.flushNeeded();}}
}
