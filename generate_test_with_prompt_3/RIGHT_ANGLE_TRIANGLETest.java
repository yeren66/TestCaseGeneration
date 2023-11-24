
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class RIGHT_ANGLE_TRIANGLETest {
    @Test
    public void right_angle_triangleTEST() {
        // Test case 1: all sides are equal
        assertEquals(true, RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 3, 3));
        
        // Test case 2: two sides are equal and one is double the other
        assertEquals(true, RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 6, 9));
        
        // Test case 3: all sides are unequal and form a right-angled triangle
        assertEquals(true, RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 4, 5));
        
        // Test case 4: all sides are unequal but do not form a right-angled triangle
        assertEquals(false, RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 2, 3));
    }
}
