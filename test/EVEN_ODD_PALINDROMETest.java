package humaneval;

import static org.junit.Assert.*;

public class EVEN_ODD_PALINDROMETest {
    @Test
    public void testIsPalindrome() {
        assertTrue(EVEN_ODD_PALINDROME.is_palindrome(121));
        assertFalse(EVEN_ODD_PALINDROME.is_palindrome(123));
    }
    
    @Test
    public void testEvenOddPalindrome() {
        assertEquals(Arrays.asList(0, 0), EVEN_ODD_PALINDROME.even_odd_palindrome(0));
        assertEquals(Arrays.asList(1, 0), EVEN_ODD_PALINDROME.even_odd_palindrome(1));
        assertEquals(Arrays.asList(1, 1), EVEN_ODD_PALINDROME.even_odd_palindrome(2));
        assertEquals(Arrays.asList(2, 0), EVEN_ODD_PALINDROME.even_odd_palindrome(3));
    }
}