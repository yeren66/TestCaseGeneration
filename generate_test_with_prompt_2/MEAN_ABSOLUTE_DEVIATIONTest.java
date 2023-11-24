package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class MEAN_ABSOLUTE_DEVIATIONTest {
    @Test
    public void testMeanAbsoluteDeviation() {
        List<Double> numbers = Arrays.asList(1., 2., 3., 4., 5.);
        double expectedResult = 1.; // the correct result for this input
        
        double actualResult = humaneval.correct.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(numbers);
        
        assertEquals(expectedResult, actualResult, 0.00001);
    }
}
