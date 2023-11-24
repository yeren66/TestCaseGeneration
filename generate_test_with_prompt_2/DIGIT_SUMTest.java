package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGIT_SUMTest {
    @Test
    public void testDigitSum() {
        assertEquals(0, humaneval.correct.DIGIT_SUM.digit_sum(""));
        assertEquals(131, humaneval.correct.DIGIT_SUM.digit_sum("abAB"));
        assertEquals(67, humaneval.correct.DIGIT_SUM.digit_sum("abcCd"));
        assertEquals(69, humaneval.correct.DIGIT_SUM.digit_sum("helloE"));
        assertEquals(131, humaneval.correct.DIGIT_SUM.digit_sum("woArBld"));
        assertEquals(153, humaneval.correct.DIGIT_SUM.digit_sum("aAaaaXa"));
    }
}