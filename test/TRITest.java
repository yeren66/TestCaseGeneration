package humaneval;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class TRITest {
    
    @Test
    public void testTri() {
        int[] sequence = humaneval.correct.TRI.tri(3);
        assertEquals("Wrong length of sequence", 4, sequence.length);
        assertArrayEquals("Wrong values in sequence", new int[]{1, 3, 2, 8}, sequence);
    }
}
