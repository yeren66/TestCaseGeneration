package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TRIPLES_SUM_TO_ZEROTest {
    @Test
    public void triples_sum_to_zeroTEST() {
        int[] numbers = new int[] {1, 3, -2, 1};
        assertTrue(TRIPLES_SUM_TO_ZERO.triples_sum_to_zero(numbers));
    }
}