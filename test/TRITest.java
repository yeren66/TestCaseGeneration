
package humaneval;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.TRI;

public class TRITest {
    @Test
    public void triTEST() {
        int[] expected = new int[]{1, 3, 2, 8};
        assertArrayEquals(expected, TRI.tri(3));
    }
}