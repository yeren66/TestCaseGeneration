package humaneval;
import static org.junit.jupiter.api.Assertions.*;

class MAKE_PALINDROMETest {
    @Test
    void testIsPalindrome() {
        // Test a palindrome string
        String str = "racecar";
        assertTrue(MAKE_PALINDROME.is_palindrome(str));

        // Test a non-palindrome string
        str = "hello";
        assertFalse(MAKE_PALINDROME.is_palindrome(str));
    }

    @Test
    void testMakePalindrome() {
        // Test a palindrome string with an empty suffix
        String str = "racecar";
        String result = MAKE_PALINDROME.make_palindrome(str);
        assertEquals("racecar", result);

        // Test a non-palindrome string with an empty suffix
        str = "hello";
        result = MAKE_PALINDROME.make_palindrome(str);
        assertEquals("hello", result);

        // Test a palindrome string with a non-empty suffix
        str = "racecarabc";
        result = MAKE_PALINDROME.make_palindrome(str);
        assertEquals("racecarabc", result);

        // Test a non-palindrome string with a non-empty suffix
        str = "helloabc";
        result = MAKE_PALINDROME.make_palindrome(str);
        assertEquals("helloabc", result);
    }
}