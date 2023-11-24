package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECKTest {
    @Test
    public void testCycPatternCheck() {
        // Check that the method returns true if the second word is a substring in the first word
        assertTrue(cycpattern_check("abcd", "abd"));

        // Check that the method returns false if the second word is not a substring in the first word
        assertFalse(cycpattern_check("hello", "ell"));

        // Check that the method returns true if the second word or any of its rotations is a substring in the first word
        assertTrue(cycpattern_check("whassup", "psus"));
    }
}
