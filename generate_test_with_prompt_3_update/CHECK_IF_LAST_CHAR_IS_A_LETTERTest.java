package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CHECK_IF_LAST_CHAR_IS_A_LETTER;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {
    @Test
    public void check_if_last_char_is_a_letterTEST() {
        // Test case 1: input string is empty
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(""));
        
        // Test case 2: input string has no words
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("   "));
        
        // Test case 3: last character is not a letter
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
        
        // Test case 4: last character is a letter but not the last word
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pi e"));
        
        // Test case 5: last character is a letter and it's the last word
        assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter("apple pie"));
    }
}