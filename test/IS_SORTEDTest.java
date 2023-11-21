package humaneval;

import static org.junit.Assert.*;

public class IS_SORTEDTest {
    @Test
    public void testSortedList() {
        int[] lst = new int[]{1, 2, 3, 4, 5};
        assertTrue(IS_SORTED.is_sorted(lst));
    }
    
    @Test
    public void testUnsortedList() {
        int[] lst = new int[]{1, 3, 2, 4, 5};
        assertFalse(IS_SORTED.is_sorted(lst));
    }
    
    @Test
    public void testDuplicateValues() {
        int[] lst = new int[]{1, 2, 3, 4, 5, 6};
        assertTrue(IS_SORTED.is_sorted(lst));
    }
    
    @Test
    public void testListWithMoreThanOneDuplicate() {
        int[] lst = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertTrue(IS_SORTED.is_sorted(lst));
    }
    
    @Test
    public void testListWithDuplicateValues() {
        int[] lst = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertFalse(IS_SORTED.is_sorted(lst));
    }
    
    @Test
    public void testListWithRepeatedValues() {
        int[] lst = new int[]{1, 2, 3, 4, 5, 6};
        assertTrue(IS_SORTED.is_sorted(lst));
    }
}
