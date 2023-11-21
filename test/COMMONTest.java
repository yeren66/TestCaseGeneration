package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class COMMONTest {
    @Test
    void testCommon_sortedUniqueElements() {
        int[] list1 = new int[]{1, 4, 3, 34, 653, 2, 5};
        int[] list2 = new int[]{5, 7, 1, 5, 9, 653, 121};
        
        int[] expectedResult = new int[]{1, 5, 653};
        
        assertArrayEquals(expectedResult, humaneval.correct.COMMON.common(list1, list2));
    }
    
    @Test
    void testCommon_sortedUniqueElements2() {
        int[] list1 = new int[]{5, 3, 2, 8};
        int[] list2 = new int[]{3, 2};
        
        int[] expectedResult = new int[]{2, 3};
        
        assertArrayEquals(expectedResult, humaneval.correct.COMMON.common(list1, list2));
    }
}