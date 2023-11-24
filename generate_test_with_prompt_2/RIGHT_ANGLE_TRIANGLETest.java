package humaneval;
import static org.junit.Assert.*;

import org.junit.Test;

public class RIGHT_ANGLE_TRIANGLETest {
    @Test
    public void testRightAngleTriangle() {
        assertTrue(RIGHT_ANGLE_TRIANGLE.right_angle_triangle(3, 4, 5));
        assertFalse(RIGHT_ANGLE_TRIANGLE.right_angle_triangle(1, 2, 3));
    }
}