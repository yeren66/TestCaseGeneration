package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class MEAN_ABSOLUTE_DEVIATIONTest {
    @Test
    public void mean_absolute_deviationTEST() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        double deviation = MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(numbers);
        assertEquals(0.66666667, deviation, 1e-6);
    }
}