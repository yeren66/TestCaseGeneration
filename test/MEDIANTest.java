package humaneval;

import static org.junit.Assert.*;

public class MEDIANTest {
    @Test
    public void testMedianOddLength() {
        int[] list = new int[]{3, 1, 2, 4, 5};
        double expected = 3;
        assertEquals(expected, humaneval.correct.MEDIAN.median(list), 0);
    }
    
    @Test
    public void testMedianEvenLength() {
        int[] list = new int[]{-10, 4, 6, 1000, 10, 20};
        double expected = 15.0;
        assertEquals(expected, humaneval.correct.MEDIAN.median(list), 0);
    }
}
