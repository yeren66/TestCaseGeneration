package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIX_SPACES;

public class FIX_SPACESTest {
    @Test
    public void fix_spacesTEST() {
        // Test cases for empty string input
        assertEquals("", FIX_SPACES.fix_spaces(""));

        // Test cases for single space input
        assertEquals("Example", FIX_SPACES.fix_spaces("Example"));
        assertEquals("Example_1", FIX_SPACES.fix_spaces("Example 1"));
        assertEquals("_Example_2", FIX_SPACES.fix_spaces(" Example 2"));
        assertEquals("_Example-3", FIX_SPACES.fix_spaces(" Example   3"));
    }
}