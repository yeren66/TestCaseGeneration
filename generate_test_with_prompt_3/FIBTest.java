
package humaneval;

import static org.junit.Assert.*;

import org.junit.Test;

public class FIBTest {
    @Test
    public void fibTEST() {
        assertEquals(55, FIB.fib(10));
        assertEquals(1, FIB.fib(1));
        assertEquals(21, FIB.fib(8));
    }
}
