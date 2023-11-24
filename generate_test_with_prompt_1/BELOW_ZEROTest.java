package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class BELOW_ZEROTest {
    @Test
    public void testBelowZero() {
        List<Integer> operations = Arrays.asList(1, -2, 3);
        assertTrue(BELOW_ZERO.below_zero(operations)); // total balance is below zero after the first operation
    }
    
    @Test
    public void testAboveZero() {
        List<Integer> operations = Arrays.asList(1, 2, -3);
        assertFalse(BELOW_ZERO.below_zero(operations)); // total balance is above zero after all operations
    }
    
    @Test
    public void testZeroBalance() {
        List<Integer> operations = Arrays.asList(1, -1);
        assertFalse(BELOW_ZERO.below_zero(operations)); // total balance is zero after all operations
    }
}
