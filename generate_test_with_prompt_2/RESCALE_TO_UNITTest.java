package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class RESCALE_TO_UNITTest {
    @Test
    public void testRescaleToUnit() {
        double[] numbers = new double[]{1, 2, 3, 4, 5};
        double[] expected = new double[]{0.2, 0.4, 0.6, 0.8, 1.0};
        assertArrayEquals(expected, humaneval.correct.RESCALE_TO_UNIT.rescale_to_unit(numbers), 0.0001);
    }
}
