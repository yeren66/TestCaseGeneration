    
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class MONOTONICTest {
    @Test
    public void monotonicTEST() {
        int[] list1 = new int[]{4, 1, 0, -10};
        assertTrue(MONOTONIC.monotonic(list1));
        
        int[] list2 = new int[]{1, 2, 4, 20};
        assertTrue(MONOTONIC.monotonic(list2));
        
        int[] list3 = new int[]{1, 20, 4, 10};
        assertFalse(MONOTONIC.monotonic(list3));
    }
}