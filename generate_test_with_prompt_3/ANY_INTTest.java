package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANY_INTTest {
    @Test
    public void any_intTEST() {
        // Test case 1: Sum of two numbers is equal to third number
        assertTrue(ANY_INT.any_int(5, 2, 7));
        
        // Test case 2: One of the numbers is not an integer
        assertFalse(ANY_INT.any_int(3, 2, 2.1));
        
        // Test case 3: Sum of two numbers is not equal to third number
        assertFalse(ANY_INT.any_int(3, -2, 1));
        
        // Test case 4: All numbers are integers but they do not add up
        assertFalse(ANY_INT.any_int(3, -2, 5));
    }
}
