package humaneval;
import static org.junit.Assert.*;

public class IS_SIMPLE_POWERTest {
    @Test
    public void testIsSimplePower() {
        assertTrue(IS_SIMPLE_POWER.is_simple_power(1, 4)); // true
        assertTrue(IS_SIMPLE_POWER.is_simple_power(2, 2)); // true
        assertTrue(IS_SIMPLE_POWER.is_simple_power(8, 2)); // true
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 2)); // false
        assertFalse(IS_SIMPLE_POWER.is_simple_power(3, 1)); // false
        assertFalse(IS_SIMPLE_POWER.is_simple_power(5, 3)); // false
    }
}