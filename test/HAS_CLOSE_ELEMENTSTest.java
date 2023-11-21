package humaneval;

import org.junit.Test;
import java.util.List;

public class HAS_CLOSE_ELEMENTSTest {
    @Test
    public void testHasCloseElements_returnsTrueWhenDistanceLessThanThreshold() {
        List<Double> numbers = List.of(1.0, 2.0);
        double threshold = 0.5;
        
        assertEquals(true, humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(numbers, threshold));
    }
    
    @Test
    public void testHasCloseElements_returnsFalseWhenDistanceGreaterThanThreshold() {
        List<Double> numbers = List.of(1.0, 2.0);
        double threshold = 0.25;
        
        assertEquals(false, humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(numbers, threshold));
    }
    
    @Test
    public void testHasCloseElements_returnsTrueWhenThresholdZero() {
        List<Double> numbers = List.of(1.0, 2.0);
        double threshold = 0;
        
        assertEquals(true, humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(numbers, threshold));
    }
    
    @Test
    public void testHasCloseElements_returnsFalseWhenThresholdGreaterThanDistance() {
        List<Double> numbers = List.of(1.0, 2.0);
        double threshold = 0.75;
        
        assertEquals(false, humaneval.correct.HAS_CLOSE_ELEMENTS.has_close_elements(numbers, threshold));
    }
}