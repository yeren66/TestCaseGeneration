package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class REMOVE_VOWELSTest {
    @Test
    public void testEmptyString() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("");
        assertEquals(result, "");
    }

    @Test
    public void testNoVowels() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("abcdefghijklm");
        assertEquals(result, "bcdf\nghjklm");
    }

    @Test
    public void testSingleVowel() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("a");
        assertEquals(result, "");
    }

    @Test
    public void testMultipleVowels() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("aaaaa");
        assertEquals(result, "");
    }

    @Test
    public void testUppercaseVowel() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("aaBAA");
        assertEquals(result, "B");
    }

    @Test
    public void testLowercaseVowel() {
        String result = humaneval.correct.REMOVE_VOWELS.remove_vowels("zbcd");
        assertEquals(result, "zbcd");
    }
}