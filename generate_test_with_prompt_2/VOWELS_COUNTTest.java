package humaneval;
import static org.junit.Assert.*;

public class VOWELS_COUNTTest {
    @Test
    public void testVowelsCount() {
        // Test case 1: "abcde" should return 2 vowels
        assertEquals(2, humaneval.correct.VOWELS_COUNT.vowels_count("abcde"));
        
        // Test case 2: "ACEDY" should return 3 vowels
        assertEquals(3, humaneval.correct.VOWELS_COUNT.vowels_count("ACEDY"));
    }
}