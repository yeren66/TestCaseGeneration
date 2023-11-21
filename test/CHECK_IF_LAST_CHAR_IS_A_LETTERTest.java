package humaneval;
import static org.junit.Assert.*;
import java.util.Arrays;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {
    @Test
    public void testEmptyString() {
        String empty = "";
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(empty));
    }

    @Test
    public void testNonAlphaCharacter() {
        String nonAlpha = "123";
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(nonAlpha));
    }

    @Test
    public void testLastCharacterInWord() {
        String word = "apple pie";
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(word));
    }

    @Test
    public void testLastCharacterNotInWord() {
        String word = "apple pi e";
        assertTrue(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(word));
    }

    @Test
    public void testLastCharacterInWordWithTrailingSpace() {
        String word = "apple pi e ";
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(word));
    }
}