package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class BELOW_THRESHOLDTest {
    @Test
    public void testBelowThreshold() {
        int[] list = new int[] {1, 2, 4, 10};
        assertTrue(BELOW_THRESHOLD.below_threshold(list, 100));
    }
    
    @Test
    public void testAboveThreshold() {
        int[] list = new int[] {1, 20, 4, 10};
        assertFalse(BELOW_THRESHOLD.below_threshold(list, 5));
    }
}
