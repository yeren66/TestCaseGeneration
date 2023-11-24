package humaneval;

import static org.junit.Assert.*;

public class IS_EQUAL_TO_SUM_EVENTest {
    @Test
    public void testIsEqualToSumEven() {
        assertFalse(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(4));
        assertFalse(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(6));
        assertTrue(IS_EQUAL_TO_SUM_EVEN.is_equal_to_sum_even(8));
    }
}