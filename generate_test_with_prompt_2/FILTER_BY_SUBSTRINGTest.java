package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class FILTER_BY_SUBSTRINGTest {
    @Test
    public void humaneval.correct.FILTER_BY_SUBSTRING.filter_by_substring_test() {
        List<String> strings = new ArrayList<>();
        strings.add("Hello World");
        strings.add("Goodbye");
        strings.add("Hola");

        String substring = "World";

        List<String> result = humaneval.correct.FILTER_BY_SUBSTRING.filter_by_substring(strings, substring);

        assertEquals(1, result.size());
        assertEquals("Hello World", result.get(0));
    }
}