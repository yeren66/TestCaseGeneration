package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_PRODUCTTest {
    @Test
    public void testSumProduct() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer[] result = humaneval.correct.SUM_PRODUCT.sum_product(numbers);
        assertEquals(6, result[0]);
        assertEquals(6, result[1]);
    }
}