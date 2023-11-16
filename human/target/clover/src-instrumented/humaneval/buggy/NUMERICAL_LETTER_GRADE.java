/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

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

public class NUMERICAL_LETTER_GRADE {public static class __CLR4_4_113c13clp17t43q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,1472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static String[] numerical_letter_grade(double[] grades) {try{__CLR4_4_113c13clp17t43q.R.inc(1416);
        __CLR4_4_113c13clp17t43q.R.inc(1417);String[] letter_grade = new String[grades.length];

        __CLR4_4_113c13clp17t43q.R.inc(1418);for (int i = 0; (((i < grades.length)&&(__CLR4_4_113c13clp17t43q.R.iget(1419)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1420)==0&false)); i += 1) {{
            __CLR4_4_113c13clp17t43q.R.inc(1421);double gpa = grades[i];
            __CLR4_4_113c13clp17t43q.R.inc(1422);if ((((gpa == 4.0)&&(__CLR4_4_113c13clp17t43q.R.iget(1423)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1424)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1425);letter_grade[i] = "A+";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1426);if ((((gpa > 3.7)&&(__CLR4_4_113c13clp17t43q.R.iget(1427)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1428)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1429);letter_grade[i] = "A";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1430);if ((((gpa > 3.3)&&(__CLR4_4_113c13clp17t43q.R.iget(1431)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1432)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1433);letter_grade[i] = "A-";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1434);if ((((gpa > 3.0)&&(__CLR4_4_113c13clp17t43q.R.iget(1435)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1436)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1437);letter_grade[i] = "B+";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1438);if ((((gpa > 2.7)&&(__CLR4_4_113c13clp17t43q.R.iget(1439)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1440)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1441);letter_grade[i] = "B";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1442);if ((((gpa > 2.3)&&(__CLR4_4_113c13clp17t43q.R.iget(1443)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1444)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1445);letter_grade[i] = "B-";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1446);if ((((gpa > 2.0)&&(__CLR4_4_113c13clp17t43q.R.iget(1447)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1448)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1449);letter_grade[i] = "C+";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1450);if ((((gpa > 1.3)&&(__CLR4_4_113c13clp17t43q.R.iget(1451)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1452)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1453);letter_grade[i] = "C-";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1454);if ((((gpa > 1.0)&&(__CLR4_4_113c13clp17t43q.R.iget(1455)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1456)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1457);letter_grade[i] = "D+";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1458);if ((((gpa > 1.7)&&(__CLR4_4_113c13clp17t43q.R.iget(1459)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1460)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1461);letter_grade[i] = "C";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1462);if ((((gpa > 0.7)&&(__CLR4_4_113c13clp17t43q.R.iget(1463)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1464)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1465);letter_grade[i] = "D";
            }else {__CLR4_4_113c13clp17t43q.R.inc(1466);if ((((gpa > 0.0)&&(__CLR4_4_113c13clp17t43q.R.iget(1467)!=0|true))||(__CLR4_4_113c13clp17t43q.R.iget(1468)==0&false)))
                {__CLR4_4_113c13clp17t43q.R.inc(1469);letter_grade[i] = "D-";
            }else
                {__CLR4_4_113c13clp17t43q.R.inc(1470);letter_grade[i] = "E";
        }}}}}}}}}}}}}
        }__CLR4_4_113c13clp17t43q.R.inc(1471);return letter_grade;
    }finally{__CLR4_4_113c13clp17t43q.R.flushNeeded();}}
}
