package humaneval;
import org.junit.Test;
import static org.junit.Assert.*;

public class WILL_IT_FLYTest {
    @Test
    public void testWillItFly() {
        int[] q = new int[]{1, 2};
        int w = 5;
        assertFalse(WILL_IT_FLY.will_it_fly(q, w));
        
        q = new int[]{3, 2, 3};
        w = 1;
        assertFalse(WILL_IT_FLY.will_it_fly(q, w));
        
        q = new int[]{3, 2, 3};
        w = 9;
        assertTrue(WILL_IT_FLY.will_it_fly(q, w));
        
        q = new int[]{3};
        w = 5;
        assertTrue(WILL_IT_FLY.will_it_fly(q, w));
    }
}