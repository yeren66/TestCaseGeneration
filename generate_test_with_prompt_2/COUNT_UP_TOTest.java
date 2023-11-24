package humaneval;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class COUNT_UP_TOTest {
    
    @Test
    public void testCountUpTo() {
        List<Integer> result = humaneval.correct.COUNT_UP_TO.count_up_to(5);
        assertEquals(2, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 3)));
        
        result = humaneval.correct.COUNT_UP_TO.count_up_to(11);
        assertEquals(4, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 3, 5, 7)));
        
        result = humaneval.correct.COUNT_UP_TO.count_up_to(0);
        assertEquals(0, result.size());
        
        result = humaneval.correct.COUNT_UP_TO.count_up_to(20);
        assertEquals(8, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)));
        
        result = humaneval.correct.COUNT_UP_TO.count_up_to(1);
        assertEquals(0, result.size());
        
        result = humaneval.correct.COUNT_UP_TO.count_up_to(18);
        assertEquals(6, result.size());
        assertTrue(result.containsAll(Arrays.asList(2, 3, 5, 7, 11, 13)));
    }
}
