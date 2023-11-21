
package humaneval;

import org.junit.Assert;
import org.junit.Test;

public class CIRCULAR_SHIFTTest {
    @Test
    public void testCircularShift() {
        Assert.assertEquals("21", humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 1));
        Assert.assertEquals("12", humaneval.correct.CIRCULAR_SHIFT.circular_shift(12, 2));
        Assert.assertEquals("1234567890", humaneval.correct.CIRCULAR_SHIFT.circular_shift(1234567890, 10));
        Assert.assertEquals("1234567890", humaneval.correct.CIRCULAR_SHIFT.circular_shift(1234567890, 20));
    }
}
