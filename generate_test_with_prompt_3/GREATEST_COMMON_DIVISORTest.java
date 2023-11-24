
package humaneval;    

import org.junit.Test;
import static org.junit.Assert.*;

public class GREATEST_COMMON_DIVISORTest {
    @Test
    public void greatest_common_divisorTEST() {
        assertEquals(1, GREATEST_COMMON_DIVISOR.greatest_common_divisor(3, 6)); // 3 and 6 have a gcd of 1
        assertEquals(2, GREATEST_COMMON_DIVISOR.greatest_common_divisor(4, 8)); // 4 and 8 have a gcd of 2
        assertEquals(5, GREATEST_COMMON_DIVISOR.greatest_common_divisor(10, 25)); // 10 and 25 have a gcd of 5
    }
}
