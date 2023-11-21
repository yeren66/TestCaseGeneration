package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class SORT_EVENTest {
    @Test
    public void testSortEvenEmpty() {
        int[] input = new int[0];
        int[] expectedOutput = new int[0];
        assertArrayEquals(expectedOutput, humaneval.correct.SORT_EVEN.sort_even(input));
    }
    
    @Test
    public void testSortEvenSingleElement() {
        int[] input = new int[] { 1 };
        int[] expectedOutput = new int[] { 1 };
        assertArrayEquals(expectedOutput, humaneval.correct.SORT_EVEN.sort_even(input));
    }
    
    @Test
    public void testSortEvenOddNumberOfElements() {
        int[] input = new int[] { 2, 3, 4, 1 };
        int[] expectedOutput = new int[] { 2, 3, 4, 1 };
        assertArrayEquals(expectedOutput, humaneval.correct.SORT_EVEN.sort_even(input));
    }
    
    @Test
    public void testSortEvenEvenNumberOfElements() {
        int[] input = new int[] { 2, 3, 4, 1 };
        int[] expectedOutput = new int[] { 2, 3, 4, 1 };
        assertArrayEquals(expectedOutput, humaneval.correct.SORT_EVEN.sort_even(input));
    }
    
    @Test
    public void testSortEvenNegativeElements() {
        int[] input = new int[] { -2, -3, -4, 1 };
        int[] expectedOutput = new int[] { -2, -3, -4, 1 };
        assertArrayEquals(expectedOutput, humaneval.correct.SORT_EVEN.sort_even(input));
    }
}
