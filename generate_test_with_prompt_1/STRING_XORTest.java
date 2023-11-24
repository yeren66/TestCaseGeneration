package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.lang.IllegalArgumentException;

public class STRING_XORTest {
    @Test
    public void testSTRING_XOR() {
        assertEquals("01", humaneval.correct.STRING_XOR.string_xor("00", "01"));
        assertEquals("10", humaneval.correct.STRING_XOR.string_xor("01", "10"));
        assertEquals("11", humaneval.correct.STRING_XOR.string_xor("11", "11"));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testSTRING_XORWithDifferentLength() {
        humaneval.correct.STRING_XOR.string_xor("00", "010");
    }
}