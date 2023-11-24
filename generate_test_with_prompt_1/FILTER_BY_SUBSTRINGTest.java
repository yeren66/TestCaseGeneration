package humaneval;
import static org.junit.jupiter.api.Assertions.*;

public class FILTER_BY_SUBSTRINGTest {
    @Test
    public void testFilterBySubstring() {
        List<String> input = new ArrayList<>();
        input.add("apple");
        input.add("banana");
        input.add("cherry");
        input.add("date");
        input.add("elephant");
        
        String substring = "a";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("apple");
        expectedOutput.add("banana");
        expectedOutput.add("cherry");
        expectedOutput.add("date");
        
        List<String> actualOutput = humaneval.correct.FILTER_BY_SUBSTRING.filter_by_substring(input, substring);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testFilterBySubstringEmptyInput() {
        List<String> input = new ArrayList<>();
        
        String substring = "a";
        List<String> expectedOutput = new ArrayList<>();
        
        List<String> actualOutput = humaneval.correct.FILTER_BY_SUBSTRING.filter_by_substring(input, substring);
        
        assertEquals(expectedOutput, actualOutput);
    }
    
    @Test
    public void testFilterBySubstringNullInput() {
        List<String> input = null;
        
        String substring = "a";
        List<String> expectedOutput = new ArrayList<>();
        
        List<String> actualOutput = humaneval.correct.FILTER_BY_SUBSTRING.filter_by_substring(input, substring);
        
        assertEquals(expectedOutput, actualOutput);
    }
}