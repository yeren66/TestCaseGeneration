    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ORDER_BY_POINTSTest {
    @Test
    public void order_by_pointsTEST() {
        Integer[] nums = new Integer[] {-1, -11, 1, -12, 11};
        ArrayList<Integer> expectedOutput = new ArrayList<Integer>();
        expectedOutput.add(-1);
        expectedOutput.add(-11);
        expectedOutput.add(1);
        expectedOutput.add(-12);
        expectedOutput.add(11);
        
        assertEquals("Failed to order list of integers by sum of their digits!", expectedOutput, ORDER_BY_POINTS.order_by_points(nums));
    }
}