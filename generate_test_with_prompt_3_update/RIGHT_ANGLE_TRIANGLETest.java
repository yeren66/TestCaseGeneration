
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.RIGHT_ANGLE_TRIANGLE;

public class RIGHT_ANGLE_TRIANGLETest {
    @Test
    public void right_angle_triangleTEST() {
        assertTrue(RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 4, 5));
        assertFalse(RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 2, 3));
    }
}
