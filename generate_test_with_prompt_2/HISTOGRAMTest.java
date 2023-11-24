package humaneval;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.*;

public class HISTOGRAMTest {
    @Test
    public void testHistogram() {
        String s = "a b c";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 1);
        expected.put('b', 1);
        expected.put('c', 1);
        
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
    
    @Test
    public void testHistogram_SameLetter() {
        String s = "a b b a";
        HashMap<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 2);
        
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
    
    @Test
    public void testHistogram_EmptyString() {
        String s = "";
        HashMap<Character, Integer> expected = new HashMap<>();
        
        assertEquals(expected, humaneval.correct.HISTOGRAM.histogram(s));
    }
}