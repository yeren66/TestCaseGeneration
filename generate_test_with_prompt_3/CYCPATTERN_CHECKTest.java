
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECKTest {
    @Test
    public void cycpattern_checkTEST() {
        // Test case 1: "abcd" and "abd" should return false
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("abcd", "abd"));

        // Test case 2: "hello" and "ell" should return true
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("hello", "ell"));

        // Test case 3: "whassup" and "psus" should return false
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("whassup", "psus"));

        // Test case 4: "abab" and "baa" should return true
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abab", "baa"));

        // Test case 5: "efef" and "eeff" should return false
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("efef", "eeff"));

        // Test case 6: "himenss" and "simen" should return true
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("himenss", "simen"));
    }
}
