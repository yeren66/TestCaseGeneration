
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GET_CLOSET_VOWELTest {
    @Test
    public void get_closet_vowelTEST() {
        assertEquals("u", GET_CLOSET_VOWEL.get_closest_vowel("yogurt"));
        assertEquals("U", GET_CLOSET_VOWEL.get_closest_vowel("FULL"));
        assertEquals("", GET_CLOSET_VOWEL.get_closest_vowel("quick"));
        assertEquals("", GET_CLOSET_VOWEL.get_closest_vowel("ab"));
    }
}
