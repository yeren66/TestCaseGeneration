
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class FILTER_BY_SUBSTRINGTest {
    @Test
    public void filter_by_substringTEST() {
        // Create a list of strings to test with
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        
        // Create a list of expected results
        List<String> expectedResults = new ArrayList<>();
        expectedResults.add("apple");
        expectedResults.add("banana");
        expectedResults.add("cherry");
        expectedResults.add("date");
        
        // Call the filter_by_substring method and check that it returns the expected results
        List<String> actualResults = FILTER_BY_SUBSTRING.filter_by_substring(strings, "a");
        assertEquals(expectedResults, actualResults);
    }
}
