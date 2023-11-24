package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_TO_NTest {
    @Test
    public void testSumToN() {
        assertEquals(465, humaneval.correct.SUM_TO_N.sum_to_n(30));
        assertEquals(5050, humaneval.correct.SUM_TO_N.sum_to_n(100));
        assertEquals(15, humaneval.correct.SUM_TO_N.sum_to_n(5));
        assertEquals(55, humaneval.correct.SUM_TO_N.sum_to_n(10));
        assertEquals(1, humaneval.correct.SUM_TO_N.sum_to_n(1));
    }
}
