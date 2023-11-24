
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.PROD_SIGNS;

public class PROD_SIGNSTest {
    @Test
    public void prod_signsTEST() {
        int[] arr = {1, 2, 2, -4};
        assertEquals(-9, PROD_SIGNS.prod_signs(arr));

        arr = new int[]{0, 1};
        assertEquals(0, PROD_SIGNS.prod_signs(arr));

        arr = new int[]{};
        assertEquals(-10, PROD_SIGNS.prod_signs(arr));
    }
}