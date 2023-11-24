package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class RESCALE_TO_UNITTest {
    @Test
    public void rescale_to_unitTEST() {
        double[] input = new double[] {1, 2, 3};
        double[] expectedOutput = new double[] {0.5, 0.67, 0.84}; // calculated using the formula (x - min) / (max - min)
        double[] actualOutput = RESCALE_TO_UNIT.rescale_to_unit(input);
        assertArrayEquals(expectedOutput, actualOutput, 1e-6); // allow for a margin of error of 1e-6
    }
}
