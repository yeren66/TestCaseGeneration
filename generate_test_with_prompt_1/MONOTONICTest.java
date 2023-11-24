package humaneval;
import static org.junit.Assert.*;

public class MONOTONICTest {
    @Test
    public void testMonotonicIncreasing() {
        int[] input = new int[] {1, 2, 4, 20};
        assertTrue(MONOTONIC.monotonic(input));
    }
    
    @Test
    public void testMonotonicDecreasing() {
        int[] input = new int[] {1, 20, 4, 10};
        assertFalse(MONOTONIC.monotonic(input));
    }
    
    @Test
    public void testMonotonicEqual() {
        int[] input = new int[] {4, 1, 0, -10};
        assertTrue(MONOTONIC.monotonic(input));
    }
}