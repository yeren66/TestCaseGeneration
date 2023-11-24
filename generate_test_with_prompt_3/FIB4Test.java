
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class FIB4Test {
    @Test
    public void fib4TEST() {
        ArrayList<Integer> result = new ArrayList<Integer>(); 
        result.add(0);
        result.add(0);
        result.add(2);
        result.add(0);

        for (int i = 4; i < 15 + 1; i += 1) {
            result.add(
                result.get(0) + result.get(1) + result.get(2) + result.get(3)
            );
            result.remove(0);
        }
        
        assertEquals("Should return 4th FIB4 number", 8, result.get(5));
    }
}