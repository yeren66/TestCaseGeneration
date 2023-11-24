    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class WILL_IT_FLYTest {
    @Test
    public void will_it_flyTEST() {
        assertFalse(WILL_IT_FLY.will_it_fly(new int[] {1, 2}, 5));
        assertFalse(WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 1));
        assertTrue(WILL_IT_FLY.will_it_fly(new int[] {3, 2, 3}, 9));
        assertTrue(WILL_IT_FLY.will_it_fly(new int[] {3}, 5));
    }
}