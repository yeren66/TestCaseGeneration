package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class FIND_ZEROTest {
    @Test
    public void testFindZero() {
        List<Double> xs = Arrays.asList(0.5, 2.3);
        assertEquals(-1., FIND_ZERO.find_zero(xs), 1e-6);
    }
    
    @Test
    public void testFindZeroWithNonZeroStart() {
        List<Double> xs = Arrays.asList(0.5, 2.3);
        assertEquals(-0.75, FIND_ZERO.find_zero(xs), 1e-6);
    }
    
    @Test
    public void testFindZeroWithNonZeroEnd() {
        List<Double> xs = Arrays.asList(0.5, 2.3);
        assertEquals(-0.75, FIND_ZERO.find_zero(xs), 1e-6);
    }
    
    @Test
    public void testFindZeroWithNegativePolynomial() {
        List<Double> xs = Arrays.asList(-1., -2.3);
        assertEquals(0., FIND_ZERO.find_zero(xs), 1e-6);
    }
    
    @Test
    public void testFindZeroWithPositivePolynomial() {
        List<Double> xs = Arrays.asList(1., 2.3);
        assertEquals(-0.75, FIND_ZERO.find_zero(xs), 1e-6);
    }
}
