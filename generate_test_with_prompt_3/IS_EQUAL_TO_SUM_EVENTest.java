
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_EQUAL_TO_SUM_EVENTest {
    @Test
    public void is_equal_to_sum_evenTEST() {
        assertEquals(false, IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
        assertEquals(false, IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
        assertEquals(true, IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }
}
