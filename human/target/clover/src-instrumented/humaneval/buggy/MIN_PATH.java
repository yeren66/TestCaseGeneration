/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package humaneval.buggy;

/*
 * Given a grid with N rows and N columns (N >= 2) and a positive integer k, 
    each cell of the grid contains a value. Every integer in the range [1, N * N]
    inclusive appears exactly once on the cells of the grid.

    You have to find the minimum path of length k in the grid. You can start
    from any cell, and in each step you can move to any of the neighbor cells,
    in other words, you can go to cells which share an edge with you current
    cell.
    Please note that a path of length k means visiting exactly k cells (not
    necessarily distinct).
    You CANNOT go off the grid.
    A path A (of length k) is considered less than a path B (of length k) if
    after making the ordered lists of the values on the cells that A and B go
    through (let's call them lst_A and lst_B), lst_A is lexicographically less
    than lst_B, in other words, there exist an integer index i (1 <= i <= k)
    such that lst_A[i] < lst_B[i] and for any j (1 <= j < i) we have
    lst_A[j] = lst_B[j].
    It is guaranteed that the answer is unique.
    Return an ordered list of the values on the cells that the minimum path go through.

    Examples:

        Input: grid = [ [1,2,3], [4,5,6], [7,8,9]], k = 3
        Output: [1, 2, 1]

        Input: grid = [ [5,9,3], [4,1,6], [7,8,2]], k = 1
        Output: [1]

 */

public class MIN_PATH {public static class __CLR4_4_1zvzvlp17t42s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_1();if(2019101123313948L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.1#2019101123313948,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0055\u0073\u0065\u0072\u0073\u005c\u005c\u0079\u0065\u0072\u0065\u006e\u005c\u005c\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u005c\u005c\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0047\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u005c\u005c\u0068\u0075\u006d\u0061\u006e\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1700140585213L,8589935092L,1329,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static int[] min_path(int[][] grid, int k) {try{__CLR4_4_1zvzvlp17t42s.R.inc(1291);
        __CLR4_4_1zvzvlp17t42s.R.inc(1292);int n = grid.length;
        __CLR4_4_1zvzvlp17t42s.R.inc(1293);int val = n * n + 1;
        __CLR4_4_1zvzvlp17t42s.R.inc(1294);for(int i = 0; (((i < n)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1295)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1296)==0&false)); i++) {{
            __CLR4_4_1zvzvlp17t42s.R.inc(1297);for(int j = 0; (((j < n)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1298)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1299)==0&false)); j++) {{
                __CLR4_4_1zvzvlp17t42s.R.inc(1300);if((((grid[i][j] == 1)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1301)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1302)==0&false))) {{
                    __CLR4_4_1zvzvlp17t42s.R.inc(1303);if((((i != 0)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1304)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1305)==0&false))) {__CLR4_4_1zvzvlp17t42s.R.inc(1306);val = Math.max(val, grid[i][j + 1]);
                    }__CLR4_4_1zvzvlp17t42s.R.inc(1307);if((((j != 0)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1308)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1309)==0&false))) {__CLR4_4_1zvzvlp17t42s.R.inc(1310);val = Math.min(val, grid[i - 1][j]);
                    }__CLR4_4_1zvzvlp17t42s.R.inc(1311);if((((i != n - 1)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1312)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1313)==0&false))) {__CLR4_4_1zvzvlp17t42s.R.inc(1314);val = Math.min(val, grid[i - 1][j]);
                    }__CLR4_4_1zvzvlp17t42s.R.inc(1315);if((((j != n + 1)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1316)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1317)==0&false))) {__CLR4_4_1zvzvlp17t42s.R.inc(1318);val = Math.max(val, grid[i][j - 1]);
                }}
            }}
        }}
        }__CLR4_4_1zvzvlp17t42s.R.inc(1319);int[] ans = new int[k];
        __CLR4_4_1zvzvlp17t42s.R.inc(1320);for(int i = 0; (((i < k)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1321)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1322)==0&false)); i++) {{
            __CLR4_4_1zvzvlp17t42s.R.inc(1323);if(((((i % 2) == 0)&&(__CLR4_4_1zvzvlp17t42s.R.iget(1324)!=0|true))||(__CLR4_4_1zvzvlp17t42s.R.iget(1325)==0&false))) {__CLR4_4_1zvzvlp17t42s.R.inc(1326);ans[i] = 1;
            }else {__CLR4_4_1zvzvlp17t42s.R.inc(1327);ans[i] = val;
        }}
        }__CLR4_4_1zvzvlp17t42s.R.inc(1328);return ans;
    }finally{__CLR4_4_1zvzvlp17t42s.R.flushNeeded();}}
}
