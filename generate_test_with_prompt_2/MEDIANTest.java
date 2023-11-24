package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class MEDIANTest {
    @Test
    public void testMedian() {
        int[] list = new int[]{3, 1, 2, 4, 5};
        assertEquals(3, humaneval.correct.MEDIAN.median(list), 0);
        
        list = new int[]{-10, 4, 6, 1000, 10, 20};
        assertEquals(15.0, humaneval.correct.MEDIAN.median(list), 0);
    }
}