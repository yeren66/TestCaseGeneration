/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given a positive integer n, return a tuple that has the number of even and odd
    integer palindromes that fall within the range(1, n), inclusive.

    Example 1:

        Input: 3
        Output: (1, 2)
        Explanation:
        Integer palindrome are 1, 2, 3. one of them is even, and two of them are odd.

    Example 2:

        Input: 12
        Output: (4, 6)
        Explanation:
        Integer palindrome are 1, 2, 3, 4, 5, 6, 7, 8, 9, 11. four of them are even, and 6 of them are odd.

    Note:
        1. 1 <= n <= 10^3
        2. returned tuple has the number of even and odd integer palindromes respectively.
 */

public class EVEN_ODD_PALINDROME {public static class __CLR4_4_126t26tlp0zmhg8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,2860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean is_palindrome(int n) {try{__CLR4_4_126t26tlp0zmhg8.R.inc(2837);
        __CLR4_4_126t26tlp0zmhg8.R.inc(2838);String n_str = Integer.toString(n);
        __CLR4_4_126t26tlp0zmhg8.R.inc(2839);String n_str_rev = "";
        __CLR4_4_126t26tlp0zmhg8.R.inc(2840);for(int i = n_str.length() - 1; (((i >= 0)&&(__CLR4_4_126t26tlp0zmhg8.R.iget(2841)!=0|true))||(__CLR4_4_126t26tlp0zmhg8.R.iget(2842)==0&false)); i--) {{
            __CLR4_4_126t26tlp0zmhg8.R.inc(2843);n_str_rev += n_str.substring(i, i + 1);
        }
        }__CLR4_4_126t26tlp0zmhg8.R.inc(2844);return n_str.equals(n_str_rev);
    }finally{__CLR4_4_126t26tlp0zmhg8.R.flushNeeded();}}

    public static ArrayList<Integer> even_odd_palindrome(int n) {try{__CLR4_4_126t26tlp0zmhg8.R.inc(2845);
        __CLR4_4_126t26tlp0zmhg8.R.inc(2846);int even_palindrome_count = 0, odd_palindrome_count = 0;
        __CLR4_4_126t26tlp0zmhg8.R.inc(2847);for(int i = 1; (((i <= n)&&(__CLR4_4_126t26tlp0zmhg8.R.iget(2848)!=0|true))||(__CLR4_4_126t26tlp0zmhg8.R.iget(2849)==0&false)); i++) {{
            __CLR4_4_126t26tlp0zmhg8.R.inc(2850);if(((((i % 2) == 1 && is_palindrome(i))&&(__CLR4_4_126t26tlp0zmhg8.R.iget(2851)!=0|true))||(__CLR4_4_126t26tlp0zmhg8.R.iget(2852)==0&false))) {__CLR4_4_126t26tlp0zmhg8.R.inc(2853);odd_palindrome_count++;
            }else {__CLR4_4_126t26tlp0zmhg8.R.inc(2854);if(((((i % 2) == 0 && is_palindrome(i))&&(__CLR4_4_126t26tlp0zmhg8.R.iget(2855)!=0|true))||(__CLR4_4_126t26tlp0zmhg8.R.iget(2856)==0&false))) {__CLR4_4_126t26tlp0zmhg8.R.inc(2857);even_palindrome_count++;
        }}}
        }__CLR4_4_126t26tlp0zmhg8.R.inc(2858);ArrayList<Integer> result = new ArrayList<>(Arrays.asList(even_palindrome_count, odd_palindrome_count));
        __CLR4_4_126t26tlp0zmhg8.R.inc(2859);return result;
    }finally{__CLR4_4_126t26tlp0zmhg8.R.flushNeeded();}}
}