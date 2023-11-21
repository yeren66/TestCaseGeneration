package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FIBTest {

    @Test
    public void testFib() {
        assertEquals(55, humaneval.correct.FIB.fib(10));
        assertEquals(1, humaneval.correct.FIB.fib(1));
        assertEquals(21, humaneval.correct.FIB.fib(8));
    }
}
