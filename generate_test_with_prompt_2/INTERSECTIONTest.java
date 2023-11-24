package humaneval;

import static org.junit.Assert.*;

public class INTERSECTIONTest {
    @Test
    public void testIsPrime() {
        assertTrue(INTERSECTION.is_prime(2)); // prime number
        assertFalse(INTERSECTION.is_prime(3)); // composite number
        assertFalse(INTERSECTION.is_prime(10)); // not a prime number
    }
}
