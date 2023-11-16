/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

import java.util.List;

// Write a function that accepts two lists of strings and returns the list that has 
// total number of chars in the all strings of the list less than the other list.

// if the two lists have the same number of chars, return the first list.

// Examples
// total_match([], []) \u279e []
// total_match(['hi', 'admin'], ['hI', 'Hi']) \u279e ['hI', 'Hi']
// total_match(['hi', 'admin'], ['hi', 'hi', 'admin', 'project']) \u279e ['hi', 'admin']
// total_match(['hi', 'admin'], ['hI', 'hi', 'hi']) \u279e ['hI', 'hi', 'hi']
// total_match(['4'], ['1', '2', '3', '4', '5']) \u279e ['4']

public class TOTAL_MATCH {public static class __CLR4_4_13iu3iulp0zmhr6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4578,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static List<String> total_match(List<String> lst1, List<String> lst2) {try{__CLR4_4_13iu3iulp0zmhr6.R.inc(4566);
        __CLR4_4_13iu3iulp0zmhr6.R.inc(4567);int l1 = 0;
        __CLR4_4_13iu3iulp0zmhr6.R.inc(4568);for (String st : lst1)
            {__CLR4_4_13iu3iulp0zmhr6.R.inc(4569);l1 += st.length();
        }__CLR4_4_13iu3iulp0zmhr6.R.inc(4570);int l2 = 0;
        __CLR4_4_13iu3iulp0zmhr6.R.inc(4571);for (String st : lst2)
            {__CLR4_4_13iu3iulp0zmhr6.R.inc(4572);l2 += st.length();
        
        }__CLR4_4_13iu3iulp0zmhr6.R.inc(4573);if ((((l1 <= l2)&&(__CLR4_4_13iu3iulp0zmhr6.R.iget(4574)!=0|true))||(__CLR4_4_13iu3iulp0zmhr6.R.iget(4575)==0&false)))
            {__CLR4_4_13iu3iulp0zmhr6.R.inc(4576);return lst1;
        }__CLR4_4_13iu3iulp0zmhr6.R.inc(4577);return lst2;
    }finally{__CLR4_4_13iu3iulp0zmhr6.R.flushNeeded();}}
}
