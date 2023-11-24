
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_SIMPLE_POWER;

public class IS_SIMPLE_POWERTest {
    @Test
    public void is_simple_powerTEST() {
        assertTrue(IS_SIMPLE_POWER.is_simple_power(1, 4)); // simple power of 4
        assertFalse(IS_SIMPLE_POWER.is_simple_power(2, 3)); // not a simple power of 3
        assertTrue(IS_SIMPLE_POWER.is_simple_power(8, 2)); // simple power of 2
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 1)); // not a simple power of 1
    }
}
