package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class FIZZ_BUZZTest {
    @Test
    public void testFizzBuzz() {
        assertEquals(0, humaneval.correct.FIZZ_BUZZ.fizz_buzz(1));
        assertEquals(1, humaneval.correct.FIZZ_BUZZ.fizz_buzz(2));
        assertEquals(3, humaneval.correct.FIZZ_BUZZ.fizz_buzz(4));
        assertEquals(5, humaneval.correct.FIZZ_BUZZ.fizz_buzz(6));
    }
}