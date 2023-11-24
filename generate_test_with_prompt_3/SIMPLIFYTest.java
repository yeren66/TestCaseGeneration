package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SIMPLIFYTest {
    @Test
    public void simplifyTEST() {
        // Test case 1: x = "1/5", n = "5/1"
        assertTrue(SIMPLIFY.simplify("1/5", "5/1"));
        
        // Test case 2: x = "1/6", n = "2/1"
        assertFalse(SIMPLIFY.simplify("1/6", "2/1"));
        
        // Test case 3: x = "7/10", n = "10/2"
        assertFalse(SIMPLIFY.simplify("7/10", "10/2"));
    }
}