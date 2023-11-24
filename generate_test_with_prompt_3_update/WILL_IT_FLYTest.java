
package humaneval.correct;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class WILL_IT_FLYTest {
    @Test
    public void will_it_flyTEST() {
        int[] q1 = new int[]{1, 2};
        boolean expected1 = false;
        Assert.assertEquals(WILL_IT_FLY.will_it_fly(q1, 5), expected1);
        
        int[] q2 = new int[]{3, 2, 3};
        boolean expected2 = false;
        Assert.assertEquals(WILL_IT_FLY.will_it_fly(q2, 1), expected2);
        
        int[] q3 = new int[]{3, 2, 3};
        boolean expected3 = true;
        Assert.assertEquals(WILL_IT_FLY.will_it_fly(q3, 9), expected3);
    }
}