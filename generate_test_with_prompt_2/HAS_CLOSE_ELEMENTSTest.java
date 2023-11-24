package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class HAS_CLOSE_ELEMENTSTest {
    @Test
    public void testHasCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double threshold = 1.5;
        assertTrue(HAS_CLOSE_ELEMENTS.hasCloseElements(numbers, threshold));
    }
    
    @Test
    public void testHasNoCloseElements() {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        double threshold = 0.5;
        assertFalse(HAS_CLOSE_ELEMENTS.hasCloseElements(numbers, threshold));
    }
}