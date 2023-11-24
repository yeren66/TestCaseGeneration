
package humaneval;

import org.junit.Test;

import static org.junit.Assert.*;

public class CHOOSE_NUMTest {
    @Test
    public void testChooseNumWithinRange() {
        int x = 12, y = 15;
        assertEquals(14, humaneval.correct.CHOOSE_NUM.choose_num(x, y));
    }
    
    @Test
    public void testChooseNumOutsideRange() {
        int x = 13, y = 12;
        assertEquals(-1, humaneval.correct.CHOOSE_NUM.choose_num(x, y));
    }
}