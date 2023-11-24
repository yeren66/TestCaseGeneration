package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FIND_ZEROTest {
    @Test
    public void testPoly() {
        List<Double> xs = Arrays.asList(1.0, 2.0, 3.0);
        
        // Test with positive x
        assertEquals(1.0 + 4.0 * 2.0 * Math.pow(x, 2) + 9.0 * Math.pow(x, 3), humaneval.correct.FIND_ZERO.poly(xs, 2.0));
        
        // Test with negative x
        assertEquals(-1.0 - 4.0 * 2.0 * Math.pow(x, 2) - 9.0 * Math.pow(x, 3), humaneval.correct.FIND_ZERO.poly(xs, -2.0));
    }
}