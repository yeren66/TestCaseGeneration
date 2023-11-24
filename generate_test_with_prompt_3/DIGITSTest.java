
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DIGITSTest {
    @Test
    public void digitsTEST() {
        assertEquals(1, DIGITS.digits(1)); // 1 has only one digit, which is odd
        assertEquals(0, DIGITS.digits(4)); // 4 has only even digits
        assertEquals(15, DIGITS.digits(235)); // 235 has three odd digits: 2, 3, and 5
    }
}
