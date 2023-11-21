
package humaneval;

import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Arrays;

public class NEXT_SMALLESTTest {
    @Test
    public void testNextSmallest() {
        int[] lst = new int[] {1, 2, 3, 4, 5};
        assertEquals(2, humaneval.correct.NEXT_SMALLEST.next_smallest(lst));
    }

    @Test
    public void testNextSmallestWithDuplicates() {
        int[] lst = new int[] {5, 1, 4, 3, 2};
        assertEquals(2, humaneval.correct.NEXT_SMALLEST.next_smallest(lst));
    }

    @Test
    public void testNextSmallestWithNoElements() {
        int[] lst = new int[0];
        assertNull(next_smallest(lst));
    }

    @Test
    public void testNextSmallestWithOneElement() {
        int[] lst = new int[] {1};
        assertNull(next_smallest(lst));
    }
}
