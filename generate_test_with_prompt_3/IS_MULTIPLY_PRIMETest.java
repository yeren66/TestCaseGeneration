package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class IS_MULTIPLY_PRIMETest {
    @Test
    public void is_multiply_primeTEST() {
        assertTrue(IS_MULTIPLY_PRIME.is_multiply_prime(30));
        assertFalse(IS_MULTIPLY_PRIME.is_multiply_prime(31));
    }
}