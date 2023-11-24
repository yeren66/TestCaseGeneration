package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.COUNT_UPPER;

public class COUNT_UPPERTest {
    @Test
    public void count_upperTEST() {
        String s = "aBCdEf";
        int expectedOutput = 1;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(s));
        
        s = "abcdefg";
        expectedOutput = 0;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(s));
        
        s = "dBBE";
        expectedOutput = 0;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(s));
    }
}