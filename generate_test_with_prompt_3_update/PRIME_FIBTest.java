package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PRIME_FIB;
import java.util.ArrayList;

public class PRIME_FIBTest {
    @Test
    public void is_primeTEST() {
        // Test that 10 is not prime
        assertFalse(PRIME_FIB.is_prime(10));
        
        // Test that 23 is prime
        assertTrue(PRIME_FIB.is_prime(23));
    }
}