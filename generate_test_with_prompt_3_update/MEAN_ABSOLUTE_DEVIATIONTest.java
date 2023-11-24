
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MEAN_ABSOLUTE_DEVIATION;
import java.util.List;

public class MEAN_ABSOLUTE_DEVIATIONTest {
    @Test
    public void mean_absolute_deviationTEST() {
        List<Double> numbers = Arrays.asList(2., 4., 6., 8., 10.);
        double expectedDeviation = 3.;
        
        assertEquals(expectedDeviation, MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(numbers), 0.01);
    }
}