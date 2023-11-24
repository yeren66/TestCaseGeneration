package humaneval;
  import org.junit.Assert;
import humaneval.correct.DIGIT_SUM;

public class DIGIT_SUMTest {
    @Test
    public void digit_sumTEST() {
        int expected = 0;
        String input1 = "";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input1));

        expected = 131;
        String input2 = "abAB";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input2));

        expected = 67;
        String input3 = "abcCd";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input3));

        expected = 69;
        String input4 = "helloE";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input4));

        expected = 131;
        String input5 = "woArBld";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input5));

        expected = 153;
        String input6 = "aAaaaXa";
        Assert.assertEquals(expected, DIGIT_SUM.digit_sum(input6));
    }
}