/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.correct;

// It is the last week of the semester and the teacher has to give the grades
// to students. The teacher has been making her own algorithm for grading.
// The only problem is, she has lost the code she used for grading.
// She has given you a list of GPAs for some students and you have to write 
// a function that can output a list of letter grades using the following table:
//             GPA       |    Letter grade
//             4.0                A+
//           > 3.7                A 
//           > 3.3                A- 
//           > 3.0                B+
//           > 2.7                B 
//           > 2.3                B-
//           > 2.0                C+
//           > 1.7                C
//           > 1.3                C-
//           > 1.0                D+ 
//           > 0.7                D 
//           > 0.0                D-
//             0.0                E
// Example:
// grade_equation([4.0, 3, 1.7, 2, 3.5]) ==> ['A+', 'B', 'C-', 'C', 'A-']

public class NUMERICAL_LETTER_GRADE {public static class __CLR4_4_12xw2xwlp0zmhm5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700126838721L,8589935092L,3868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String[] numerical_letter_grade(double[] grades) {try{__CLR4_4_12xw2xwlp0zmhm5.R.inc(3812);
        __CLR4_4_12xw2xwlp0zmhm5.R.inc(3813);String[] letter_grade = new String[grades.length];

        __CLR4_4_12xw2xwlp0zmhm5.R.inc(3814);for (int i = 0; (((i < grades.length)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3815)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3816)==0&false)); i += 1) {{
            __CLR4_4_12xw2xwlp0zmhm5.R.inc(3817);double gpa = grades[i];
            __CLR4_4_12xw2xwlp0zmhm5.R.inc(3818);if ((((gpa == 4.0)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3819)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3820)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3821);letter_grade[i] = "A+";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3822);if ((((gpa > 3.7)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3823)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3824)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3825);letter_grade[i] = "A";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3826);if ((((gpa > 3.3)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3827)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3828)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3829);letter_grade[i] = "A-";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3830);if ((((gpa > 3.0)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3831)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3832)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3833);letter_grade[i] = "B+";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3834);if ((((gpa > 2.7)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3835)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3836)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3837);letter_grade[i] = "B";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3838);if ((((gpa > 2.3)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3839)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3840)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3841);letter_grade[i] = "B-";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3842);if ((((gpa > 2.0)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3843)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3844)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3845);letter_grade[i] = "C+";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3846);if ((((gpa > 1.7)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3847)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3848)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3849);letter_grade[i] = "C";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3850);if ((((gpa > 1.3)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3851)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3852)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3853);letter_grade[i] = "C-";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3854);if ((((gpa > 1.0)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3855)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3856)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3857);letter_grade[i] = "D+";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3858);if ((((gpa > 0.7)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3859)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3860)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3861);letter_grade[i] = "D";
            }else {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3862);if ((((gpa > 0.0)&&(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3863)!=0|true))||(__CLR4_4_12xw2xwlp0zmhm5.R.iget(3864)==0&false)))
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3865);letter_grade[i] = "D-";
            }else
                {__CLR4_4_12xw2xwlp0zmhm5.R.inc(3866);letter_grade[i] = "E";
        }}}}}}}}}}}}}
        }__CLR4_4_12xw2xwlp0zmhm5.R.inc(3867);return letter_grade;
    }finally{__CLR4_4_12xw2xwlp0zmhm5.R.flushNeeded();}}
}
