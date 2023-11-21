package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HISTOGRAMTest {
    @Test
    public void testHistogram_singleLetter() {
        String s = "a";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
    
    @Test
    public void testHistogram_multipleLetters() {
        String s = "abcd";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        expected.put('d', 1);
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
    
    @Test
    public void testHistogram_sameLetter() {
        String s = "aaa";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 3);
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
    
    @Test
    public void testHistogram_emptyString() {
        String s = "";
        HashMap<Character, Integer> expected = new HashMap<>();
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
}