package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class FIX_SPACESTest {
    @Test
    public void fix_spacesTEST() {
        assertEquals("Example", FIX_SPACES.fix_spaces("Example")); // case 1
        assertEquals("Example_1", FIX_SPACES.fix_spaces("Example 1")); // case 2
        assertEquals("_Example_2", FIX_SPACES.fix_spaces(" Example 2")); // case 3
        assertEquals("_Example-3", FIX_SPACES.fix_spaces(" Example   3")); // case 4
    }
}