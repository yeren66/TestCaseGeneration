package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIZZ_BUZZ;

public class FIZZ_BUZZTest {
    @Test
    public void fizz_buzzTEST() {
        int expected = 0;
        int actual = FIZZ_BUZZ.fizz_buzz(5);
        assertEquals("Result of fizz_buzz method should be 0 for input 5", expected, actual);
    }
}