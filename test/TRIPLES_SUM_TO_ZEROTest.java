
package humaneval;
import org.junit.Test;

import org.junit.Assert;
import static org.junit.Assert.*;
import humaneval.correct.TRIPLES_SUM_TO_ZERO;

public class TRIPLES_SUM_TO_ZEROTest {
    @Test
    public void triples_sum_to_zeroTEST() {
        // Test Case 1: [1, 3, 5, 0] should return False
        int[] numbers = new int[]{1, 3, 5, 0};
        boolean result = TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers);
        Assert.assertFalse(result);

        // Test Case 2: [1, 3, -2, 1] should return True
        numbers = new int[]{1, 3, -2, 1};
        result = TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers);
        Assert.assertTrue(result);

        // Test Case 3: [1, 2, 3, 7] should return False
        numbers = new int[]{1, 2, 3, 7};
        result = TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers);
        Assert.assertFalse(result);

        // Test Case 4: [2, 4, -5, 3, 9, 7] should return True
        numbers = new int[]{2, 4, -5, 3, 9, 7};
        result = TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers);
        Assert.assertTrue(result);

        // Test Case 5: [1] should return False
        numbers = new int[]{1};
        result = TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers);
        Assert.assertFalse(result);
    }
}
