package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class PRIME_LENGTHTest {
    @Test
    public void testPrimeLength() {
        assertTrue(PRIME_LENGTH.prime_length("Hello")); // length is 5, which is prime
        assertTrue(PRIME_LENGTH.prime_length("abcdcba")); // length is 7, which is prime
        assertTrue(PRIME_LENGTH.prime_length("kittens")); // length is 8, which is not prime
        assertFalse(PRIME_LENGTH.prime_length("orange")); // length is 6, which is not prime
    }
}
