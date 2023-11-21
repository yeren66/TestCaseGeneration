package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class LONGESTTest {
    @Test
    public void testLongest_emptyList() {
        List<String> strings = Arrays.asList("");
        assertNull(LONGEST.longest(strings));
    }
    
    @Test
    public void testLongest_singleElement() {
        List<String> strings = Arrays.asList("a");
        assertEquals("a", humaneval.correct.LONGEST.longest(strings));
    }
    
    @Test
    public void testLongest_multipleElements() {
        List<String> strings = Arrays.asList("a", "ab", "abc");
        assertEquals("abc", humaneval.correct.LONGEST.longest(strings));
    }
}
