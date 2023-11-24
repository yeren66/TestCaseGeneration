package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class FIZZ_BUZZTest {
    @Test
    public void fizz_buzzTEST() {
        assertEquals(FIZZ_BUZZ.fizz_buzz(10), 2); // Tests that the method returns 2 when given input 10
        assertEquals(FIZZ_BUZZ.fizz_buzz(13), 1); // Tests that the method returns 1 when given input 13
        assertEquals(FIZZ_BUZZ.fizz_buzz(45), 0); // Tests that the method returns 0 when given input 45
    }
}