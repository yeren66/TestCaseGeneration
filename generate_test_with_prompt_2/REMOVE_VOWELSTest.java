package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class REMOVE_VOWELSTest {
    @Test
    public void testRemoveVowels() {
        assertEquals("", humaneval.correct.REMOVE_VOWELS.remove_vowels(""));
        assertEquals("bcdf\nghjklm", humaneval.correct.REMOVE_VOWELS.remove_vowels("abcdef\nghijklm"));
        assertEquals("bcdf", humaneval.correct.REMOVE_VOWELS.remove_vowels("abcdef"));
        assertEquals("", humaneval.correct.REMOVE_VOWELS.remove_vowels("aaaaa"));
        assertEquals("B", humaneval.correct.REMOVE_VOWELS.remove_vowels("aaBAA"));
        assertEquals("zbcd", humaneval.correct.REMOVE_VOWELS.remove_vowels("zbcd"));
    }
}