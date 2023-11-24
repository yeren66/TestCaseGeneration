package humaneval;

import static org.junit.Assert.*;

public class WORDS_IN_SENTENCETest {
    @Test
    public void words_in_sentenceTEST() {
        String sentence = "This is a test";
        assertEquals("is", WORDS_IN_SENTENCE.words_in_sentence(sentence));
        
        sentence = "lets go for swimming";
        assertEquals("go for", WORDS_IN_SENTENCE.words_in_sentence(sentence));
    }
}