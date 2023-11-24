package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class STRING_SEQUENCETest {
    @Test
    public void string_sequenceTEST() {
        int n = 5;
        String expected = "0 1 2 3 4";
        assertEquals(expected, STRING_SEQUENCE.string_sequence(n));
    }
}