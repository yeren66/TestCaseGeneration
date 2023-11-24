package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class MIN_SUBARRAY_SUMTest {
    @Test
    public void min_subarray_sumTEST() {
        ArrayList<Long> nums = new ArrayList<>();
        nums.add(2L);
        nums.add(3L);
        nums.add(4L);
        nums.add(1L);
        nums.add(2L);
        nums.add(4L);
        
        assertEquals(-6, MIN_SUBARRAY_SUM.min_subarray_sum(nums));
    }
}