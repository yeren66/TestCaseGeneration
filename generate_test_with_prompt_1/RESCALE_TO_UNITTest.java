
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class RESCALE_TO_UNITTest {
    @Test
    public void testRescaleToUnit() {
        double[] input = new double[]{1, 2, 3, 4, 5};
        double[] expectedOutput = new double[]{0.2, 0.4, 0.6, 0.8, 1.0};
        
        double[] actualOutput = RESCALE_TO_UNIT.rescaleToUnit(input);
        
        assertArrayEquals(expectedOutput, actualOutput, 0.01);
    }
}
