
package humaneval;

import org.junit.Test;

public class DIGIT_SUMTest {

    @Test
    public void testDigitSum_EmptyString() {
        String input = "";
        int expectedOutput = 0;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }

    @Test
    public void testDigitSum_abAB() {
        String input = "abAB";
        int expectedOutput = 131;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }

    @Test
    public void testDigitSum_abcCd() {
        String input = "abcCd";
        int expectedOutput = 67;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }

    @Test
    public void testDigitSum_helloE() {
        String input = "helloE";
        int expectedOutput = 69;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }

    @Test
    public void testDigitSum_woArBld() {
        String input = "woArBld";
        int expectedOutput = 131;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }

    @Test
    public void testDigitSum_aAaaaXa() {
        String input = "aAaaaXa";
        int expectedOutput = 153;
        assertEquals(expectedOutput, humaneval.correct.DIGIT_SUM.digit_sum(input));
    }
}