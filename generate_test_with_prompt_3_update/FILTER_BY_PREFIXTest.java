
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FILTER_BY_PREFIX;
import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_PREFIXTest {
    @Test
    public void filter_by_prefixTEST() {
        List<String> testStrings = new ArrayList<>();
        testStrings.add("ABC");
        testStrings.add("XYZ");
        testStrings.add("123");

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("ABC");

        assertEquals(expectedResult, FILTER_BY_PREFIX.filter_by_prefix(testStrings, "A"));
    }
}