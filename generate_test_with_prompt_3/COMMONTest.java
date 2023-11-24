package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util;

public class COMMONTest {
    @Test
    public void commonTEST() {
        int[] list1 = new int[]{1, 4, 3, 34, 653, 2, 5};
        int[] list2 = new int[]{5, 7, 1, 5, 9, 653, 121};
        int[] expectedOutput = new int[]{1, 5, 653};
        
        assertArrayEquals(expectedOutput, COMMON.common(list1, list2));
    }
}