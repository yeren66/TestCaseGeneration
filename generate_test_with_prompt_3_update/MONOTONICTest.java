package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MONOTONIC;
import java.util.Arrays;

public class MONOTONICTest {
    @Test
    public void monotonicTEST() {
        int[] array1 = new int[]{1, 2, 4, 20};
        assertTrue(MONOTONIC.monotonic(array1));
        
        int[] array2 = new int[]{1, 20, 4, 10};
        assertFalse(MONOTONIC.monotonic(array2));
        
        int[] array3 = new int[]{4, 1, 0, -10};
        assertTrue(MONOTONIC.monotonic(array3));
    }
}