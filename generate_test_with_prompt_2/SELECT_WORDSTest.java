package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SELECT_WORDSTest {
    @Test
    public void testSelectWords() {
        String s = "Mary had a little lamb";
        int n = 4;
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("little");
        
        assertEquals(expectedResult, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWordsWithMultipleMatches() {
        String s = "Mary had a little lamb";
        int n = 3;
        ArrayList<String> expectedResult = new ArrayList<>();
        expectedResult.add("Mary");
        expectedResult.add("lamb");
        
        assertEquals(expectedResult, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWordsWithNoMatches() {
        String s = "simple white space";
        int n = 2;
        ArrayList<String> expectedResult = new ArrayList<>();
        
        assertEquals(expectedResult, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWordsWithEmptyInput() {
        String s = "";
        int n = 4;
        ArrayList<String> expectedResult = new ArrayList<>();
        
        assertEquals(expectedResult, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
    
    @Test
    public void testSelectWordsWithInvalidInput() {
        String s = "Hello world";
        int n = -1;
        ArrayList<String> expectedResult = new ArrayList<>();
        
        assertEquals(expectedResult, humaneval.correct.SELECT_WORDS.select_words(s, n));
    }
}