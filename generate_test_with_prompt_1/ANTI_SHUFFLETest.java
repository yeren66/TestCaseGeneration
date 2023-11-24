package humaneval;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class ANTI_SHUFFLETest {
    @Test
    public void testAntiShuffle() {
        String s = "Hi";
        String expectedResult = "Hi";
        assertEquals(expectedResult, humaneval.correct.ANTI_SHUFFLE.anti_shuffle(s));
        
        s = "hello";
        expectedResult = "ehllo";
        assertEquals(expectedResult, humaneval.correct.ANTI_SHUFFLE.anti_shuffle(s));
        
        s = "Hello World!!!";
        expectedResult = "Hello !!!Wdlor";
        assertEquals(expectedResult, humaneval.correct.ANTI_SHUFFLE.anti_shuffle(s));
    }
}