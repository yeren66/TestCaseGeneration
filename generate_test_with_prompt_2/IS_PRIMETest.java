package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class IS_PRIMETest {
    @Test
    public void testIsPrime() {
        assertTrue(IS_PRIME.is_prime(2)); // 2 is the only even prime number
        assertFalse(IS_PRIME.is_prime(3));
        assertFalse(IS_PRIME.is_prime(5));
        assertFalse(IS_PRIME.is_prime(7));
        assertTrue(IS_PRIME.is_prime(11));
        assertFalse(IS_PRIME.is_prime(13));
    }
}
