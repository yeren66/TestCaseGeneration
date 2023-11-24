package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {

    @Test
    public void testCheckIfLastCharIsALetter() {
        String input = "apple pie";
        boolean expected = false;
        boolean actual = humaneval.correct.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIfLastCharIsALetter2() {
        String input = "apple pi e";
        boolean expected = true;
        boolean actual = humaneval.correct.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIfLastCharIsALetter3() {
        String input = "apple pi e ";
        boolean expected = false;
        boolean actual = humaneval.correct.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(input);
        assertEquals(expected, actual);
    }

    @Test
    public void testCheckIfLastCharIsALetter4() {
        String input = "";
        boolean expected = false;
        boolean actual = humaneval.correct.CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(input);
        assertEquals(expected, actual);
    }
}
