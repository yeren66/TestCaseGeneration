package humaneval;

import static org.junit.Assert.*;

public class LARGEST_DIVISORTest {
    @Test
    public void largestDivisor_withPositiveInteger_returnsCorrectResult() {
        int n = 12;
        assertEquals(3, humaneval.correct.LARGEST_DIVISOR.largest_divisor(n));
        
        n = 48;
        assertEquals(6, humaneval.correct.LARGEST_DIVISOR.largest_divisor(n));
    }
    
    @Test
    public void largestDivisor_withNegativeInteger_throwsIllegalArgumentException() {
        int n = -12;
        try {
            humaneval.correct.LARGEST_DIVISOR.largest_divisor(n);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
    
    @Test
    public void largestDivisor_withZeroInteger_throwsIllegalArgumentException() {
        int n = 0;
        try {
            humaneval.correct.LARGEST_DIVISOR.largest_divisor(n);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
    }
}