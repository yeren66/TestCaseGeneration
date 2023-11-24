package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MAX_FILL;

public class MAX_FILLTest {
    @Test
    public void max_fillTEST() {
        // Test case 1:
        int[][] grid = new int[][]{{0, 0, 1, 0}, {0, 1, 0, 0}, {1, 1, 1, 1}};
        assertEquals(6, MAX_FILL.max_fill(grid, 1));
        
        // Test case 2:
        grid = new int[][]{{0, 0, 1, 1}, {0, 0, 0, 0}, {1, 1, 1, 1}, {0, 1, 1, 1}};
        assertEquals(5, MAX_FILL.max_fill(grid, 2));
        
        // Test case 3:
        grid = new int[][]{{0, 0, 0}, {0, 0, 0}};
        assertEquals(0, MAX_FILL.max_fill(grid, 5));
    }
}