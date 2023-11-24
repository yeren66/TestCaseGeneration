
package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class HOW_MANY_TIMESTest {
    @Test
    public void testHowManyTimes() {
        String string = "This is a test string";
        String substring = "test";
        int expected = 2;
        
        assertEquals(expected, humaneval.correct.HOW_MANY_TIMES.how_many_times(string, substring));
    }
}
