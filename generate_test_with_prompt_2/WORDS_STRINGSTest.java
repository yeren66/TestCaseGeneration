package humaneval;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class WORDS_STRINGSTest {
    @Test
    public void testWordsStrings() {
        String input = "Hi, my name is John";
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi");
        expectedOutput.add("my");
        expectedOutput.add("name");
        expectedOutput.add("is");
        expectedOutput.add("John");
        
        assertEquals(expectedOutput, humaneval.correct.WORDS_STRINGS.words_strings(input));
    }
}