package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.LARGEST_DIVISOR;

public class LARGEST_DIVISORTest {
    @Test
    public void largest_divisorTEST() {
        assertEquals(1, LARGEST_DIVISOR.largest_divisor(1));
        assertEquals(2, LARGEST_DIVISOR.largest_divisor(2));
        assertEquals(3, LARGEST_DIVISOR.largest_divisor(6));
        assertEquals(4, LARGEST_DIVISOR.largest_divisor(12));
    }
}