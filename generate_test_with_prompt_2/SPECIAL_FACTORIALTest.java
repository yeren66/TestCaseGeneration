package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SPECIAL_FACTORIALTest {
    @Test
    public void testSpecialFactorial() {
        long result = humaneval.correct.SPECIAL_FACTORIAL.special_factorial(4);
        assertEquals(288, result);
    }
}