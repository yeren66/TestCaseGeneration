    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class ROUNDED_AVGTest {
    @Test
    public void rounded_avgTEST() {
        assertEquals("11", ROUNDED_AVG.rounded_avg(1, 5));
        assertEquals("-1", ROUNDED_AVG.rounded_avg(7, 5));
    }
}