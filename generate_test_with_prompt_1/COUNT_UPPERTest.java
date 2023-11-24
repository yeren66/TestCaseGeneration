package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPERTest {
    @Test
    public void testCountUpper() {
        String s = "aBCdEf";
        int expected = 1;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
    }
    
    @Test
    public void testCountUpperWithNoVowels() {
        String s = "abcdefg";
        int expected = 0;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
    }
    
    @Test
    public void testCountUpperWithAllVowels() {
        String s = "dBBE";
        int expected = 0;
        assertEquals(expected, humaneval.correct.COUNT_UPPER.count_upper(s));
    }
}