package humaneval;
import static org.junit.Assert.*;

public class SPECIAL_FACTORIALTest {
    @Test
    public void testSpecialFactorial() {
        assertEquals(1, humaneval.correct.SPECIAL_FACTORIAL.special_factorial(0));
        assertEquals(120, humaneval.correct.SPECIAL_FACTORIAL.special_factorial(5));
        assertEquals(3628800, humaneval.correct.SPECIAL_FACTORIAL.special_factorial(9));
    }
}