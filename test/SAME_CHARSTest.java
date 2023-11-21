package humaneval;
import static org.junit.Assert.*;
import java.util.*;

public class SAME_CHARSTest {
    @Test
    public void testSameCharsWithNoMatchingCharacters() {
        assertFalse(SAME_CHARS.same_chars("eabcdzzzz", "dddzzzzzzzddeddabc"));
        assertFalse(SAME_CHARS.same_chars("abcd", "dddddddabc"));
        assertFalse(SAME_CHARS.same_chars("dddddddabc", "abcd"));
    }
    
    @Test
    public void testSameCharsWithMatchingCharacters() {
        assertTrue(SAME_CHARS.same_chars("eabcd", "dddzzzzzzzddeddabc"));
        assertTrue(SAME_CHARS.same_chars("abcd", "dddddddabc"));
        assertTrue(SAME_CHARS.same_chars("dddddddabc", "abcd"));
    }
}