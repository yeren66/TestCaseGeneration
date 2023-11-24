package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class ALL_PREFIXESTest {
    @Test
    public void all_prefixesTEST() {
        String input = "hello";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("h");
        expectedOutput.add("he");
        expectedOutput.add("hel");
        expectedOutput.add("hell");
        expectedOutput.add("hello");

        assertEquals(expectedOutput, ALL_PREFIXES.all_prefixes(input));
    }
}