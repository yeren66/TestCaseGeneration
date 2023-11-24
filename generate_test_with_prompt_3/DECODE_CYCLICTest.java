package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class DECODE_CYCLICTest {
    @Test
    public void decode_cyclicTEST() {
        String testString = "abcdefgh";
        String expectedOutput = "bcafdheg";
        assertEquals(expectedOutput, DECODE_CYCLIC.decode_cyclic(testString));
    }
}