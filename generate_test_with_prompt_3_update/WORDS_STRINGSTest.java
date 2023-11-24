package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.WORDS_STRINGS;
import java.util.ArrayList;

public class WORDS_STRINGSTest {
    @Test
    public void words_stringsTEST() {
        String input = "Hi, my name is John";
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi");
        expectedOutput.add("my");
        expectedOutput.add("name");
        expectedOutput.add("is");
        expectedOutput.add("John");

        assertEquals(expectedOutput, WORDS_STRINGS.words_strings(input));
    }
}