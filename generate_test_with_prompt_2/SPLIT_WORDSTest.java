package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class SPLIT_WORDSTest {
    @Test
    public void testSplitWordsWithWhitespace() {
        String input = "Hello world!";
        String[] expectedOutput = {"Hello", "world!"};
        
        assertArrayEquals(expectedOutput, humaneval.correct.SPLIT_WORDS.split_words(input));
    }
    
    @Test
    public void testSplitWordsWithComma() {
        String input = "Hello,world!";
        String[] expectedOutput = {"Hello", "world!"};
        
        assertArrayEquals(expectedOutput, humaneval.correct.SPLIT_WORDS.split_words(input));
    }
    
    @Test
    public void testSplitWordsWithoutWhitespaceOrComma() {
        String input = "abcdef";
        int expectedOutput = 3;
        
        assertEquals(expectedOutput, humaneval.correct.SPLIT_WORDS.split_words(input).length);
    }
}