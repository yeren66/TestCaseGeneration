    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class LARGEST_SMALLEST_INTEGERSTest {
    @Test
    public void largest_smallest_integersTEST() {
        int[] result = LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{2, 4, 1, 3, 5, 7});
        assertArrayEquals(result, new int[]{Integer.MIN_VALUE, 1});
    }
    
    @Test
    public void largest_smallest_integersTEST2() {
        int[] result = LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{0});
        assertArrayEquals(result, new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE});
    }
    
    @Test
    public void largest_smallest_integersTEST3() {
        int[] result = LARGEST_SMALLEST_INTEGERS.largest_smallest_integers(new int[]{});
        assertArrayEquals(result, new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE});
    }
}