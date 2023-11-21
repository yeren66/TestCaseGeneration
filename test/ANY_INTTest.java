package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class ANY_INTTest {
    
    @Test
    public void testAnyInt() {
        assertTrue(ANY_INT.any_int(5, 2, 7));
        assertFalse(ANY_INT.any_int(3, 2, 2));
        assertTrue(ANY_INT.any_int(3, -2, 1));
    }
    
}
