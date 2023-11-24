
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.FIB4;
import java.util.ArrayList;

public class FIB4Test {
    @Test
    public void fib4TEST() {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int expected = FIB4.fib4(i);
            assertEquals(expected, result.get(i));
        }
    }
}
