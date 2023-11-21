package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class DECODE_SHIFTTest {
    @Test
    public void testEncodeShift() {
        String input = "hello";
        String expectedOutput = "mjqqt"; // mjqqt is the encoded string with shift of 5 in the alphabet
        assertEquals(expectedOutput, humaneval.correct.DECODE_SHIFT.encode_shift(input));
    }
}
