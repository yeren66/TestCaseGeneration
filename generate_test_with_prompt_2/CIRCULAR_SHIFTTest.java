package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CIRCULAR_SHIFTTest {
    @Test
    public void testCircularShift() {
        assertEquals("21", humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 1));
        assertEquals("12", humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 2));
    }
}