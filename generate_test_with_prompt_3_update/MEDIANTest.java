
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.MEDIAN;
import java.util.Arrays;

public class MEDIANTest {
    @Test
    public void medianTEST() {
        int[] list1 = new int[]{3, 1, 2, 4, 5};
        assertEquals(MEDIAN.median(list1), 3);

        int[] list2 = new int[]{-10, 4, 6, 1000, 10, 20};
        assertEquals(MEDIAN.median(list2), 15.0);
    }
}
