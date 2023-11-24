package humaneval;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class DERIVATIVETest {
    @Test
    public void testDerivative() {
        List<Integer> xs = new ArrayList<Integer>();
        xs.add(3);
        xs.add(1);
        xs.add(2);
        xs.add(4);
        xs.add(5);
        
        List<Integer> result = humaneval.correct.DERIVATIVE.derivative(xs);
        assertEquals(4, result.size());
        assertTrue(result.contains(1));
        assertTrue(result.contains(4));
        assertTrue(result.contains(12));
        assertTrue(result.contains(20));
    }
}