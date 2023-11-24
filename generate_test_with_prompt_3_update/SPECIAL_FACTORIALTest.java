
package humaneval.correct;
import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.SPECIAL_FACTORIAL;
public class SPECIAL_FACTORIALTest {
    @Test
    public void special_factorialTEST() {
        long result = SPECIAL_FACTORIAL.special_factorial(4);
        assertEquals("Brazilian Factorial should be equal to 288", 288, result);
    }
}