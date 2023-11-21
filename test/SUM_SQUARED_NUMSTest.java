package humaneval;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SUM_SQUARED_NUMSTest {
    @BeforeEach
    public void setUp() {
        // Set up test data here
    }
    
    @Test
    public void testSumSquaredNums() {
        double[] lst = new double[3];
        lst[0] = 1;
        lst[1] = 2;
        lst[2] = 3;
        
        assertEquals(14, humaneval.correct.SUM_SQUARED_NUMS.sum_squared_nums(lst));
    }
}
