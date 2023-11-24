package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CYCPATTERN_CHECKTest {
    @Test
    public void testCycpatternCheck() {
        String a = "abcd";
        String b = "abd";
        assertFalse(cycpattern_check(a, b));
        
        a = "hello";
        b = "ell";
        assertTrue(cycpattern_check(a, b));
        
        a = "whassup";
        b = "psus";
        assertFalse(cycpattern_check(a, b));
        
        a = "abab";
        b = "baa";
        assertTrue(cycpattern_check(a, b));
        
        a = "efef";
        b = "eeff";
        assertFalse(cycpattern_check(a, b));
        
        a = "himenss";
        b = "simen";
        assertTrue(cycpattern_check(a, b));
    }
}
