package humaneval;
import org.junit.Test;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.VOWELS_COUNT;

public class VOWELS_COUNTTest {
    @Test
    public void vowels_countTEST() {
        assertEquals(2, VOWELS_COUNT.vowels_count("abcde"));
        assertEquals(3, VOWELS_COUNT.vowels_count("ACEDY"));
        assertEquals(4, VOWELS_COUNT.vowels_count("AacedIUy"));
        assertEquals(0, VOWELS_COUNT.vowels_count(""));
    }
}