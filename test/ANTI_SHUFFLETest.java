
package humaneval;
import java.util.Arrays;
import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.*;
import humaneval.correct.ANTI_SHUFFLE;
import java.util.Arrays;

public class ANTI_SHUFFLETest {
    @Test
    public void anti_shuffleTEST() {
        String input = "hello";
        String expectedOutput = "ehllo";
        assertEquals(expectedOutput, ANTI_SHUFFLE.anti_shuffle(input));
    }
}
