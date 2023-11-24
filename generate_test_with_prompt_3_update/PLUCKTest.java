package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PLUCK;

public class PLUCKTest {
    @Test
    public void pluckTEST() {
        // Test case 1: empty array input
        int[] arr = {};
        assertArrayEquals(new int[]{}, PLUCK.pluck(arr));
        
        // Test case 2: one even node with smallest index
        arr = new int[]{4,2,3};
        assertArrayEquals(new int[]{2,1}, PLUCK.pluck(arr));
        
        // Test case 3: multiple nodes with the same smallest even value but different indices
        arr = new int[]{1,2,3};
        assertArrayEquals(new int[]{2,1}, PLUCK.pluck(arr));
        
        // Test case 4: no even values or empty array input
        arr = new int[]{5,0,3,0,4,2};
        assertArrayEquals(new int[]{0,1}, PLUCK.pluck(arr));
    }
}