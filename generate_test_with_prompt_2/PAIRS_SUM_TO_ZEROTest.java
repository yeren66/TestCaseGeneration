package humaneval;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PAIRS_SUM_TO_ZEROTest {
    @Test
    public void testPairsSumToZero() {
        List<Integer> list = List.of(1, 2, -3, 4, -5);
        assertTrue(PAIRS_SUM_TO_ZERO.pairs_sum_to_zero(list));
    }
}