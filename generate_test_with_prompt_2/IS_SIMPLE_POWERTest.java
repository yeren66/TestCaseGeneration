package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class IS_SIMPLE_POWERTest {
    @Test
    public void testIsSimplePower() {
        // Test case 1: x is a simple power of n, n > 1
        assertTrue(IS_SIMPLE_POWER.is_simple_power(4, 2));
        
        // Test case 2: x is not a simple power of n, n > 1
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 2));
        
        // Test case 3: x is a simple power of n, n = 1
        assertTrue(IS_SIMPLE_POWER.is_simple_power(1, 1));
        
        // Test case 4: x is not a simple power of n, n = 1
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 1));
    }
}