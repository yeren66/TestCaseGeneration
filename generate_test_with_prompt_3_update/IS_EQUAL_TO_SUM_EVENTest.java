
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_EQUAL_TO_SUM_EVEN;

public class IS_EQUAL_TO_SUM_EVENTest {
    @Test
    public void is_equal_to_sum_evenTEST() {
        assertTrue(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
        assertFalse(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
        assertTrue(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }
}
