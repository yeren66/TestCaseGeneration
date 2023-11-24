    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class PAIRS_SUM_TO_ZEROTest {
    @Test
    public void pairs_sum_to_zeroTEST() {
        List<Integer> list = new ArrayList<>();
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
        
        list.add(-1);
        list.add(0);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
        
        list = new ArrayList<>();
        list.add(2);
        list.add(-3);
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
}