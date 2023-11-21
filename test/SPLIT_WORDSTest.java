package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;
import humaneval.correct.SPLIT_WORDS;

public class SPLIT_WORDSTest {
    @Test
    public void testSplitWords() {
        String txt = "Hello world!";
        String[] expectedResult = {"Hello", "world!"};
        assertArrayEquals(expectedResult, humaneval.correct.SPLIT_WORDS.split_words(txt));
    }
}
