package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class TRITest {
    @Test
    public void triTEST() {
        int[] result = TRI.tri(3);
        assertArrayEquals(new int[]{1, 3, 2, 8}, result);
    }
}