
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SUM_PRODUCT;
import java.util.List;

public class SUM_PRODUCTTest {
    @Test
    public void sum_productTEST() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer[] result = SUM_PRODUCT.sum_product(numbers);
        assertArrayEquals(new Integer[]{6, 6}, result);
    }
}