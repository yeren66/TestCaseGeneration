/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * You have to write a function which validates a given date string and
    returns True if the date is valid otherwise False.
    The date is valid if all of the following rules are satisfied:
    1. The date string is not empty.
    2. The number of days is not less than 1 or higher than 31 days for months 1,3,5,7,8,10,12. And the number of days is not less than 1 or higher than 30 days for months 4,6,9,11. And, the number of days is not less than 1 or higher than 29 for the month 2.
    3. The months should not be less than 1 or higher than 12.
    4. The date should be in the format: mm-dd-yyyy

    for example: 
    valid_date('03-11-2000') => True

    valid_date('15-01-2012') => False

    valid_date('04-0-2040') => False

    valid_date('06-04-2020') => True

    valid_date('06/04/2020') => False
 */

public class VALID_DATE {public static class __CLR4_4_11pi1pilp17t4cj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,2251,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static boolean valid_date(String date) {try{__CLR4_4_11pi1pilp17t4cj.R.inc(2214);
        __CLR4_4_11pi1pilp17t4cj.R.inc(2215);try {
            __CLR4_4_11pi1pilp17t4cj.R.inc(2216);date = date.trim();
            __CLR4_4_11pi1pilp17t4cj.R.inc(2217);String[] date_info = date.split("-");
            __CLR4_4_11pi1pilp17t4cj.R.inc(2218);if((((date_info.length > 3)&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2219)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2220)==0&false))) {__CLR4_4_11pi1pilp17t4cj.R.inc(2221);return false;
            }__CLR4_4_11pi1pilp17t4cj.R.inc(2222);int month = Integer.parseInt(date_info[0]);
            __CLR4_4_11pi1pilp17t4cj.R.inc(2223);int day = Integer.parseInt(date_info[1]);
            __CLR4_4_11pi1pilp17t4cj.R.inc(2224);int year = Integer.parseInt(date_info[2]);

            __CLR4_4_11pi1pilp17t4cj.R.inc(2225);if((((month < 1 || month > 12)&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2226)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2227)==0&false))) {__CLR4_4_11pi1pilp17t4cj.R.inc(2228);return false;

            }__CLR4_4_11pi1pilp17t4cj.R.inc(2229);int[] month_check1 = {1, 3, 5, 7, 8, 10, 12};
            __CLR4_4_11pi1pilp17t4cj.R.inc(2230);for(int i = 0; (((i < month_check1.length)&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2231)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2232)==0&false)); i++) {{
                __CLR4_4_11pi1pilp17t4cj.R.inc(2233);if((((month != month_check1[i] && !(day < 1 || day > 31))&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2234)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2235)==0&false))) {__CLR4_4_11pi1pilp17t4cj.R.inc(2236);return false;
            }}

            }__CLR4_4_11pi1pilp17t4cj.R.inc(2237);int[] month_check2 = {4, 6, 9, 11};
            __CLR4_4_11pi1pilp17t4cj.R.inc(2238);for(int i = 0; (((i < month_check2.length)&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2239)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2240)==0&false)); i++) {{
                __CLR4_4_11pi1pilp17t4cj.R.inc(2241);if((((month == month_check2[i] && (day < 1 || day > 30))&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2242)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2243)==0&false))) {__CLR4_4_11pi1pilp17t4cj.R.inc(2244);return false;
            }}
            }__CLR4_4_11pi1pilp17t4cj.R.inc(2245);if((((month == 2 && (day < 1 || day > 29))&&(__CLR4_4_11pi1pilp17t4cj.R.iget(2246)!=0|true))||(__CLR4_4_11pi1pilp17t4cj.R.iget(2247)==0&false))) {__CLR4_4_11pi1pilp17t4cj.R.inc(2248);return false;
        }} catch (Exception e) {
            __CLR4_4_11pi1pilp17t4cj.R.inc(2249);return false;
        }
        __CLR4_4_11pi1pilp17t4cj.R.inc(2250);return true;
    }finally{__CLR4_4_11pi1pilp17t4cj.R.flushNeeded();}}
}