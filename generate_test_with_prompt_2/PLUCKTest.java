package humaneval;

import static org.junit.Assert.*;
import org.junit.Test;

public class PLUCKTest {
    @Test
    public void testPluck() {
        int[] arr = new int[]{4, 2, 3};
        int[] result = humaneval.correct.PLUCK.pluck(arr);
        assertArrayEquals(new int[]{2, 1}, result);
    }
}
