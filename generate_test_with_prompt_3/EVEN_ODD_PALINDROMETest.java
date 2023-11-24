package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class EVEN_ODD_PALINDROMETest {
    @Test
    public void is_palindromeTEST() {
        assertTrue(EVEN_ODD_PALINDROME.is_palindrome(123456789));
        assertFalse(EVEN_ODD_PALINDROME.is_palindrome(12345678));
    }
}