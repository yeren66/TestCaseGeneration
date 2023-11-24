
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRING_XORTest {
    @Test
    public void testStringXor() {
        String a = "hello";
        String b = "world";
        String expectedResult = "101010101010101010101010"; // this is the expected result of xoring "hello" and "world"
        
        assertEquals(expectedResult, humaneval.correct.STRING_XOR.string_xor(a, b));
    }
}