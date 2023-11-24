package humaneval;

import org.junit.Test;
import java.util.*;

public class FILTER_BY_PREFIXTest {
    @Test
    public void testFilterByPrefix() {
        List<String> strings = new ArrayList<>();
        strings.add("test1");
        strings.add("test2");
        strings.add("other");
        String prefix = "test";

        List<String> result = humaneval.correct.FILTER_BY_PREFIX.filter_by_prefix(strings, prefix);

        assertEquals(2, result.size());
        assertTrue(result.contains("test1"));
        assertTrue(result.contains("test2"));
    }
}