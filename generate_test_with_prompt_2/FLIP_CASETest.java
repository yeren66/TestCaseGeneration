
package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FLIP_CASETest {
    
    @Test
    public void flipCaseTest() {
        String input = "Hello World!";
        String expectedOutput = "hELLO wORLD!";
        
        assertEquals(expectedOutput, humaneval.correct.FLIP_CASE.flip_case(input));
    }
}
