package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.STRING_XOR;

public class STRING_XORTest {
    @Test
    public void string_xorTEST() {
        String a = "abc";
        String b = "def";
        assertEquals("101", STRING_XOR.string_xor(a, b));
    }
}