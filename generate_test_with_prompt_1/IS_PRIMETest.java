package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_PRIMETest {
    @Test
    public void testIsPrime() {
        assertFalse(IS_PRIME.is_prime(-1)); // negative number
        assertFalse(IS_PRIME.is_prime(0)); // zero
        assertFalse(IS_PRIME.is_prime(1)); // one
        assertTrue(IS_PRIME.is_prime(2)); // two
        assertTrue(IS_PRIME.is_prime(3)); // three
        assertTrue(IS_PRIME.is_prime(5)); // five
        assertFalse(IS_PRIME.is_prime(6)); // six
    }
}