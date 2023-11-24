package humaneval;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class SPECIAL_FILTERTest {
    @Test
    public void testSpecialFilter() {
        int[] nums = new int[]{15, -73, 14, -15};
        assertEquals(1, humaneval.correct.SPECIAL_FILTER.special_filter(nums));
        
        nums = new int[]{33, -2, -3, 45, 21, 109};
        assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(nums));
    }
}
