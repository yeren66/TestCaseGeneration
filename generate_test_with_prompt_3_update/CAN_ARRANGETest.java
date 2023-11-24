
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.CAN_ARRANGE;

public class CAN_ARRANGETest {
    @Test
    public void can_arrangeTEST() {
        int[] arr = new int[]{1, 2, 4, 3, 5};
        assertEquals(3, CAN_ARRANGE.can_arrange(arr));

        arr = new int[]{1, 2, 3};
        assertEquals(-1, CAN_ARRANGE.can_arrange(arr));
    }
}