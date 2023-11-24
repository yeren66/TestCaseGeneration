
package humaneval;

import org.junit.Test;
import static org.junit.Assert.*;

public class IS_BOREDTest {
    @Test
    public void is_boredTEST() {
        assertEquals(0, IS_BORED.is_bored("Hello world"));
        assertEquals(1, IS_BORED.is_bored("The sky is blue. The sun is shining. I love this weather"));
        assertEquals(2, IS_BORED.is_bored("I am feeling bored. Me too!"));
    }
}
