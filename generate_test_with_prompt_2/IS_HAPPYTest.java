package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IS_HAPPYTest {
    @Test
    void testIsHappy() {
        assertFalse(IS_HAPPY.is_happy("a"));
        assertFalse(IS_HAPPY.is_happy("aa"));
        assertTrue(IS_HAPPY.is_happy("abcd"));
        assertFalse(IS_HAPPY.is_happy("aabb"));
        assertTrue(IS_HAPPY.is_happy("adb"));
        assertFalse(IS_HAPPY.is_happy("xyy"));
    }
}