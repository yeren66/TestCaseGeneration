package humaneval;

import static org.junit.Assert.*;

public class GREATEST_COMMON_DIVISORTest {
    @Test
    public void testGreatestCommonDivisor() {
        int a = 12;
        int b = 15;
        assertEquals(3, humaneval.correct.GREATEST_COMMON_DIVISOR.greatest_common_divisor(a, b));
    }
}
