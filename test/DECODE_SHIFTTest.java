package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.DECODE_SHIFT;

public class DECODE_SHIFTTest {
    @Test
    public void encode_shiftTEST() {
        String input = "hello";
        String expectedOutput = "mjqqt";
        assertEquals(expectedOutput, DECODE_SHIFT.encode_shift(input));
    }
}