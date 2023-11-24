
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_SIMPLE_POWERTest {
    @Test
    public void is_simple_powerTEST() {
        assertTrue(IS_SIMPLE_POWER.is_simple_power(1, 4));
        assertTrue(IS_SIMPLE_POWER.is_simple_power(2, 2));
        assertTrue(IS_SIMPLE_POWER.is_simple_power(8, 2));
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 2));
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 1));
        assertFalse(IS_SIMPLE_POWER.is_simple_power(5, 3));
    }
}
