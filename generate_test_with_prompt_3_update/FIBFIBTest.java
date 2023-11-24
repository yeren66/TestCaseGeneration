
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIBFIB;

public class FIBFIBTest {
    @Test
    public void fibfibTEST() {
        // Test case 1: n = 0
        int result1 = FIBFIB.fibfib(0);
        assertEquals(result1, 0);

        // Test case 2: n = 1
        int result2 = FIBFIB.fibfib(1);
        assertEquals(result2, 0);

        // Test case 3: n = 2
        int result3 = FIBFIB.fibfib(2);
        assertEquals(result3, 1);

        // Test case 4: n = 5
        int result4 = FIBFIB.fibfib(5);
        assertEquals(result4, 4);

        // Test case 5: n = 8
        int result5 = FIBFIB.fibfib(8);
        assertEquals(result5, 24);
    }
}
