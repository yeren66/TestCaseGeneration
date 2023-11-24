
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SIMPLIFY;

public class SIMPLIFYTest {
    @Test
    public void simplifyTEST() {
        assertTrue(SIMPLIFY.simplify("1/5", "5/1"));
        assertFalse(SIMPLIFY.simplify("1/6", "2/1"));
        assertFalse(SIMPLIFY.simplify("7/10", "10/2"));
    }
}