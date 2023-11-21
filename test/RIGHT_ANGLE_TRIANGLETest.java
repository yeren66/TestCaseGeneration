package humaneval;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RIGHT_ANGLE_TRIANGLETest {
    @Test
    public void testRightAngleTriangle() {
        assertTrue(right_angle_triangle(3, 4, 5));
        assertFalse(right_angle_triangle(1, 2, 3));
    }
}
