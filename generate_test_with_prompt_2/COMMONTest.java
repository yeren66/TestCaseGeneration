package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class COMMONTest {

    @Test
    public void testCommon() {
        int[] l1 = new int[]{1, 4, 3, 34, 653, 2, 5};
        int[] l2 = new int[]{5, 7, 1, 5, 9, 653, 121};
        
        // Test with two lists of different lengths
        int[] expectedResult = new int[]{1, 5, 653};
        assertArrayEquals(expectedResult, humaneval.correct.COMMON.common(l1, l2));
        
        // Test with two lists of same length
        l1 = new int[]{5, 3, 2, 8};
        l2 = new int[]{3, 2};
        expectedResult = new int[]{2, 3};
        assertArrayEquals(expectedResult, humaneval.correct.COMMON.common(l1, l2));
    }
}