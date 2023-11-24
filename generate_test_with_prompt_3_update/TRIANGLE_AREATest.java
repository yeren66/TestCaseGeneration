package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.TRIANGLE_AREA;

public class TRIANGLE_AREATest {
    @Test
    public void triangle_areaTEST() {
        double actual = TRIANGLE_AREA.triangle_area(5, 3);
        assertEquals("Incorrect area of a triangle", 7.5, actual, 0.01);
    }
}