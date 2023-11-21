package humaneval;

import static org.junit.Assert.*;

public class ALL_PREFIXESTest {
    @Test
    public void testEmptyString() {
        String input = "";
        List<String> expectedResult = Collections.emptyList();
        
        assertEquals(expectedResult, humaneval.correct.ALL_PREFIXES.all_prefixes(input));
    }
    
    @Test
    public void testSingleCharString() {
        String input = "a";
        List<String> expectedResult = Collections.singletonList("a");
        
        assertEquals(expectedResult, humaneval.correct.ALL_PREFIXES.all_prefixes(input));
    }
    
    @Test
    public void testLongerString() {
        String input = "hello";
        List<String> expectedResult = Arrays.asList("h", "he", "hel", "hell", "hello");
        
        assertEquals(expectedResult, humaneval.correct.ALL_PREFIXES.all_prefixes(input));
    }
    
    @Test
    public void testDuplicateString() {
        String input = "aaaa";
        List<String> expectedResult = Arrays.asList("a", "aa", "aaa", "aaaa");
        
        assertEquals(expectedResult, humaneval.correct.ALL_PREFIXES.all_prefixes(input));
    }
}