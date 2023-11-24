package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SELECT_WORDSTest {
    
    @Test
    public void testSelectWords() {
        String s = "Mary had a little lamb";
        int n = 4;
        List<String> expected = new ArrayList<>();
        expected.add("little");
        assertEquals(expected, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWords2() {
        String s = "Mary had a little lamb";
        int n = 3;
        List<String> expected = new ArrayList<>();
        expected.add("Mary");
        expected.add("lamb");
        assertEquals(expected, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWords3() {
        String s = "simple white space";
        int n = 2;
        List<String> expected = new ArrayList<>();
        assertEquals(expected, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWords4() {
        String s = "Hello world";
        int n = 4;
        List<String> expected = new ArrayList<>();
        assertEquals(expected, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWords5() {
        String s = "Uncle sam";
        int n = 3;
        List<String> expected = new ArrayList<>();
        assertEquals(expected, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
}