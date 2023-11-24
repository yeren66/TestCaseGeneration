
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class PLUCKTest {
    @Test
    public void pluckTEST() {
        int[] arr = new int[]{1, 2, 3};
        assertArrayEquals(new int[]{2, 1}, PLUCK.pluck(arr));
    }
}