    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PRIME_FIBTest {
    @Test
    public void is_primeTEST() {
        assertTrue(PRIME_FIB.is_prime(3));
        assertFalse(PRIME_FIB.is_prime(6));
        assertFalse(PRIME_FIB.is_prime(9));
        assertTrue(PRIME_FIB.is_prime(15));
    }
}