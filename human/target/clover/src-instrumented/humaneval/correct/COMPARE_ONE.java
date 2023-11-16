/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

/*
 * Create a function that takes integers, floats, or strings representing
    real numbers, and returns the larger variable in its given variable type.
    Return None if the values are equal.
    Note: If a real number is represented as a string, the floating point might be . or ,

    compare_one(1, 2.5) \u279e 2.5
    compare_one(1, "2,3") \u279e "2,3"
    compare_one("5,1", "6") \u279e "6"
    compare_one("1", 1) \u279e None

 */

public class COMPARE_ONE {public static class __CLR4_4_11zf1zflp17t4fp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,2610,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static Object compare_one(Object a, Object b) {try{__CLR4_4_11zf1zflp17t4fp.R.inc(2571);
        __CLR4_4_11zf1zflp17t4fp.R.inc(2572);double temp_a = 0, temp_b = 0;
        __CLR4_4_11zf1zflp17t4fp.R.inc(2573);if((((a instanceof String)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2574)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2575)==0&false))) {{
            __CLR4_4_11zf1zflp17t4fp.R.inc(2576);String temp_a_string = a.toString();
            __CLR4_4_11zf1zflp17t4fp.R.inc(2577);temp_a_string = temp_a_string.replace(',', '.');
            __CLR4_4_11zf1zflp17t4fp.R.inc(2578);temp_a = Double.parseDouble(temp_a_string);
        }
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2579);if((((b instanceof String)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2580)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2581)==0&false))) {{
            __CLR4_4_11zf1zflp17t4fp.R.inc(2582);String temp_b_string = b.toString();
            __CLR4_4_11zf1zflp17t4fp.R.inc(2583);temp_b_string = temp_b_string.replace(',', '.');
            __CLR4_4_11zf1zflp17t4fp.R.inc(2584);temp_b = Double.parseDouble(temp_b_string);
        }
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2585);if((((a instanceof Double)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2586)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2587)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2588);temp_a = (Double) a;
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2589);if((((b instanceof Double)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2590)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2591)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2592);temp_b = (Double) b;
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2593);if((((a instanceof Integer)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2594)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2595)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2596);temp_a = ((Integer) a).doubleValue();
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2597);if((((b instanceof Integer)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2598)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2599)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2600);temp_b = ((Integer) b).doubleValue();
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2601);if((((temp_a == temp_b)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2602)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2603)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2604);return null;
        }__CLR4_4_11zf1zflp17t4fp.R.inc(2605);if((((temp_a > temp_b)&&(__CLR4_4_11zf1zflp17t4fp.R.iget(2606)!=0|true))||(__CLR4_4_11zf1zflp17t4fp.R.iget(2607)==0&false))) {__CLR4_4_11zf1zflp17t4fp.R.inc(2608);return a;
        }else {__CLR4_4_11zf1zflp17t4fp.R.inc(2609);return b;
    }}finally{__CLR4_4_11zf1zflp17t4fp.R.flushNeeded();}}
}
