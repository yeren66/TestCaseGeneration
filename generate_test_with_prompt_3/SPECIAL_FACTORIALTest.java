package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class SPECIAL_FACTORIALTest {
    @Test
    public void special_factorialTEST() {
        assertEquals(1, SPECIAL_FACTORIAL.special_factorial(0));
        assertEquals(1, SPECIAL_FACTORIAL.special_factorial(1));
        assertEquals(288, SPECIAL_FACTORIAL.special_factorial(4));
    }
}