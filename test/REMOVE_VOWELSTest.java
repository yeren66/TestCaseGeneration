package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.REMOVE_VOWELS;

public class REMOVE_VOWELSTest {
    @Test
    public void remove_vowelsTEST() {
        assertEquals("", REMOVE_VOWELS.remove_vowels(""));
        assertEquals("bcdf\nghjklm", REMOVE_VOWELS.remove_vowels("abcdef\nghijklm"));
        assertEquals("bcdf", REMOVE_VOWELS.remove_vowels("abcdef"));
        assertEquals("", REMOVE_VOWELS.remove_vowels("aaaaa"));
        assertEquals("B", REMOVE_VOWELS.remove_vowels("aaBAA"));
        assertEquals("zbcd", REMOVE_VOWELS.remove_vowels("zbcd"));
    }
}