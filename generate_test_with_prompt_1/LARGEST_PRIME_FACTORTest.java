package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class LARGEST_PRIME_FACTORTest {
    @Test
    public void testLargestPrimeFactor() {
        assertEquals(29, largest_prime_factor(13195));
        assertEquals(2, largest_prime_factor(2048));
    }
}