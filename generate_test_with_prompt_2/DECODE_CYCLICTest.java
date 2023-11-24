package humaneval;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DECODE_CYCLICTest {
    @Test
    void testDecodeCyclic() {
        String input = "This is a string to be decoded";
        String expectedOutput = "This is a string to be decoded";
        assertEquals(expectedOutput, humaneval.correct.DECODE_CYCLIC.decode_cyclic(input));
    }
}
