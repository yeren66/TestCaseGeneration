package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_MULTIPLY_PRIMETest {
    @Test
    public void testIsMultiplyPrime() {
        assertTrue(IS_MULTIPLY_PRIME.is_multiply_prime(30));
    }
    
    @Test
    public void testIsNotMultiplyPrime() {
        assertFalse(IS_MULTIPLY_PRIME.is_multiply_prime(15));
    }
    
    @Test
    public void testIsMultiplyPrimeWithLargeInput() {
        assertTrue(IS_MULTIPLY_PRIME.is_multiply_prime(3000));
    }
}