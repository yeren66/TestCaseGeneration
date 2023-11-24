package humaneval;

import static org.junit.Assert.*;

public class NEXT_SMALLESTTest {
    @Test
    public void testNextSmallest() {
        int[] lst = new int[] {1, 2, 3, 4, 5};
        assertEquals(Integer.valueOf(2), humaneval.correct.NEXT_SMALLEST.next_smallest(lst));
        
        lst = new int[] {5, 1, 4, 3, 2};
        assertEquals(Integer.valueOf(2), humaneval.correct.NEXT_SMALLEST.next_smallest(lst));
        
        lst = new int[] {};
        assertNull(NEXT_SMALLEST.next_smallest(lst));
        
        lst = new int[] {1, 1};
        assertNull(NEXT_SMALLEST.next_smallest(lst));
    }
}