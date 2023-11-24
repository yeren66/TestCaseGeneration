package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.HOW_MANY_TIMES;

public class HOW_MANY_TIMESTest {
    @Test
    public void how_many_timesTEST() {
        // Test case 1: Empty string and empty substring
        assertEquals(0, HOW_MANY_TIMES.how_many_times("", ""));

        // Test case 2: Non-empty string and empty substring
        assertEquals(0, HOW_MANY_TIMES.how_many_times("hello", ""));

        // Test case 3: Empty string and non-empty substring
        assertEquals(0, HOW_MANY_TIMES.how_many_times("", "hello"));

        // Test case 4: Single occurrence of substring in string
        assertEquals(1, HOW_MANY_TIMES.how_many_times("hello world", "world"));

        // Test case 5: Multiple occurrences of substring in string
        assertEquals(2, HOW_MANY_TIMES.how_many_times("hello world world", "world"));
    }
}
