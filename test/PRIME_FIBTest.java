package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PRIME_FIBTest {
    
    @Test
    public void testIsPrime() {
        assertTrue(PRIME_FIB.isPrime(2));
        assertFalse(PRIME_FIB.isPrime(4));
        assertTrue(PRIME_FIB.isPrime(11));
        assertFalse(PRIME_FIB.isPrime(15));
    }
    
    @Test
    public void testPrimeFib() {
        assertEquals(2, PRIME_FIB.primeFib(0));
        assertEquals(3, PRIME_FIB.primeFib(1));
        assertEquals(5, PRIME_FIB.primeFib(2));
        assertEquals(89, PRIME_FIB.primeFib(7));
    }
}