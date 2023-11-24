package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MIN_PATH;

public class MIN_PATHTest extends junit.framework.TestCase {
    @Test
    public void min_pathTEST() {
        // Test case 1: grid size = 3, k = 2
        int[][] grid = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = i * 3 + j + 1;
            }
        }
        int k = 2;
        int[] expected = new int[]{1, 2};
        int[] actual = MIN_PATH.min_path(grid, k);
        assertArrayEquals(expected, actual);
        
        // Test case 2: grid size = 4, k = 3
        grid = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                grid[i][j] = i * 4 + j + 1;
            }
        }
        k = 3;
        expected = new int[]{1, 2, 3};
        actual = MIN_PATH.min_path(grid, k);
        assertArrayEquals(expected, actual);
    }
}