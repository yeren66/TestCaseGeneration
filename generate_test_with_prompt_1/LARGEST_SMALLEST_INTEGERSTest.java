package humaneval;
import static org.junit.jupiter.api.Assertions.*;
import humaneval.correct.LARGEST_SMALLEST_INTEGERS;

public class LARGEST_SMALLEST_INTEGERSTest {
    @Test
    public void testEmptyList() {
        int[] input = {};
        int[] expectedOutput = new int[2];
        expectedOutput[0] = 0;
        expectedOutput[1] = 0;
        
        assertEquals(LARGEST_SMALLEST_INTEGERS.largestSmallestIntegers(input), expectedOutput);
    }
}