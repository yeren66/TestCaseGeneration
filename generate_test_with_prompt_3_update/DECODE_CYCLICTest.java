package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.DECODE_CYCLIC;
import java.util.ArrayList;

public class DECODE_CYCLICTest {
    @Test
    public void decode_cyclicTEST() {
        String str = "Hello World";
        assertEquals("Hello World", DECODE_CYCLIC.decode_cyclic(str));
    }
}