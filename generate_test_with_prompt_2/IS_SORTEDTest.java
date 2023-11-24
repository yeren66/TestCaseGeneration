package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class IS_SORTEDTest {
    @Test
    public void testIsSorted() {
        int[] lst = new int[]{5};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 3, 4, 5};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 3, 2, 4, 5};
        assertFalse(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 3, 4, 5, 6};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 3, 2, 4, 5, 6, 7};
        assertFalse(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 2, 3, 3, 4};
        assertTrue(IS_SORTED.is_sorted(lst));
        
        lst = new int[]{1, 2, 2, 2, 3, 4};
        assertFalse(IS_SORTED.is_sorted(lst));
    }
}