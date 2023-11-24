package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_HAPPY;

public class IS_HAPPYTest {
    @Test
    public void is_happyTEST() {
        assertFalse(IS_HAPPY.is_happy(""));
        assertFalse(IS_HAPPY.is_happy("a"));
        assertFalse(IS_HAPPY.is_happy("aa"));
        assertTrue(IS_HAPPY.is_happy("abcd"));
        assertFalse(IS_HAPPY.is_happy("aabb"));
        assertTrue(IS_HAPPY.is_happy("adb"));
        assertFalse(IS_HAPPY.is_happy("xyy"));
    }
}