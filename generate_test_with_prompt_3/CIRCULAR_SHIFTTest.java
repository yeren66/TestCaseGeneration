
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class CIRCULAR_SHIFTTest {
    @Test
    public void circular_shiftTEST() {
        assertEquals("21", CIRCULAR_SHIFT.circular_shift(12, 1));
        assertEquals("12", CIRCULAR_SHIFT.circular_shift(12, 2));
    }
}
