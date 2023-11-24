
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class MAKE_PALINDROMETest {
    
    @Test
    public void testIsPalindrome() {
        String str = "racecar";
        assertTrue(MAKE_PALINDROME.is_palindrome(str));
        
        str = "level";
        assertFalse(MAKE_PALINDROME.is_palindrome(str));
    }
}
