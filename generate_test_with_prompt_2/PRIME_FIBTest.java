package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class PRIME_FIBTest {
    @Test
    public void testIsPrime() {
        assertTrue(PRIME_FIB.is_prime(1));
        assertTrue(PRIME_FIB.is_prime(2));
        assertTrue(PRIME_FIB.is_prime(3));
        assertFalse(PRIME_FIB.is_prime(4));
        assertTrue(PRIME_FIB.is_prime(5));
        assertFalse(PRIME_FIB.is_prime(6));
        assertTrue(PRIME_FIB.is_prime(7));
        assertFalse(PRIME_FIB.is_prime(8));
        assertFalse(PRIME_FIB.is_prime(9));
    }
}