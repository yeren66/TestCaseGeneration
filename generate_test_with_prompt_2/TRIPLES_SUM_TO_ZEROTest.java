package humaneval;
import static org.junit.Assert.*;
import org.junit.Test;

public class TRIPLES_SUM_TO_ZEROTest {
    @Test
    public void testTriplesSumToZero() {
        int[] numbers1 = { 1, 3, -2, 1 }; // True
        assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers1));
        
        int[] numbers2 = { 1, 3, 5, 0 }; // False
        assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers2));
        
        int[] numbers3 = { 1, 2, 3, 7 }; // False
        assertFalse(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers3));
        
        int[] numbers4 = { 2, 4, -5, 3, 9, 7 }; // True
        assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers4));
    }
}