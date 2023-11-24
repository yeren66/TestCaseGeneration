
package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_SORTED;
import java.util.HashMap;

public class IS_SORTEDTest {
    @Test
    public void is_sortedTEST() {
        int[] testList = new int[]{5};
        assertTrue(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 2, 3, 4, 5};
        assertTrue(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 3, 2, 4, 5};
        assertFalse(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 2, 3, 4, 5, 6};
        assertTrue(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertTrue(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 3, 2, 4, 5, 6, 7};
        assertFalse(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 2, 3, 4, 5, 6, 7};
        assertTrue(IS_SORTED.is_sorted(testList));

        testList = new int[]{1, 2, 2, 3, 3, 4};
        assertTrue(IS_SORTED.is_sorted(testList));
    }
}
