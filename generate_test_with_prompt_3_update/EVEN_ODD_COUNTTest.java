package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.EVEN_ODD_COUNT;

public class EVEN_ODD_COUNTTest {
    @Test
    public void even_odd_countTEST() {
        int[] result = EVEN_ODD_COUNT.even_odd_count(-12);
        assertEquals(result[0], 1);
        assertEquals(result[1], 1);
        
        result = EVEN_ODD_COUNT.even_odd_count(123);
        assertEquals(result[0], 1);
        assertEquals(result[1], 2);
    }
}