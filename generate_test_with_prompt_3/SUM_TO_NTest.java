package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SUM_TO_NTest {
    @Test
    public void sum_to_nTEST() {
        assertEquals(15, SUM_TO_N.sum_to_n(5));
        assertEquals(5050, SUM_TO_N.sum_to_n(100));
        assertEquals(465, SUM_TO_N.sum_to_n(30));
        assertEquals(1, SUM_TO_N.sum_to_n(1));
    }
}