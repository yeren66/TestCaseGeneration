package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.TRIANGLE_AREA_2;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TRIANGLE_AREA_2Test {
    @Test
    public void triangle_area_2TEST() {
        // Test case 1: Valid triangle
        double a = 3.0, b = 4.0, c = 5.0;
        BigDecimal expectedResult = BigDecimal.valueOf(6.0);
        assertEquals(expectedResult, TRIANGLE_AREA_2.triangle_area_2(a, b, c));
        
        // Test case 2: Invalid triangle
        a = 1.0; b = 2.0; c = 10.0;
        expectedResult = BigDecimal.valueOf(-1);
        assertEquals(expectedResult, TRIANGLE_AREA_2.triangle_area_2(a, b, c));
        
        // Test case 3: Valid triangle with rounding
        a = 0.5; b = 0.6; c = 0.7;
        expectedResult = BigDecimal.valueOf(0.5);
        assertEquals(expectedResult, TRIANGLE_AREA_2.triangle_area_2(a, b, c));
    }
}