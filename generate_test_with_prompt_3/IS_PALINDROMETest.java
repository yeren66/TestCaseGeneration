package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_PALINDROMETest {
    @Test
    public void is_palindromeTEST() {
        assertTrue(IS_PALINDROME.is_palindrome(""));
        assertTrue(IS_PALINDROME.is_palindrome("aba"));
        assertTrue(IS_PALINDROME.is_palindrome("aaaaa"));
        assertFalse(IS_PALINDROME.is_palindrome("zbcd"));
    }
}