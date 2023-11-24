
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIBFIBTest {
    @Test
    public void fibfibTEST() {
        assertEquals(0, FIBFIB.fibfib(1));
        assertEquals(4, FIBFIB.fibfib(5));
        assertEquals(24, FIBFIB.fibfib(8));
    }
}
