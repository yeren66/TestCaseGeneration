package humaneval;

import static org.junit.Assert.*;
import java.util.List;

public class ALL_PREFIXESTest {
    @Test
    public void testAllPrefixes() {
        String input = "hello";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("h");
        expectedResult.add("he");
        expectedResult.add("hel");
        expectedResult.add("hell");
        expectedResult.add("hello");
        
        assertEquals(expectedResult, humaneval.correct.ALL_PREFIXES.all_prefixes(input));
    }
}
