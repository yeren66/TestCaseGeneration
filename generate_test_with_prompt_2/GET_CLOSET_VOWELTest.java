package humaneval;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

public class GET_CLOSET_VOWELTest {
    @Test
    public void testGetClosestVowel() {
        String word = "yogurt";
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        
        for (int i = word.length() - 2; i > 0; i--) {
            if (vowels.contains(word.charAt(i))) {
                assertEquals("u", humaneval.correct.GET_CLOSET_VOWEL.get_closet_vowel(word));
            }
        }
    }
}