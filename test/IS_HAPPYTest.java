package humaneval;
import static org.junit.Assert.*;

class IS_HAPPYTest {
    @Test
    public void testIsHappy() {
        assertFalse(IS_HAPPY.is_happy("")); // string is empty, so it's not happy
        
        assertFalse(IS_HAPPY.is_happy("a")); // length is less than 3, so it's not happy
        
        assertFalse(IS_HAPPY.is_happy("aa")); // length is less than 3, so it's not happy
        
        assertTrue(IS_HAPPY.is_happy("abcd")); // length is at least 3 and every 3 consecutive letters are distinct
        
        assertFalse(IS_HAPPY.is_happy("aabb")); // length is at least 3 but not all 3 consecutive letters are distinct
        
        assertTrue(IS_HAPPY.is_happy("adb")); // length is at least 3 and every 3 consecutive letters are distinct
        
        assertFalse(IS_HAPPY.is_happy("xyy")); // length is at least 3 but not all 3 consecutive letters are distinct
    }
}