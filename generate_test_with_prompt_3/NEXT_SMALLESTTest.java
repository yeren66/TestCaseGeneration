package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util;

public class NEXT_SMALLESTTest {
    @Test
    public void next_smallestTEST() {
        Integer[] testList = {1, 2, 3, 4, 5};
        assertEquals(NEXT_SMALLEST.next_smallest(testList), 2);
        
        testList = new Integer[]{5, 1, 4, 3, 2};
        assertEquals(NEXT_SMALLEST.next_smallest(testList), 2);
    }
}