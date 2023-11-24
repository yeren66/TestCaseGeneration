package humaneval;

import static org.junit.Assert.*;

public class DOUBLE_THE_DIFFERENCETest {
    @Test
    public void testDoubleTheDifference() {
        double[] lst = new double[4];
        lst[0] = 1;
        lst[1] = 3;
        lst[2] = 2;
        lst[3] = 0;
        assertEquals(10, humaneval.correct.DOUBLE_THE_DIFFERENCE.double_the_difference(lst));
    }
}
