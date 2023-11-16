/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

// You will be given the name of a class (a string) and a list of extensions.
// The extensions are to be used to load additional classes to the class. The
// strength of the extension is as follows: Let CAP be the number of the uppercase
// letters in the extension's name, and let SM be the number of lowercase letters 
// in the extension's name, the strength is given by the fraction CAP - SM. 
// You should find the strongest extension and return a string in this 
// format: ClassName.StrongestExtensionName.
// If there are two or more extensions with the same strength, you should
// choose the one that comes first in the list.
// For example, if you are given "Slices" as the class and a list of the
// extensions: ['SErviNGSliCes', 'Cheese', 'StuFfed'] then you should
// return 'Slices.SErviNGSliCes' since 'SErviNGSliCes' is the strongest extension 
// (its strength is -1).
// Example:
// for Strongest_Extension('my_class', ['AA', 'Be', 'CC']) == 'my_class.AA'

public class STRONGEST_EXTENSION {public static class __CLR4_4_13hf3hflp0zmhqq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,4536,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String strongest_extension(String class_name, String[] extensions) {try{__CLR4_4_13hf3hflp0zmhqq.R.inc(4515);
        __CLR4_4_13hf3hflp0zmhqq.R.inc(4516);String strong = null;
        __CLR4_4_13hf3hflp0zmhqq.R.inc(4517);int val = Integer.MIN_VALUE;

        __CLR4_4_13hf3hflp0zmhqq.R.inc(4518);for (String s : extensions) {{
            __CLR4_4_13hf3hflp0zmhqq.R.inc(4519);int CAP = 0;
            __CLR4_4_13hf3hflp0zmhqq.R.inc(4520);int SM = 0;
            __CLR4_4_13hf3hflp0zmhqq.R.inc(4521);for (char c : s.toCharArray()) {{
                __CLR4_4_13hf3hflp0zmhqq.R.inc(4522);if ((((Character.toUpperCase(c) == c)&&(__CLR4_4_13hf3hflp0zmhqq.R.iget(4523)!=0|true))||(__CLR4_4_13hf3hflp0zmhqq.R.iget(4524)==0&false))) {__CLR4_4_13hf3hflp0zmhqq.R.inc(4525);CAP += 1;
                }__CLR4_4_13hf3hflp0zmhqq.R.inc(4526);if ((((Character.toLowerCase(c) == c)&&(__CLR4_4_13hf3hflp0zmhqq.R.iget(4527)!=0|true))||(__CLR4_4_13hf3hflp0zmhqq.R.iget(4528)==0&false))) {__CLR4_4_13hf3hflp0zmhqq.R.inc(4529);SM += 1;
            }}
            }__CLR4_4_13hf3hflp0zmhqq.R.inc(4530);if ((((CAP - SM > val)&&(__CLR4_4_13hf3hflp0zmhqq.R.iget(4531)!=0|true))||(__CLR4_4_13hf3hflp0zmhqq.R.iget(4532)==0&false))) {{
                __CLR4_4_13hf3hflp0zmhqq.R.inc(4533);val = CAP - SM;
                __CLR4_4_13hf3hflp0zmhqq.R.inc(4534);strong = s;
            }
        }}
        }__CLR4_4_13hf3hflp0zmhqq.R.inc(4535);return class_name + "." + strong;
    }finally{__CLR4_4_13hf3hflp0zmhqq.R.flushNeeded();}}
}
