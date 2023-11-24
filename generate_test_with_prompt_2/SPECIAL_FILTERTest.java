package humaneval;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;

public class SPECIAL_FILTERTest {
    @Test
    public void testSpecialFilter() {
        int[] nums = new int[]{15, -73, 14, -15};
        Assert.assertEquals(1, humaneval.correct.SPECIAL_FILTER.special_filter(nums));
        
        nums = new int[]{33, -2, -3, 45, 21, 109};
        Assert.assertEquals(2, humaneval.correct.SPECIAL_FILTER.special_filter(nums));
    }
}