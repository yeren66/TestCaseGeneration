package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CHECK_IF_LAST_CHAR_IS_A_LETTERTest {
    @Test
    public void check_if_last_char_is_a_letterTEST() {
        String txt = "apple pie";
        assertFalse(CHECK_IF_LAST_CHAR_IS_A_LETTER.check_if_last_char_is_a_letter(txt));
    }
}