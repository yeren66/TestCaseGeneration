
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SUM_PRODUCTTest {
    @Test
    public void sum_productTEST() {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        Integer[] expectedResult = new Integer[]{6, 6};
        
        assertArrayEquals(expectedResult, SUM_PRODUCT.sum_product(numbers));
    }
}
