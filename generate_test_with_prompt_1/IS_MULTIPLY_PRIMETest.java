package humaneval;
import static org.junit.Assert.*;

public class IS_MULTIPLY_PRIMETest {
    @Test
    public void testIsMultiplyPrime() {
        assertTrue(IS_MULTIPLY_PRIME.is_multiply_prime(30)); // 30 = 2 * 3 * 5
        assertFalse(IS_MULTIPLY_PRIME.is_multiply_prime(45)); // 45 is not the multiplication of 3 prime numbers
    }
}