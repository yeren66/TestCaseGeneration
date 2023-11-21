
package humaneval;

import static org.junit.Assert.*;

public class HOW_MANY_TIMESTest {
    public static int humaneval.correct.HOW_MANY_TIMES.how_many_times(String string, String substring) {
        int times = 0;
        for (int i = 0; i < string.length() - substring.length() + 1; i += 1) {
            if (string.substring(i, i + substring.length()).equals(substring)){
                times += 1;
            }
        }
        return times;
    }
    
    @Test
    public void test_how_many_times() {
        String string = "hello";
        String substring = "ll";
        
        assertEquals(2, humaneval.correct.HOW_MANY_TIMES.how_many_times(string, substring));
    }
}
