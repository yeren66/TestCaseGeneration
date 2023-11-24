
package humaneval.correct;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ISCUBE;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ISCUBETest {
    @Test
    public void iscudeTEST() {
        int a = 100;
        boolean expected = true;
        assertEquals(expected, ISCUBE.iscube(a));
        
        a = -27;
        expected = false;
        assertEquals(expected, ISCUBE.iscube(a));
        
        a = 1000;
        expected = true;
        assertEquals(expected, ISCUBE.iscube(a));
    }
}
