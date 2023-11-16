/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* Given the lengths of the three sides of a triangle. Return the area of
the triangle rounded to 2 decimal points if the three sides form a valid triangle. 
Otherwise return -1
Three sides make a valid triangle when the sum of any two sides is greater 
than the third side.
Example:
triangle_area(3, 4, 5) == 6.00
triangle_area(1, 2, 10) == -1 */

public class TRIANGLE_AREA_2 {public static class __CLR4_4_13jq3jqlp0zmhrg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4608,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static double triangle_area_2(double a, double b, double c) {try{__CLR4_4_13jq3jqlp0zmhrg.R.inc(4598);
        __CLR4_4_13jq3jqlp0zmhrg.R.inc(4599);if ((((a + b <= c || a + c <= b || b + c <= a)&&(__CLR4_4_13jq3jqlp0zmhrg.R.iget(4600)!=0|true))||(__CLR4_4_13jq3jqlp0zmhrg.R.iget(4601)==0&false)))
            {__CLR4_4_13jq3jqlp0zmhrg.R.inc(4602);return -1;
        
        }__CLR4_4_13jq3jqlp0zmhrg.R.inc(4603);double s = (a + b + c) / 2.;
        __CLR4_4_13jq3jqlp0zmhrg.R.inc(4604);double result = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        
        __CLR4_4_13jq3jqlp0zmhrg.R.inc(4605);BigDecimal bd = BigDecimal.valueOf(result);
        __CLR4_4_13jq3jqlp0zmhrg.R.inc(4606);bd = bd.setScale(2, RoundingMode.HALF_UP);
        __CLR4_4_13jq3jqlp0zmhrg.R.inc(4607);return bd.doubleValue();
    }finally{__CLR4_4_13jq3jqlp0zmhrg.R.flushNeeded();}}
}
