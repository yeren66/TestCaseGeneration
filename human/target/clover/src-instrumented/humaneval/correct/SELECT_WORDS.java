/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;

/*
 * Given a string s and a natural number n, you have been tasked to implement 
    a function that returns a list of all words from string s that contain exactly 
    n consonants, in order these words appear in the string s.
    If the string s is empty then the function should return an empty list.
    Note: you may assume the input string contains only letters and spaces.
    Examples:
    select_words("Mary had a little lamb", 4) ==> ["little"]
    select_words("Mary had a little lamb", 3) ==> ["Mary", "lamb"]
    select_words("simple white space", 2) ==> []
    select_words("Hello world", 4) ==> ["world"]
    select_words("Uncle sam", 3) ==> ["Uncle"]
 */

public class SELECT_WORDS {public static class __CLR4_4_137p37plp0zmhp0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<String> select_words(String s, int n) {try{__CLR4_4_137p37plp0zmhp0.R.inc(4165);
        __CLR4_4_137p37plp0zmhp0.R.inc(4166);ArrayList<String> result = new ArrayList<>();
        __CLR4_4_137p37plp0zmhp0.R.inc(4167);String[] words = s.split(" ");
        __CLR4_4_137p37plp0zmhp0.R.inc(4168);for(int i = 0; (((i < words.length)&&(__CLR4_4_137p37plp0zmhp0.R.iget(4169)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4170)==0&false)); i++) {{
            __CLR4_4_137p37plp0zmhp0.R.inc(4171);int num_consonants = 0;
            __CLR4_4_137p37plp0zmhp0.R.inc(4172);char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
            __CLR4_4_137p37plp0zmhp0.R.inc(4173);for(int j = 0; (((j < words[i].length())&&(__CLR4_4_137p37plp0zmhp0.R.iget(4174)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4175)==0&false)); j++) {{
                __CLR4_4_137p37plp0zmhp0.R.inc(4176);boolean consonant = true;
                __CLR4_4_137p37plp0zmhp0.R.inc(4177);for(int k = 0; (((k < vowels.length)&&(__CLR4_4_137p37plp0zmhp0.R.iget(4178)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4179)==0&false)); k++) {{
                    __CLR4_4_137p37plp0zmhp0.R.inc(4180);if((((vowels[k] == words[i].charAt(j))&&(__CLR4_4_137p37plp0zmhp0.R.iget(4181)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4182)==0&false))) {{
                        __CLR4_4_137p37plp0zmhp0.R.inc(4183);consonant = false;
                        __CLR4_4_137p37plp0zmhp0.R.inc(4184);break;
                    }
                }}
                }__CLR4_4_137p37plp0zmhp0.R.inc(4185);if((((consonant)&&(__CLR4_4_137p37plp0zmhp0.R.iget(4186)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4187)==0&false))) {__CLR4_4_137p37plp0zmhp0.R.inc(4188);num_consonants++;
            }}
            }__CLR4_4_137p37plp0zmhp0.R.inc(4189);if((((num_consonants == n)&&(__CLR4_4_137p37plp0zmhp0.R.iget(4190)!=0|true))||(__CLR4_4_137p37plp0zmhp0.R.iget(4191)==0&false))) {__CLR4_4_137p37plp0zmhp0.R.inc(4192);result.add(words[i]);
        }}
        }__CLR4_4_137p37plp0zmhp0.R.inc(4193);return result;
    }finally{__CLR4_4_137p37plp0zmhp0.R.flushNeeded();}}
}
