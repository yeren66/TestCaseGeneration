package humaneval;

import static org.junit.Assert.*;

public class MIN_SUBARRAY_SUMTest {
    @Test
    public void testMinSubarraySum() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(2L);
        nums.add(3L);
        nums.add(4L);
        nums.add(1L);
        nums.add(2L);
        nums.add(4L);
        
        long actual = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(nums);
        assertEquals(-6, actual);
    }
}
