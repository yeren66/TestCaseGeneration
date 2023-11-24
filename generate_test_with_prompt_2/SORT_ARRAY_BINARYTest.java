package humaneval;
import java.util.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SORT_ARRAY_BINARYTest extends TestCase {
    @Test
    public void testNumberOnes() {
        // Test case 1: positive integer with one bit set
        int input = 5;
        int expectedOutput = 1;
        assertEquals(expectedOutput, humaneval.correct.SORT_ARRAY_BINARY.number_ones(input));
        
        // Test case 2: positive integer with multiple bits set
        input = 7;
        expectedOutput = 3;
        assertEquals(expectedOutput, humaneval.correct.SORT_ARRAY_BINARY.number_ones(input));
        
        // Test case 3: negative integer with one bit set
        input = -5;
        expectedOutput = 1;
        assertEquals(expectedOutput, humaneval.correct.SORT_ARRAY_BINARY.number_ones(input));
        
        // Test case 4: zero
        input = 0;
        expectedOutput = 0;
        assertEquals(expectedOutput, humaneval.correct.SORT_ARRAY_BINARY.number_ones(input));
    }
}