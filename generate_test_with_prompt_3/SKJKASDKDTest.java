    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SKJKASDKDTest {
    @Test
    public void is_primeTEST() {
        // Test case 1: is_prime(2) should return true
        assertTrue(SKJKASDKD.is_prime(2));
        
        // Test case 2: is_prime(3) should return true
        assertTrue(SKJKASDKD.is_prime(3));
        
        // Test case 3: is_prime(4) should return false
        assertFalse(SKJKASDKD.is_prime(4));
    }
}