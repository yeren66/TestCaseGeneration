package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class SPECIAL_FILTERTest {
    @Test
    public void special_filterTEST() {
        // Test case 1: empty array input
        int[] nums = {};
        assertEquals(0, SPECIAL_FILTER.special_filter(nums));
        
        // Test case 2: one element array input with the first and last digits of the number are both odd
        nums = new int[]{15};
        assertEquals(1, SPECIAL_FILTER.special_filter(nums));
        
        // Test case 3: multiple elements array input with some numbers that meet the condition
        nums = new int[]{15, -73, 14, -15};
        assertEquals(2, SPECIAL_FILTER.special_filter(nums));
        
        // Test case 4: multiple elements array input with all numbers that do not meet the condition
        nums = new int[]{-73, 19, -15};
        assertEquals(0, SPECIAL_FILTER.special_filter(nums));
    }
}