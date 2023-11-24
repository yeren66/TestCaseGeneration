package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FIBFIBTest {
    @Test
    public void testFibfib() {
        assertEquals(0, humaneval.correct.FIBFIB.fibfib(0));
        assertEquals(0, humaneval.correct.FIBFIB.fibfib(1));
        assertEquals(1, humaneval.correct.FIBFIB.fibfib(2));
        assertEquals(4, humaneval.correct.FIBFIB.fibfib(5));
        assertEquals(24, humaneval.correct.FIBFIB.fibfib(8));
    }
}
