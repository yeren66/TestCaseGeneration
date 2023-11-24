package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPERTest {
    @Test
    public void testCountUpper() {
        String s = "aBCdEf";
        int expected = 1;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
        
        s = "abcdefg";
        expected = 0;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
        
        s = "dBBE";
        expected = 0;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
    }
}