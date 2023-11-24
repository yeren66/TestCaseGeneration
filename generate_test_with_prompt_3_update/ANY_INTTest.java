package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ANY_INT;

public class ANY_INTTest {
    @Test
    public void any_intTEST() {
        assertTrue(ANY_INT.any_int(5, 2, 7)); // Returns true because one of the numbers (5) is equal to the sum of the other two (2 + 7 = 9) and all numbers are doubles that can be converted to integers.
        assertFalse(ANY_INT.any_int(3, 2, 2)); // Returns false because none of the numbers (3, 2, and 2) is equal to the sum of the other two and they cannot be converted to integers.
        assertTrue(ANY_INT.any_int(3, -2, 1)); // Returns true because one of the numbers (3) is equal to the sum of the other two (-2 + 1 = 0) and all numbers are doubles that can be converted to integers.
        assertFalse(ANY_INT.any_int(3.6, -2.2, 2)); // Returns false because none of the numbers (3.6, -2.2, and 2) is equal to the sum of the other two and they cannot be converted to integers.
    }
}