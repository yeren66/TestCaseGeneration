package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class COMPARETest {
    @Test
    public void testCompare() {
        int[] game = new int[] {1, 2, 3};
        int[] guess = new int[] {4, 5, 6};
        int[] expectedResult = new int[] {3, 4, 5};
        
        assertArrayEquals(expectedResult, humaneval.correct.COMPARE.compare(game, guess));
    }
    
    @Test
    public void testCompareWithZeroDifference() {
        int[] game = new int[] {1, 2, 3};
        int[] guess = new int[] {1, 2, 3};
        int[] expectedResult = new int[] {0, 0, 0};
        
        assertArrayEquals(expectedResult, humaneval.correct.COMPARE.compare(game, guess));
    }
    
    @Test
    public void testCompareWithNegativeDifference() {
        int[] game = new int[] {1, 2, 3};
        int[] guess = new int[] {-1, -2, -3};
        int[] expectedResult = new int[] {2, 4, 6};
        
        assertArrayEquals(expectedResult, humaneval.correct.COMPARE.compare(game, guess));
    }
}
