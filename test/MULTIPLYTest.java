
package humaneval;

import static org.junit.Assert.*;

public class MULTIPLYTest {
    @Test
    public void testMultiply() {
        assertEquals(16, humaneval.correct.MULTIPLY.multiply(148, 412));
        assertEquals(72, humaneval.correct.MULTIPLY.multiply(19, 28));
        assertEquals(0, humaneval.correct.MULTIPLY.multiply(2020, 1851));
        assertEquals(20, humaneval.correct.MULTIPLY.multiply(14, -15));
    }
}