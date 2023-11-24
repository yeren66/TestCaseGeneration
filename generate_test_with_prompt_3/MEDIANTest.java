
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class MEDIANTest {
    @Test
    public void medianTEST() {
        int[] input = new int[]{3, 1, 2, 4, 5};
        double expectedOutput = 3.0;
        double actualOutput = MEDIAN.median(input);
        assertEquals(expectedOutput, actualOutput, 0.0);
    }
}