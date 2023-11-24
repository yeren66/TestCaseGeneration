package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class LARGEST_DIVISORTest {
    @Test
    public void largest_divisorTEST() {
        assertEquals(1, LARGEST_DIVISOR.largest_divisor(1));
        assertEquals(2, LARGEST_DIVISOR.largest_divisor(2));
        assertEquals(4, LARGEST_DIVISOR.largest_divisor(8));
        assertEquals(16, LARGEST_DIVISOR.largest_divisor(32));
    }
}
