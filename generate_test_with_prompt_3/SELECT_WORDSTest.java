package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class SELECT_WORDSTest {
    @Test
    public void select_wordsTEST() {
        String input = "Mary had a little lamb";
        int n = 4;
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("little");
        
        ArrayList<String> actualOutput = SELECT_WORDS.select_words(input, n);
        
        assertEquals(expectedOutput, actualOutput);
    }
}