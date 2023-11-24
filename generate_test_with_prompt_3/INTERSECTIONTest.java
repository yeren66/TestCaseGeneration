
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class INTERSECTIONTest {
    @Test
    public void is_primeTEST() {
        assertTrue(INTERSECTION.is_prime(2)); // should return true
        assertFalse(INTERSECTION.is_prime(3)); // should return false
        assertTrue(INTERSECTION.is_prime(5)); // should return true
        assertFalse(INTERSECTION.is_prime(7)); // should return false
    }
}