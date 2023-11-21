package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class MAX_FILLTest {
    @Test
    public void testMaxFill() {
        int[][] grid = {{0, 0, 1, 0}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        int bucketCapacity = 1;
        assertEquals(6, humaneval.correct.MAX_FILL.max_fill(grid, bucketCapacity));
    }
}
