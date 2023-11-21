package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TRIANGLE_AREATest {
    
    @Test
    public void testTriangleArea() {
        double a = 5;
        double h = 3;
        
        assertEquals(7.5, humaneval.correct.TRIANGLE_AREA.triangle_area(a, h), 0.01);
    }
}