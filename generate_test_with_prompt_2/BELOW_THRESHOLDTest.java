package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class BELOW_THRESHOLDTest {
    @Test
    public void testBelowThreshold() {
        int[] l = new int[]{1, 2, 4, 10};
        boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(l, 100);
        assertTrue(result);
    }
    
    @Test
    public void testBelowThresholdWithInvalidInput() {
        int[] l = new int[]{1, 20, 4, 10};
        boolean result = humaneval.correct.BELOW_THRESHOLD.below_threshold(l, 5);
        assertFalse(result);
    }
}