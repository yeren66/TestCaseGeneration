
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;

public class SMALLEST_CHANGETest {
    @Test
    public void smallest_changeTEST() {
        int[] arr = new int[]{1,2,3,5,4,7,9,6};
        assertEquals(4, SMALLEST_CHANGE.smallest_change(arr));
    }
}
