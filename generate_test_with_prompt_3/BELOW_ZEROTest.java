    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class BELOW_ZEROTest {
    @Test
    public void below_zeroTEST() {
        List<Integer> operations = new ArrayList<>();
        operations.add(1);
        operations.add(-3);
        operations.add(5);
        assertTrue(BELOW_ZERO.below_zero(operations));
    }
}