/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/* Create a function which takes a string representing a file's name, and returns
'Yes' if the the file's name is valid, and returns 'No' otherwise.
A file's name is considered to be valid if and only if all the following conditions 
are met:
- There should not be more than three digits ('0'-'9') in the file's name.
- The file's name contains exactly one dot '.'
- The substring before the dot should not be empty, and it starts with a letter from 
the latin alphapet ('a'-'z' and 'A'-'Z').
- The substring after the dot should be one of these: ['txt', 'exe', 'dll']
Examples:
file_name_check("example.txt") # => 'Yes'
file_name_check("1example.dll") # => 'No' (the name should start with a latin alphapet letter) */

public class FILE_NAME_CHECK {public static class __CLR4_4_129z29zlp0zmhgw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2980,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String file_name_check(String file_name) {try{__CLR4_4_129z29zlp0zmhgw.R.inc(2951);
        __CLR4_4_129z29zlp0zmhgw.R.inc(2952);String[] lst = file_name.split("\\.");

        __CLR4_4_129z29zlp0zmhgw.R.inc(2953);if ((((lst.length != 2)&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2954)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2955)==0&false)))
            {__CLR4_4_129z29zlp0zmhgw.R.inc(2956);return "No";
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2957);if ((((! (lst[1].equals("txt") || lst[1].equals("exe") || lst[1].equals("dll")))&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2958)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2959)==0&false)))
            {__CLR4_4_129z29zlp0zmhgw.R.inc(2960);return "No";
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2961);if ((((lst[0].length() == 0)&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2962)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2963)==0&false)))
            {__CLR4_4_129z29zlp0zmhgw.R.inc(2964);return "No";
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2965);if ((((! (('a' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'z') || ('A' <= lst[0].charAt(0) && lst[0].charAt(0) <= 'Z')))&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2966)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2967)==0&false)))
            {__CLR4_4_129z29zlp0zmhgw.R.inc(2968);return "No";
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2969);int digit_cnt = 0;
        __CLR4_4_129z29zlp0zmhgw.R.inc(2970);for (char c : file_name.toCharArray()){{
            __CLR4_4_129z29zlp0zmhgw.R.inc(2971);if (((('0' <= c && c <= '9')&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2972)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2973)==0&false)))
                {__CLR4_4_129z29zlp0zmhgw.R.inc(2974);digit_cnt += 1;
        }}
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2975);if ((((digit_cnt > 3)&&(__CLR4_4_129z29zlp0zmhgw.R.iget(2976)!=0|true))||(__CLR4_4_129z29zlp0zmhgw.R.iget(2977)==0&false)))  {__CLR4_4_129z29zlp0zmhgw.R.inc(2978);return "No";
        }__CLR4_4_129z29zlp0zmhgw.R.inc(2979);return "Yes";
    }finally{__CLR4_4_129z29zlp0zmhgw.R.flushNeeded();}}
}
