package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class MONOTONICTest {
    
    @Test
    public void testMonotonic_Increasing() {
        int[] list = new int[]{1, 2, 4, 20};
        
        assertTrue(MONOTONIC.monotonic(list));
    }
    
    @Test
    public void testMonotonic_Decreasing() {
        int[] list = new int[]{1, 20, 4, 10};
        
        assertFalse(MONOTONIC.monotonic(list));
    }
    
    @Test
    public void testMonotonic_RandomList() {
        int[] list = new int[]{4, 1, 0, -10};
        
        assertTrue(MONOTONIC.monotonic(list));
    }
}