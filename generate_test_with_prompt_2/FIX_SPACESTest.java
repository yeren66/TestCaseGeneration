
package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FIX_SPACESTest {
    @Test
    void testFixSpaces() {
        String input = "Example";
        assertEquals("Example", humaneval.correct.FIX_SPACES.fix_spaces(input));
        
        input = "Example 1";
        assertEquals("Example_1", humaneval.correct.FIX_SPACES.fix_spaces(input));
        
        input = " Example 2";
        assertEquals("_Example_2", humaneval.correct.FIX_SPACES.fix_spaces(input));
        
        input = " Example   3";
        assertEquals("_Example-3", humaneval.correct.FIX_SPACES.fix_spaces(input));
    }
}
