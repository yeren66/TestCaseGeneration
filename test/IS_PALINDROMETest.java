package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_PALINDROME;

public class IS_PALINDROMETest {
    @Test
    public void is_palindromeTEST() {
        // Test case 1: empty string
        String text = "";
        assertTrue(IS_PALINDROME.is_palindrome(text));

        // Test case 2: single character
        text = "a";
        assertTrue(IS_PALINDROME.is_palindrome(text));

        // Test case 3: multiple characters, all same
        text = "aaaaaa";
        assertTrue(IS_PALINDROME.is_palindrome(text));

        // Test case 4: multiple characters, different
        text = "abcd";
        assertFalse(IS_PALINDROME.is_palindrome(text));
    }
}