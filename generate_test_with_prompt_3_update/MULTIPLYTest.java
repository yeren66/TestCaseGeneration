
package humaneval.correct;

import org.junit.Assert.*;

public class MULTIPLYTest {
    @Test
    public void multiplyTEST() {
        // Test case 1:
        int a = 148, b = 412;
        assertEquals(MULTIPLY.multiply(a, b), 16);
        
        // Test case 2:
        a = 19; b = 28;
        assertEquals(MULTIPLY.multiply(a, b), 72);
        
        // Test case 3:
        a = 2020; b = 1851;
        assertEquals(MULTIPLY.multiply(a, b), 0);
        
        // Test case 4:
        a = 14; b = -15;
        assertEquals(MULTIPLY.multiply(a, b), 20);
    }
}