
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRING_XORTest {
    @Test
    public void string_xorTEST() {
        String a = "abcd";
        String b = "efgh";
        String expectedResult = "01010101";
        
        assertEquals(expectedResult, STRING_XOR.string_xor(a, b));
    }
}
