package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CLOSEST_INTEGER;

public class CLOSEST_INTEGERTest {
    @Test
    public void closest_integerTEST() {
        assertEquals(10, CLOSEST_INTEGER.closest_integer("10"));
        assertEquals(15, CLOSEST_INTEGER.closest_integer("15.3"));
        assertEquals(-15, CLOSEST_INTEGER.closest_integer("-14.5"));
    }
}