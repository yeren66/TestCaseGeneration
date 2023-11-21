package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class DERIVATIVETest {
    @Test
    public void testDerivative() {
        List<Integer> xs = Arrays.asList(3, 1, 2, 4, 5);
        List<Integer> expectedResult = Arrays.asList(1, 4, 12, 20);
        assertEquals(expectedResult, humaneval.correct.DERIVATIVE.derivative(xs));
    }
    
    @Test
    public void testDerivativeWithDifferentSize() {
        List<Integer> xs = Arrays.asList(1, 2, 3);
        List<Integer> expectedResult = Arrays.asList(2, 6);
        assertEquals(expectedResult, humaneval.correct.DERIVATIVE.derivative(xs));
    }
}
