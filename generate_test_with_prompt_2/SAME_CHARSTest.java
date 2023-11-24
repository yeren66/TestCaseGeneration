package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SAME_CHARSTest {
    @Test
    public void testSameChars() {
        assertTrue(SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddeddabc"));
        assertTrue(SAME_CHARS.same_chars("abcd", "dddddddabc"));
        assertTrue(SAME_CHARS.same_chars("dddddddabc", "abcd"));
        assertFalse(SAME_CHARS.same_chars("eabcd", "dddzzzzzzzddddabc"));
        assertFalse(SAME_CHARS.same_chars("abcd", "dddddddabce"));
        assertFalse(SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddddabc"));
    }
}