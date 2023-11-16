/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/* Given a string text, replace all spaces in it with underscores, 
and if a string has more than 2 consecutive spaces, 
then replace all consecutive spaces with - 

fix_spaces("Example") == "Example"
fix_spaces("Example 1") == "Example_1"
fix_spaces(" Example 2") == "_Example_2"
fix_spaces(" Example   3") == "_Example-3" */

public class FIX_SPACES {public static class __CLR4_4_1jjjjlp17t3uq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,732,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String fix_spaces(String text) {try{__CLR4_4_1jjjjlp17t3uq.R.inc(703);
        __CLR4_4_1jjjjlp17t3uq.R.inc(704);String new_text = "";
        __CLR4_4_1jjjjlp17t3uq.R.inc(705);int i = 0;
        __CLR4_4_1jjjjlp17t3uq.R.inc(706);int start = 0;
        __CLR4_4_1jjjjlp17t3uq.R.inc(707);int end = 0;
        __CLR4_4_1jjjjlp17t3uq.R.inc(708);while ((((i < text.length())&&(__CLR4_4_1jjjjlp17t3uq.R.iget(709)!=0|true))||(__CLR4_4_1jjjjlp17t3uq.R.iget(710)==0&false))) {{
            __CLR4_4_1jjjjlp17t3uq.R.inc(711);if ((((text.charAt(i) == ' ')&&(__CLR4_4_1jjjjlp17t3uq.R.iget(712)!=0|true))||(__CLR4_4_1jjjjlp17t3uq.R.iget(713)==0&false))) {__CLR4_4_1jjjjlp17t3uq.R.inc(714);end += 1;
            }else {{
                __CLR4_4_1jjjjlp17t3uq.R.inc(715);if ((((end - start > 2)&&(__CLR4_4_1jjjjlp17t3uq.R.iget(716)!=0|true))||(__CLR4_4_1jjjjlp17t3uq.R.iget(717)==0&false))) {__CLR4_4_1jjjjlp17t3uq.R.inc(718);new_text += "-" + text.substring(i, i + 1);
                }else {__CLR4_4_1jjjjlp17t3uq.R.inc(719);if ((((end - start > 0)&&(__CLR4_4_1jjjjlp17t3uq.R.iget(720)!=0|true))||(__CLR4_4_1jjjjlp17t3uq.R.iget(721)==0&false))) {{
                    __CLR4_4_1jjjjlp17t3uq.R.inc(722);for (int j = start; (((j < end)&&(__CLR4_4_1jjjjlp17t3uq.R.iget(723)!=0|true))||(__CLR4_4_1jjjjlp17t3uq.R.iget(724)==0&false)); j += 1) {{
                        __CLR4_4_1jjjjlp17t3uq.R.inc(725);new_text += "_";
                    }
                    }__CLR4_4_1jjjjlp17t3uq.R.inc(726);new_text += text.substring(i, i + 1);
                } }else {{
                    __CLR4_4_1jjjjlp17t3uq.R.inc(727);new_text += text.substring(i, i + 1);
                }
                }}__CLR4_4_1jjjjlp17t3uq.R.inc(728);start = i + 1;
                __CLR4_4_1jjjjlp17t3uq.R.inc(729);end = i + 1;
            }
            }__CLR4_4_1jjjjlp17t3uq.R.inc(730);i += 1;
        }

        }__CLR4_4_1jjjjlp17t3uq.R.inc(731);return new_text;
    }finally{__CLR4_4_1jjjjlp17t3uq.R.flushNeeded();}}
}
