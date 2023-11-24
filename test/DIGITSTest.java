package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.DIGITS;

public class DIGITSTest {
    @Test
    public void digitsTEST() {
        assertEquals(1, DIGITS.digits(1));
        assertEquals(0, DIGITS.digits(4));
        assertEquals(15, DIGITS.digits(235));
    }
}