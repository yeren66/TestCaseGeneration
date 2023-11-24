package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TRIANGLE_AREA_2Test {
    @Test
    public void triangle_area_2TEST() {
        double result = TRIANGLE_AREA_2.triangle_area_2(3, 4, 5);
        BigDecimal bd = new BigDecimal(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        assertEquals("6.00", bd.toString());
    }
}