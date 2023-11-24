package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class IS_SORTEDTest {
    @Test
    public void is_sortedTEST() {
        // Test case 1: empty list
        int[] lst = new int[0];
        assertFalse(IS_SORTED.is_sorted(lst));
        
        // Test case 2: single number
        lst = new int[]{5};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        // Test case 3: ascending order
        lst = new int[]{1, 2, 3, 4, 5};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        // Test case 4: descending order
        lst = new int[]{5, 4, 3, 2, 1};
        assertFalse(IS_SORTED.is_sorted(lst));
        
        // Test case 5: duplicate numbers
        lst = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertFalse(IS_SORTED.is_sorted(lst));
    }
}