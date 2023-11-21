package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MIN_PATH {
    @Test
    public void testMinPath1() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 3;
        assertArrayEquals(new int[] {1, 2, 1}, humaneval.correct.MIN_PATH.min_path(grid, k));
    }

    @Test
    public void testMinPath2() {
        int[][] grid = {{5, 9, 3}, {4, 1, 6}, {7, 8, 2}};
        int k = 1;
        assertArrayEquals(new int[] {1}, humaneval.correct.MIN_PATH.min_path(grid, k));
    }
}