package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SUM_SQUARED_NUMS;

public class SUM_SQUARED_NUMSTest {
    @Test
    public void sum_squared_numsTEST() {
        double[] lst1 = new double[]{1, 2, 3};
        assertEquals(14, SUM_SQUARED_NUMS.sum_squared_nums(lst1));

        double[] lst2 = new double[]{1, 4, 9};
        assertEquals(98, SUM_SQUARED_NUMS.sum_squared_nums(lst2));

        double[] lst3 = new double[]{1, 3, 5, 7};
        assertEquals(84, SUM_SQUARED_NUMS.sum_squared_nums(lst3));

        double[] lst4 = new double[]{1.4, 4.2, 0};
        assertEquals(29, SUM_SQUARED_NUMS.sum_squared_nums(lst4));

        double[] lst5 = new double[]{-2.4, 1, 1};
        assertEquals(6, SUM_SQUARED_NUMS.sum_squared_nums(lst5));
    }
}