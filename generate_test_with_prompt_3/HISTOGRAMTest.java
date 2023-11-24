
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;

public class HISTOGRAMTest {
    @Test
    public void histogramTEST() {
        // Test case 1: empty input
        assertEquals(new HashMap<>(), HISTOGRAM.histogram(""));

        // Test case 2: single letter input
        assertEquals(new HashMap<Character, Integer>() {{ put('a', 1); }}, HISTOGRAM.histogram("a"));

        // Test case 3: multiple letters with the same count
        assertEquals(new HashMap<Character, Integer>() {{ put('a', 2); put('b', 2); }}, HISTOGRAM.histogram("a b"));

        // Test case 4: multiple letters with different counts
        assertEquals(new HashMap<Character, Integer>() {{ put('a', 1); put('b', 2); put('c', 3); }}, HISTOGRAM.histogram("a b c"));
    }
}
