
package humaneval;

import static org.junit.Assert.*;

public class TRIANGLE_AREATest {
    @Test
    public void testTriangleArea() {
        double a = 5;
        double h = 3;
        assertEquals(TRIANGLE_AREA.triangle_area(a, h), 7.5);
    }
}
