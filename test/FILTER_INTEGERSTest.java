package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class FILTER_INTEGERSTest {
    @Test
    public void testFilterIntegers() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add("test");
        values.add(2);
        values.add(null);
        
        List<Integer> result = humaneval.correct.FILTER_INTEGERS.filter_integers(values);
        assertEquals(2, result.size());
    }
    
    @Test
    public void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<>();
        
        List<Integer> result = humaneval.correct.FILTER_INTEGERS.filter_integers(values);
        assertTrue(result.isEmpty());
    }
    
    @Test
    public void testFilterIntegersWithNonIntegers() {
        List<Object> values = new ArrayList<>();
        values.add("test");
        
        List<Integer> result = humaneval.correct.FILTER_INTEGERS.filter_integers(values);
        assertTrue(result.isEmpty());
    }
}