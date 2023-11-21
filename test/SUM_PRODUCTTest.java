package humaneval;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class SUM_PRODUCTTest {
    @Test
    public void testSumProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer[] result = humaneval.correct.SUM_PRODUCT.sum_product(numbers);
        
        assertArrayEquals(new Integer[]{6, 6}, result);
    }
    
    @Test
    public void testSumProductWithNegativeNumbers() {
        List<Integer> numbers = Arrays.asList(-1, -2, -3);
        Integer[] result = humaneval.correct.SUM_PRODUCT.sum_product(numbers);
        
        assertArrayEquals(new Integer[]{-6, 6}, result);
    }
    
    @Test
    public void testSumProductWithZeroNumbers() {
        List<Integer> numbers = Arrays.asList();
        Integer[] result = humaneval.correct.SUM_PRODUCT.sum_product(numbers);
        
        assertArrayEquals(new Integer[]{0, 1}, result);
    }
}
