
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class MULTIPLYTest {
    @Test
    public void multiplyTEST() {
        assertEquals(16, MULTIPLY.multiply(148, 412));
        assertEquals(72, MULTIPLY.multiply(19, 28));
        assertEquals(0, MULTIPLY.multiply(2020, 1851));
        assertEquals(20, MULTIPLY.multiply(14, -15));
    }
}
