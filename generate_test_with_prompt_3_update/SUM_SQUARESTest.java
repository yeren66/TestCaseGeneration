
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SUM_SQUARES;

public class SUM_SQUARESTest {
    @Test
    public void sum_squaresTEST() {
        int[] lst = new int[]{1, 2, 3};
        assertEquals(6, SUM_SQUARES.sum_squares(lst));

        lst = new int[]{};
        assertEquals(0, SUM_SQUARES.sum_squares(lst));

        lst = new int[]{-1, -5, 2, -1, -5};
        assertEquals(-126, SUM_SQUARES.sum_squares(lst));
    }
}