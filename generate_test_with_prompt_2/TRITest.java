
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TRITest {
    @Test
    public void testTri() {
        int[] expected = new int[] {1, 3, 2, 8};
        assertArrayEquals(expected, humaneval.correct.TRI.tri(3));
    }
}
