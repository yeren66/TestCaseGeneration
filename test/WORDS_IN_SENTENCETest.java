package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.WORDS_IN_SENTENCE;

public class WORDS_IN_SENTENCETest {
    @Test
    public void words_in_sentenceTEST() {
        String sentence = "This is a test";
        String expectedResult = "is";

        assertEquals(expectedResult, WORDS_IN_SENTENCE.words_in_sentence(sentence));
    }
}