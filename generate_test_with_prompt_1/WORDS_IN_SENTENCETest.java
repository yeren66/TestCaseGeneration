package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WORDS_IN_SENTENCETest {
    @Test
    public void test_1() {
        String sentence = "This is a test";
        String expectedResult = "is";
        assertEquals(expectedResult, humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence(sentence));
    }

    @Test
    public void test_2() {
        String sentence = "lets go for swimming";
        String expectedResult = "go for";
        assertEquals(expectedResult, humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence(sentence));
    }

    @Test
    public void test_3() {
        String sentence = "This is a test of the system";
        String expectedResult = "is the";
        assertEquals(expectedResult, humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence(sentence));
    }
}