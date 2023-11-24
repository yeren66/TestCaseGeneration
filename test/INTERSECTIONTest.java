package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.INTERSECTION;

public class INTERSECTIONTest {
    @Test
    public void is_primeTEST() {
        assertTrue(INTERSECTION.is_prime(2)); // prime number
        assertFalse(INTERSECTION.is_prime(4)); // composite number
    }
}