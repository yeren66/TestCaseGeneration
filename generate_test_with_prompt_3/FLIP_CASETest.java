
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class FLIP_CASETest {
    @Test
    public void flip_caseTEST() {
        String input = "Hello World!";
        String expectedOutput = "hELLO wORLD!";
        
        assertEquals(expectedOutput, FLIP_CASE.flip_case(input));
    }
}
