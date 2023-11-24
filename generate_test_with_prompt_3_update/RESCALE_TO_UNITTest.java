
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.RESCALE_TO_UNIT;

public class RESCALE_TO_UNITTest {
    @Test
    public void rescale_to_unitTEST() {
        double[] numbers = new double[]{1, 2, 3};
        double[] expectedResult = new double[]{0.5, 1, 1.5};
        assertArrayEquals(expectedResult, RESCALE_TO_UNIT.rescale_to_unit(numbers), 0.0);
    }
}
