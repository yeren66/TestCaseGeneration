package humaneval;
import static org.junit.Assert.*;

public class MAX_FILLTest {
    @Test
    public void testMaxFill() {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 0},
                new int[]{0, 1, 0, 0},
                new int[]{1, 1, 1, 1}
        };
        int bucket_capacity = 1;
        assertEquals(6, humaneval.correct.MAX_FILL.max_fill(grid, bucket_capacity));
    }
    
    @Test
    public void testMaxFillWithBucketCapacity2() {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 1},
                new int[]{0, 0, 0, 0},
                new int[]{1, 1, 1, 1},
                new int[]{0, 1, 1, 1}
        };
        int bucket_capacity = 2;
        assertEquals(5, humaneval.correct.MAX_FILL.max_fill(grid, bucket_capacity));
    }
    
    @Test
    public void testMaxFillWithBucketCapacity5() {
        int[][] grid = new int[][]{
                new int[]{0, 0, 0},
                new int[]{0, 0, 0}
        };
        int bucket_capacity = 5;
        assertEquals(0, humaneval.correct.MAX_FILL.max_fill(grid, bucket_capacity));
    }
    
    @Test
    public void testMaxFillWithInvalidGrid() {
        int[][] grid = new int[][]{
                new int[]{1, 2, 3},
                new int[]{4, 5, 6}
        };
        int bucket_capacity = 0;
        assertEquals(null, humaneval.correct.MAX_FILL.max_fill(grid, bucket_capacity));
    }
    
    @Test
    public void testMaxFillWithNegativeBucketCapacity() {
        int[][] grid = new int[][]{
                new int[]{0, 0, 1, 0},
                new int[]{0, 1, 0, 0},
                new int[]{1, 1, 1, 1}
        };
        int bucket_capacity = -1;
        assertEquals(null, humaneval.correct.MAX_FILL.max_fill(grid, bucket_capacity));
    }
}