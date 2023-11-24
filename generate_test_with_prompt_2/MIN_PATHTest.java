package humaneval;
import static org.junit.Assert.*;
import java.util.*;

public class MIN_PATHTest {
    @Test
    public void testMinPath() {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int k = 3;
        assertArrayEquals(new int[] {1, 2, 1}, humaneval.correct.MIN_PATH.min_path(grid, k));
    }

    @Test
    public void testMinPathWithKEqualToOne() {
        int[][] grid = {{5, 9, 3}, {4, 1, 6}, {7, 8, 2}};
        int k = 1;
        assertArrayEquals(new int[] {1}, humaneval.correct.MIN_PATH.min_path(grid, k));
    }
}