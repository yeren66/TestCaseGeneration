
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class X_OR_YTest {
    @Test
    public void x_or_yTEST() {
        int result = X_OR_Y.x_or_y(7, 34, 12);
        assertEquals(34, result);
        
        int result = X_OR_Y.x_or_y(15, 8, 5);
        assertEquals(5, result);
    }
}
