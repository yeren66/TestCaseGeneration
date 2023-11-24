
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SPECIAL_FILTER;
import java.util.ArrayList;
import java.util.Arrays;
public class SPECIAL_FILTERTest {
    @Test
    public void special_filterTEST() {
        // Test case 1: [15, -73, 14, -15]
        int[] nums = new int[]{15, -73, 14, -15};
        int expected = 1;
        int actual = SPECIAL_FILTER.special_filter(nums);
        assertEquals(expected, actual);
        // Test case 2: [33, -2, -3, 45, 21, 109]
        nums = new int[]{33, -2, -3, 45, 21, 109};
        expected = 2;
        actual = SPECIAL_FILTER.special_filter(nums);
        assertEquals(expected, actual);
    }
}