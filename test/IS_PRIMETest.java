package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_PRIME;

public class IS_PRIMETest {
    @Test
    public void is_primeTEST() {
        // Test with a prime number
        assertTrue(IS_PRIME.is_prime(17));
        
        // Test with a composite number
        assertFalse(IS_PRIME.is_prime(20));
        
        // Test with a negative number
        assertFalse(IS_PRIME.is_prime(-5));
    }
}