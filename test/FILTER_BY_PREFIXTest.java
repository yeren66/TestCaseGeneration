package humaneval;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FILTER_BY_PREFIXTest {
    @ParameterizedTest
    @ValueSource(strings = {"", "a", "ab"})
    void testFilterByPrefixEmptyList(String prefix) {
        List<String> input = new ArrayList<>();
        List<String> expectedOutput = new ArrayList<>();
        Assertions.assertEquals(expectedOutput, humaneval.correct.FILTER_BY_PREFIX.filter_by_prefix(input, prefix));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"", "a", "ab"})
    void testFilterByPrefixSingleItemList(String prefix) {
        List<String> input = new ArrayList<>();
        input.add("abc");
        List<String> expectedOutput = new ArrayList<>();
        if (prefix.isEmpty() || input.get(0).startsWith(prefix)) {
            expectedOutput.add(input.get(0));
        }
        Assertions.assertEquals(expectedOutput, humaneval.correct.FILTER_BY_PREFIX.filter_by_prefix(input, prefix));
    }
    
    @ParameterizedTest
    @ValueSource(strings = {"", "a", "ab"})
    void testFilterByPrefixMultipleItemsList(String prefix) {
        List<String> input = new ArrayList<>();
        input.add("abc");
        input.add("def");
        input.add("ghi");
        List<String> expectedOutput = new ArrayList<>();
        for (String s : input) {
            if (prefix.isEmpty() || s.startsWith(prefix)) {
                expectedOutput.add(s);
            }
        }
        Assertions.assertEquals(expectedOutput, humaneval.correct.FILTER_BY_PREFIX.filter_by_prefix(input, prefix));
    }
}