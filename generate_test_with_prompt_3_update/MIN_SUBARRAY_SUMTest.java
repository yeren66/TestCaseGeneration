package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MIN_SUBARRAY_SUM;
import java.util.ArrayList;

public class MIN_SUBARRAY_SUMTest {
    @Test
    public void min_subarray_sumTEST() {
        // Test case 1: Empty input array
        ArrayList<Long> nums = new ArrayList<>();
        long result = MIN_SUBARRAY_SUM.min_subarray_sum(nums);
        assertEquals(-1, result);

        // Test case 2: Input array with negative values
        nums = new ArrayList<>();
        nums.add((long)-3);
        nums.add((long)-5);
        nums.add((long)-8);
        result = MIN_SUBARRAY_SUM.min_subarray_sum(nums);
        assertEquals(-16, result);

        // Test case 3: Input array with positive values
        nums = new ArrayList<>();
        nums.add((long)2);
        nums.add((long)4);
        nums.add((long)5);
        result = MIN_SUBARRAY_SUM.min_subarray_sum(nums);
        assertEquals(-1, result);
    }
}