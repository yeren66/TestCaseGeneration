package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGIT_SUMTest {
    @Test
    public void digit_sumTEST() {
        assertEquals(0, DIGIT_SUM.digit_sum(""));
        assertEquals(131, DIGIT_SUM.digit_sum("abAB"));
        assertEquals(67, DIGIT_SUM.digit_sum("abcCd"));
        assertEquals(69, DIGIT_SUM.digit_sum("helloE"));
        assertEquals(131, DIGIT_SUM.digit_sum("woArBld"));
        assertEquals(153, DIGIT_SUM.digit_sum("aAaaaXa"));
    }
}