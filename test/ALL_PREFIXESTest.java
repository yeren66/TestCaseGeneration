package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ALL_PREFIXES;
import java.util.ArrayList;
import java.util.List;

public class ALL_PREFIXESTest {
    @Test
    public void all_prefixesTEST() {
        // Call the method with a valid input string
        String input = "hello";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("h");
        expectedOutput.add("he");
        expectedOutput.add("hel");
        expectedOutput.add("hell");
        expectedOutput.add("hello");
        
        // Make the assertion
        assertEquals(expectedOutput, ALL_PREFIXES.all_prefixes(input));
    }
}