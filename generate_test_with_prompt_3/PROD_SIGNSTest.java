    
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class PROD_SIGNSTest {
    @Test
    public void prod_signsTEST() {
        int[] arr = new int[]{1, 2, -3};
        assertEquals(prod_signs(arr), -9);
        
        arr = new int[]{0, 1};
        assertEquals(prod_signs(arr), 0);
        
        arr = new int[]{};
        assertEquals(prod_signs(arr), -10);
    }
}