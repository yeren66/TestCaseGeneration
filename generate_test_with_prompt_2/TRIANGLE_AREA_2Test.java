package humaneval;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TRIANGLE_AREA_2Test {
    @Test
    void testTriangleArea_Valid() {
        assertEquals(6.00, humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(3, 4, 5));
    }
    
    @Test
    void testTriangleArea_Invalid() {
        assertEquals(-1, humaneval.correct.TRIANGLE_AREA_2.triangle_area_2(1, 2, 10));
    }
}