package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STARTS_ONE_ENDSTest {
    @Test
    public void testStartsOneEnds() {
        int n = 1;
        int expectedCount = 1;
        assertEquals(expectedCount, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(n));
        
        n = 2;
        expectedCount = (int) ((10 + 9 - 1) * Math.pow(10, n - 2));
        assertEquals(expectedCount, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(n));
        
        n = 3;
        expectedCount = (int) ((10 + 9 - 1) * Math.pow(10, n - 2));
        assertEquals(expectedCount, humaneval.correct.STARTS_ONE_ENDS.starts_one_ends(n));
    }
}