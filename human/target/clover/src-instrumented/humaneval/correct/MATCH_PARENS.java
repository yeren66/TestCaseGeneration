/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/*
 * You are given a list of two strings, both strings consist of open
    parentheses '(' or close parentheses ')' only.
    Your job is to check if it is possible to concatenate the two strings in
    some order, that the resulting string will be good.
    A string S is considered to be good if and only if all parentheses in S
    are balanced. For example: the string '(())()' is good, while the string
    '())' is not.
    Return 'Yes' if there's a way to make a good string, and return 'No' otherwise.

    Examples:
    match_parens(['()(', ')']) == 'Yes'
    match_parens([')', ')']) == 'No'
 */

public class MATCH_PARENS {public static class __CLR4_4_12sk2sklp0zmhl3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3643,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean check(String s) {try{__CLR4_4_12sk2sklp0zmhl3.R.inc(3620);
        __CLR4_4_12sk2sklp0zmhl3.R.inc(3621);int val = 0;
        __CLR4_4_12sk2sklp0zmhl3.R.inc(3622);for(int i = 0; (((i < s.length())&&(__CLR4_4_12sk2sklp0zmhl3.R.iget(3623)!=0|true))||(__CLR4_4_12sk2sklp0zmhl3.R.iget(3624)==0&false)); i++) {{
            __CLR4_4_12sk2sklp0zmhl3.R.inc(3625);if((((s.charAt(i) == '(')&&(__CLR4_4_12sk2sklp0zmhl3.R.iget(3626)!=0|true))||(__CLR4_4_12sk2sklp0zmhl3.R.iget(3627)==0&false))) {__CLR4_4_12sk2sklp0zmhl3.R.inc(3628);val++;
            }else {__CLR4_4_12sk2sklp0zmhl3.R.inc(3629);val--;
            }__CLR4_4_12sk2sklp0zmhl3.R.inc(3630);if((((val < 0)&&(__CLR4_4_12sk2sklp0zmhl3.R.iget(3631)!=0|true))||(__CLR4_4_12sk2sklp0zmhl3.R.iget(3632)==0&false))) {__CLR4_4_12sk2sklp0zmhl3.R.inc(3633);return false;
        }}
        }__CLR4_4_12sk2sklp0zmhl3.R.inc(3634);return val == 0;
    }finally{__CLR4_4_12sk2sklp0zmhl3.R.flushNeeded();}}
    public static String match_parens(String[] lst) {try{__CLR4_4_12sk2sklp0zmhl3.R.inc(3635);
        __CLR4_4_12sk2sklp0zmhl3.R.inc(3636);String S1 = lst[0] + lst[1];
        __CLR4_4_12sk2sklp0zmhl3.R.inc(3637);String S2 = lst[1] + lst[0];
        __CLR4_4_12sk2sklp0zmhl3.R.inc(3638);if((((check(S1) || check(S2))&&(__CLR4_4_12sk2sklp0zmhl3.R.iget(3639)!=0|true))||(__CLR4_4_12sk2sklp0zmhl3.R.iget(3640)==0&false))) {__CLR4_4_12sk2sklp0zmhl3.R.inc(3641);return "Yes";
        }__CLR4_4_12sk2sklp0zmhl3.R.inc(3642);return "No";
    }finally{__CLR4_4_12sk2sklp0zmhl3.R.flushNeeded();}}
}
