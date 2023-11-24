package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PRIME_LENGTHTest {
    @Test
    void testPrimeLength() {
        assertTrue(PRIME_LENGTH.prime_length("Hello")); // True
        assertTrue(PRIME_LENGTH.prime_length("abcdcba")); // True
        assertTrue(PRIME_LENGTH.prime_length("kittens")); // True
        assertFalse(PRIME_LENGTH.prime_length("orange")); // False
    }
}
