
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class GREATEST_COMMON_DIVISORTest {
    @Test
    public void testGreatestCommonDivisor() {
        int expected = 2;
        int actual = humaneval.correct.GREATEST_COMMON_DIVISOR.greatest_common_divisor(4, 6);
        assertEquals("Expected greatest common divisor of 4 and 6 to be 2", expected, actual);
    }
}
