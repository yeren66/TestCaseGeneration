package humaneval;
import static org.junit.Assert.*;

public class SMALLEST_CHANGETest {
    @Test
    public void smallestChange_example1() {
        int[] arr = new int[] { 1, 2, 3, 5, 4, 7, 9, 6 };
        assertEquals(4, humaneval.correct.SMALLEST_CHANGE.smallest_change(arr));
    }
    
    @Test
    public void smallestChange_example2() {
        int[] arr = new int[] { 1, 2, 3, 4, 3, 2, 2 };
        assertEquals(1, humaneval.correct.SMALLEST_CHANGE.smallest_change(arr));
    }
    
    @Test
    public void smallestChange_example3() {
        int[] arr = new int[] { 1, 2, 3, 2, 1 };
        assertEquals(0, humaneval.correct.SMALLEST_CHANGE.smallest_change(arr));
    }
}