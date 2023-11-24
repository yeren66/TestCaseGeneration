package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SUM_TO_N;

public class SUM_TO_NTest {
    @Test
    public void sum_to_nTEST() {
        assertEquals(30, SUM_TO_N.sum_to_n(5)); // This is the first test case for the function
        assertEquals(100, SUM_TO_N.sum_to_n(10)); // This is the second test case for the function
        assertEquals(55, SUM_TO_N.sum_to_n(10)); // This is the third test case for the function
    }
}