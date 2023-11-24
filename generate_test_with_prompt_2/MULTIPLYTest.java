package humaneval;
import static org.junit.Assert.*;

public class MULTIPLYTest {
    @Test
    public void testMultiply() {
        int result = humaneval.correct.MULTIPLY.multiply(148, 412);
        assertEquals(16, result);

        result = humaneval.correct.MULTIPLY.multiply(19, 28);
        assertEquals(72, result);

        result = humaneval.correct.MULTIPLY.multiply(2020, 1851);
        assertEquals(0, result);

        result = humaneval.correct.MULTIPLY.multiply(-14, -15);
        assertEquals(20, result);
    }
}