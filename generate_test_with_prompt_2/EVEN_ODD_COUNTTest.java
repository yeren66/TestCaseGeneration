package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EVEN_ODD_COUNTTest {
    @Test
    public void testEVEN_ODD_COUNT() {
        int[] result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(-12);
        assertArrayEquals(new int[] {1, 1}, result);
        
        result = humaneval.correct.EVEN_ODD_COUNT.even_odd_count(123);
        assertArrayEquals(new int[] {1, 2}, result);
    }
}