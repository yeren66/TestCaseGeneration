
package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class DECIMAL_TO_BINARYTest {
    @Test
    public void testDecimalToBinary() {
        int input = 15;
        String expectedOutput = "db1111db";
        
        assertEquals(expectedOutput, humaneval.correct.DECIMAL_TO_BINARY.decimal_to_binary(input));
    }
    
    @Test
    public void testDecimalToBinary2() {
        int input = 32;
        String expectedOutput = "db100000db";
        
        assertEquals(expectedOutput, humaneval.correct.DECIMAL_TO_BINARY.decimal_to_binary(input));
    }
}
