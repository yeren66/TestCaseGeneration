
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ROUNDED_AVG;

public class ROUNDED_AVGTest {
    @Test
    public void rounded_avgTEST() {
        int n = 1, m = 5;
        String result = ROUNDED_AVG.rounded_avg(n, m);
        assertEquals("11", result);
    }
}
