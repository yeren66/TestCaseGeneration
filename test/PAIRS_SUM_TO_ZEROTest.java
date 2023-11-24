
package humaneval;
import java.util.List;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PAIRS_SUM_TO_ZERO;
import java.util.List;

public class PAIRS_SUM_TO_ZEROTest {
    @Test
    public void pairs_sum_to_zeroTEST() {
        List<Integer> list1 = Arrays.asList(2, -2);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list1));

        List<Integer> list2 = Arrays.asList(-2, 2);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list2));

        List<Integer> list3 = Arrays.asList(-1, -1);
        assertFalse(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list3));
    }
}
