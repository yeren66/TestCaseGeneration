package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.HAS_CLOSE_ELEMENTS;
import java.util.List;

public class HAS_CLOSE_ELEMENTSTest {
    @Test
    public void has_close_elementsTEST() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double threshold = 1.5;
        boolean result = HAS_CLOSE_ELEMENTS.has_close_elements(numbers, threshold);
        assertTrue(result);
    }
}