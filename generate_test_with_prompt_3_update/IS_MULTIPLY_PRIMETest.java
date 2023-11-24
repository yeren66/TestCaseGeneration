
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.IS_MULTIPLY_PRIME;

public class IS_MULTIPLY_PRIMETest {
    @Test
    public void is_primeTEST() {
        int a = 120;
        boolean result = IS_MULTIPLY_PRIME.is_multiply_prime(a);
        assertTrue(result);
    }
}