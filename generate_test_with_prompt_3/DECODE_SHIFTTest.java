
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class DECODE_SHIFTTest {
    @Test
    public void encode_shiftTEST() {
        String input = "Hello World!";
        String expectedOutput = "Mjqqt Btwqi!";
        assertEquals(expectedOutput, DECODE_SHIFT.encode_shift(input));
    }
    
    @Test
    public void decode_shiftTEST() {
        String input = "Mjqqt Btwqi!";
        String expectedOutput = "Hello World!";
        assertEquals(expectedOutput, DECODE_SHIFT.decode_shift(input));
    }
    
    @Test
    public void encode_shift_with_null_inputTEST() {
        String input = null;
        String expectedOutput = "";
        assertEquals(expectedOutput, DECODE_SHIFT.encode_shift(input));
    }
    
    @Test
    public void decode_shift_with_null_inputTEST() {
        String input = null;
        String expectedOutput = "";
        assertEquals(expectedOutput, DECODE_SHIFT.decode_shift(input));
    }
}
