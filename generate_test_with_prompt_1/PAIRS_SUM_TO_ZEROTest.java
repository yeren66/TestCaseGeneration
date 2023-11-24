package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class PAIRS_SUM_TO_ZEROTest {
    @Test
    public void testEmptyList() {
        List<Integer> list = new ArrayList<>();
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
    
    @Test
    public void testSingleElement() {
        List<Integer> list = Arrays.asList(-1);
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
    
    @Test
    public void testTwoDistinctElementsSumToZero() {
        List<Integer> list = Arrays.asList(-1, 1);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
    
    @Test
    public void testTwoDistinctElementsSumToNonZero() {
        List<Integer> list = Arrays.asList(-1, 2);
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
    
    @Test
    public void testTwoDuplicateElements() {
        List<Integer> list = Arrays.asList(-1, -1);
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
    
    @Test
    public void testMultipleElementsSumToZero() {
        List<Integer> list = Arrays.asList(-1, 0, 1);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
}
