package humaneval;

import static org.junit.Assert.*;

public class DIGITSTest {
    @Test
    public void testDigits() {
        assertEquals(1, humaneval.correct.DIGITS.digits(1));
        assertEquals(0, humaneval.correct.DIGITS.digits(4));
        assertEquals(15, humaneval.correct.DIGITS.digits(235));
    }
}
