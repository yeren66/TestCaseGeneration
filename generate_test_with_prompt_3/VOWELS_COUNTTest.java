package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class VOWELS_COUNTTest {
    @Test
    public void vowels_countTEST() {
        assertEquals(2, VOWELS_COUNT.vowels_count("abcde"));
        assertEquals(3, VOWELS_COUNT.vowels_count("ACEDY"));
        assertEquals(4, VOWELS_COUNT.vowels_count("ABCDEy"));
        assertEquals(5, VOWELS_COUNT.vowels_count("Aeiou"));
    }
}