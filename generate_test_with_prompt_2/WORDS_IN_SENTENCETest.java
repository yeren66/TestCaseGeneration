package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class WORDS_IN_SENTENCETest {
    
    @Test
    public void testWordsInSentence() {
        String sentence = "This is a test";
        String result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence(sentence);
        assertEquals("is", result);
        
        sentence = "lets go for swimming";
        result = humaneval.correct.WORDS_IN_SENTENCE.words_in_sentence(sentence);
        assertEquals("go for", result);
    }
}