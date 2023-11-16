/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;

/*
 * We are given two strings s and c, you have to deleted all the characters in s that are equal to any character in c
    then check if the result string is palindrome.
    A string is called palindrome if it reads the same backward as forward.
    You should return a tuple containing the result string and True/False for the check.
    Example
    For s = "abcde", c = "ae", the result should be ('bcd',False)
    For s = "abcdef", c = "b"  the result should be ('acdef',False)
    For s = "abcdedcba", c = "ab", the result should be ('cdedc',True)
 */

public class REVERSE_DELETE {public static class __CLR4_4_135i35ilp0zmhoi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static ArrayList<Object> reverse_delete(String s, String c) {try{__CLR4_4_135i35ilp0zmhoi.R.inc(4086);
        __CLR4_4_135i35ilp0zmhoi.R.inc(4087);String new_s = "";
        __CLR4_4_135i35ilp0zmhoi.R.inc(4088);for(int i = 0; (((i < s.length())&&(__CLR4_4_135i35ilp0zmhoi.R.iget(4089)!=0|true))||(__CLR4_4_135i35ilp0zmhoi.R.iget(4090)==0&false)); i++) {{
            __CLR4_4_135i35ilp0zmhoi.R.inc(4091);if((((c.indexOf(s.charAt(i)) == -1)&&(__CLR4_4_135i35ilp0zmhoi.R.iget(4092)!=0|true))||(__CLR4_4_135i35ilp0zmhoi.R.iget(4093)==0&false))) {{
                __CLR4_4_135i35ilp0zmhoi.R.inc(4094);new_s += s.charAt(i);
            }
        }}
        }__CLR4_4_135i35ilp0zmhoi.R.inc(4095);String reverse_s = "";
        __CLR4_4_135i35ilp0zmhoi.R.inc(4096);for(int i = new_s.length() - 1; (((i >= 0)&&(__CLR4_4_135i35ilp0zmhoi.R.iget(4097)!=0|true))||(__CLR4_4_135i35ilp0zmhoi.R.iget(4098)==0&false)); i--) {{
            __CLR4_4_135i35ilp0zmhoi.R.inc(4099);reverse_s += new_s.charAt(i);
        }
        }__CLR4_4_135i35ilp0zmhoi.R.inc(4100);ArrayList<Object> res = new ArrayList<>();
        __CLR4_4_135i35ilp0zmhoi.R.inc(4101);res.add(new_s);
        __CLR4_4_135i35ilp0zmhoi.R.inc(4102);res.add(reverse_s.equals(new_s));
        __CLR4_4_135i35ilp0zmhoi.R.inc(4103);return res;
    }finally{__CLR4_4_135i35ilp0zmhoi.R.flushNeeded();}}
}
