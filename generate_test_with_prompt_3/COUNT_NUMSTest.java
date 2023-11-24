
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class COUNT_NUMSTest {
    @Test
    public void count_numsTEST() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12345);
        arr.add(-67890);
        assertEquals(2, COUNT_NUMS.count_nums(arr));
    }
}
