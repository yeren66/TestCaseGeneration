package humaneval;
import org.junit.*;

public class MIN_SUBARRAY_SUMTest {
    @Test
    public void testMinSubArraySum() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(2L);
        nums.add(3L);
        nums.add(4L);
        nums.add(1L);
        nums.add(2L);
        nums.add(4L);
        
        long expected = 1L;
        long actual = humaneval.correct.MIN_SUBARRAY_SUM.min_subarray_sum(nums);
        
        Assert.assertEquals(expected, actual);
    }
}