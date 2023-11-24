package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class SMALLEST_CHANGETest {
    @Test
    public void testSmallestChange() {
        int[] arr = new int[] {1, 2, 3, 5, 4, 7, 9, 6};
        assertEquals(4, humaneval.correct.SMALLEST_CHANGE.smallest_change(arr));
    }
}