package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_PRIMETest {
    @Test
    public void is_primeTEST() {
        assertFalse(IS_PRIME.is_prime(0)); // Test case 1: n < 2
        assertFalse(IS_PRIME.is_prime(1)); // Test case 2: n < 2
        assertTrue(IS_PRIME.is_prime(2)); // Test case 3: n == 2
        assertTrue(IS_PRIME.is_prime(3)); // Test case 4: n > 2 and not divisible by any number between 2 and n-1
        assertFalse(IS_PRIME.is_prime(5)); // Test case 5: n > 2 and divisible by a number between 2 and n-1
    }
}