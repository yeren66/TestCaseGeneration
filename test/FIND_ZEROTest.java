
package humaneval;
import java.util.List;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIND_ZERO;
import java.util.List;

public class FIND_ZEROTest {
    @Test
    public void polyTEST() {
        List<Double> xs = new ArrayList<>();
        double x = 1.0;
        
        // expected result: 3
        assertEquals(FIND_ZERO.poly(xs, x), 3);
    }
}
