
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ADD_EVEN_AT_ODD;

public class ADD_EVEN_AT_ODDTest {
    @Test
    public void add_even_at_oddTEST() {
        int[] input = new int[]{4, 2, 6, 7};
        assertEquals(ADD_EVEN_AT_ODD.add_even_at_odd(input), 2);
    }
}