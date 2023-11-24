
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class MIN_PATHTest {
    @Test
    public void min_pathTEST() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 3;
        
        int[] expected = {1, 2, 1};
        int[] actual = MIN_PATH.min_path(grid, k);
        assertArrayEquals(expected, actual);
    }
}
