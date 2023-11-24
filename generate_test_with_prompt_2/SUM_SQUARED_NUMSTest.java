package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_SQUARED_NUMSTest {
    @Test
    public void testSumSquaredNums() {
        double[] lst = new double[]{1, 2, 3};
        assertEquals(14, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
        
        lst = new double[]{1, 4, 9};
        assertEquals(98, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
        
        lst = new double[]{1, 3, 5, 7};
        assertEquals(84, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
        
        lst = new double[]{1.4, 4.2, 0};
        assertEquals(29, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
        
        lst = new double[]{-2.4, 1, 1};
        assertEquals(6, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
    }
}