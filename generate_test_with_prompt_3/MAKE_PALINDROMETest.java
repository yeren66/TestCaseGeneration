package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class MAKE_PALINDROMETest {
    @Test
    public void is_palindromeTEST() {
        // Test case 1: empty string
        assertTrue(MAKE_PALINDROME.is_palindrome(""));

        // Test case 2: single character
        assertTrue(MAKE_PALINDROME.is_palindrome("a"));
        assertFalse(MAKE_PALINDROME.is_palindrome("b"));

        // Test case 3: two characters
        assertTrue(MAKE_PALINDROME.is_palindrome("ab"));
        assertFalse(MAKE_PALINDROME.is_palindrome("ba"));

        // Test case 4: more than two characters
        assertTrue(MAKE_PALINDROME.is_palindrome("racecar"));
        assertFalse(MAKE_PALINDROME.is_palindrome("not a palindrome"));
    }
}