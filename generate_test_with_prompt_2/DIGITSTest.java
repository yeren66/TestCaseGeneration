package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGITSTest {
    @Test
    public void testDigits() {
        assertEquals(1, humaneval.correct.DIGITS.digits(1)); // 1 has one odd digit (1)
        assertEquals(0, humaneval.correct.DIGITS.digits(4)); // 4 has no odd humaneval.correct.DIGITS.digits
        assertEquals(15, humaneval.correct.DIGITS.digits(235)); // 235 has three odd humaneval.correct.DIGITS.digits (3, 5, 5)
    }
}