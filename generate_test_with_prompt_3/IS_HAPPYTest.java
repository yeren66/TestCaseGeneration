
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_HAPPYTest {
    @Test
    public void is_happyTEST() {
        assertTrue(IS_HAPPY.is_happy(""));
        assertFalse(IS_HAPPY.is_happy("a"));
        assertFalse(IS_HAPPY.is_happy("aa"));
        assertTrue(IS_HAPPY.is_happy("abcd"));
        assertFalse(IS_HAPPY.is_happy("aabb"));
        assertTrue(IS_HAPPY.is_happy("adb"));
        assertFalse(IS_HAPPY.is_happy("xyy"));
    }
}
