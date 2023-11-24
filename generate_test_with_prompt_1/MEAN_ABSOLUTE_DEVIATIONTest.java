package humaneval;
import org.junit.Test;
import java.util.*;
public class MEAN_ABSOLUTE_DEVIATIONTest {
    @Test
    public void test() {
        List<Double> numbers = new ArrayList<>();
        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(3.0);
        double mean = 14.67;
        assertEquals(mean, humaneval.correct.MEAN_ABSOLUTE_DEVIATION.mean_absolute_deviation(numbers), 0.01);
    }
}