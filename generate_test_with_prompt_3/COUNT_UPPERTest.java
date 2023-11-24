package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class COUNT_UPPERTest {
    @Test
    public void count_upperTEST() {
        String input = "aBCdEf";
        int expectedOutput = 1;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(input));
        
        input = "abcdefg";
        expectedOutput = 0;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(input));
        
        input = "dBBE";
        expectedOutput = 0;
        assertEquals(expectedOutput, COUNT_UPPER.count_upper(input));
    }
}