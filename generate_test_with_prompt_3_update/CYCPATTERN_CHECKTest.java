package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CYCPATTERN_CHECK;

public class CYCPATTERN_CHECKTest {
    @Test
    public void cycpattern_checkTEST() {
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("abcd", "abd")); // False because "abd" is not a substring in "abcd".
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("hello", "ell")); // True because "ell" is a substring in "hello".
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("whassup", "psus")); // False because "psus" is not a substring in "whassup".
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("abab", "baa")); // True because "baa" is a substring in "abab".
        assertFalse(CYCPATTERN_CHECK.cycpattern_check("efef", "eeff")); // False because "eeff" is not a substring in "efef".
        assertTrue(CYCPATTERN_CHECK.cycpattern_check("himenss", "simen")); // True because "simen" is a substring in "himenss".
    }
}