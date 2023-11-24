package humaneval;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class EVEN_ODD_PALINDROMETest {
    @Test
    public void testIsPalindrome() {
        assertTrue(EVEN_ODD_PALINDROME.is_palindrome(1)); // 1 is a palindrome
        assertFalse(EVEN_ODD_PALINDROME.is_palindrome(2)); // 2 is not a palindrome
        assertTrue(EVEN_ODD_PALINDROME.is_palindrome(567756)); // 567756 is a palindrome
    }
}