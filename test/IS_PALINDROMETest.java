package humaneval;

import static org.junit.jupiter.api.Assertions.*;
import humaneval.correct.IS_PALINDROME;

class IS_PALINDROMETest {
    @Test
    void testIsPalindromeWithEmptyString() {
        assertTrue(IS_PALINDROME.is_palindrome(""));
    }
    
    @Test
    void testIsPalindromeWithStringLengthOne() {
        assertTrue(IS_PALINDROME.is_palindrome("a"));
    }
    
    @Test
    void testIsPalindromeWithStringLengthTwo() {
        assertTrue(IS_PALINDROME.is_palindrome("ab"));
    }
    
    @Test
    void testIsPalindromeWithStringLengthFive() {
        assertTrue(IS_PALINDROME.is_palindrome("aaaaa"));
    }
    
    @Test
    void testIsNotPalindromeWithNonMatchingCharacters() {
        assertFalse(IS_PALINDROME.is_palindrome("zbcd"));
    }
}
