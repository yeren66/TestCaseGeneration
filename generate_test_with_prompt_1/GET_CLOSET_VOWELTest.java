package humaneval;
import static org.junit.Assert.*;

public class GET_CLOSET_VOWELTest {
    @Test
    public void testGetClosestVowel() {
        assertEquals("u", humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("yogurt"));
        assertEquals("U", humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("FULL"));
        assertEquals("", humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("quick"));
        assertEquals("", humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel("ab"));
    }
}